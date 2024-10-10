package cn.stevei5mc.deathinfo;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.Server;
import cn.lanink.gamecore.utils.Language;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Player;
import cn.nukkit.utils.Config;
import lombok.Getter;
import java.util.*;

public class DeathInfo extends PluginBase {
    private static DeathInfo instance;
    private String defaultLanguage;
    private final HashMap<String, Language> languageMap = new HashMap<>();
    private List<String> languages = Arrays.asList(
        "bg_BG", "cs_CZ","da_DK","de_DE","el_GR","en_GB","en_US","es_ES","es_MX","fi_FI","fr_CA","fr_FR","hu_HU","id_ID","it_IT",
        "ja_JP","ko_KR","nb_NO","nl_NL","pl_PL","pt_BR","pt_PT","ru_RU","sk_SK","sv_SE","tr_TR","uk_UA","zh_CN","zh_TW"
    );
    private List<String> reasonType = Arrays.asList(
        /* "contact", */ "default"/* ,"drowning","fall","fire","hunger","lava","lightning","magma","void" */
    );

    public static DeathInfo getInstance() {
        return instance;
    }

    public void onLoad() {
        instance = this;
        saveConfigFiles();
        loadConfigInfo();
    }

    public void onEnable() {
        if (this.getServer().getPluginManager().getPlugin("MemoriesOfTime-GameCore") != null) {
            loadLanguage();
        } else {
            //不存在作为卸载该插件
            this.getLogger().warning("§c未检测到前置插件§aMemoriesOfTime-GameCore§c，请安装后再试!!!");
            this.getLogger().warning("§b下载地址: §ehttps://motci.cn/job/GameCore/");
        }
        Server.getInstance().getScheduler().scheduleDelayedTask(this, () -> {
            this.getLogger().warning("§c警告! §c本插件为免费且开源的一款插件，如果你是付费获取到的那么你就被骗了");
            this.getLogger().info("§a开源链接和使用方法: §bhttps://github.com/stevei5mc/DeathInfo");
        },20);
    }

    public void onDisable() {
        this.getLogger().info("已停止运行，感谢你的使用");
    }

    public void saveConfigFiles() {
        getDataFolder().mkdirs();
        saveDefaultConfig();
        for(String type: reasonType){
            saveResource("type/"+type+".yml",false);
        }
        for(String lang: languages){
            saveResource("language/"+lang+".yml",false);
        }
    }

    @Getter
    private Config config;
    // @Getter
    // private Config typeContact;
    @Getter
    private Config typeDefault;
    // @Getter
    // private Config typeDrowning;
    // @Getter
    // private Config typeFall;
    // @Getter
    // private Config typeFire;
    // @Getter
    // private Config typeHunger;
    // @Getter
    // private Config typeLava;
    // @Getter
    // private Config typeLightning;
    // @Getter
    // private Config typeVoid;
    // @Getter
    // private Config typeMagma;

    public void loadConfigInfo() {
        this.config = new Config(getDataFolder() + "/config.yml", Config.YAML);
        // this.typeContact = new Config(main.getDataFolder() + "/type/contact.yml", Config.YAML);
        this.typeDefault = new Config(getDataFolder() + "/type/default.yml", Config.YAML);
        // this.typeDrowning = new Config(getDataFolder() + "/type/drowning.yml", Config.YAML);
        // this.typeFall = new Config(getDataFolder() + "/type/fall.yml", Config.YAML);
        // this.typeFire = new Config(getDataFolder() + "/type/fire.yml", Config.YAML);
        // this.typeHunger = new Config(getDataFolder() + "/type/hunger.yml", Config.YAML);
        // this.typeLava = new Config(getDataFolder() + "/type/lava.yml", Config.YAML);
        // this.typeLightning = new Config(.getDataFolder() + "/type/lightning.yml", Config.YAML);
        // this.typeMagma = new Config(getDataFolder() + "/type/magma.yml", Config.YAML);
        // this.typeVoid = new Config(getDataFolder() + "/type/void.yml", Config.YAML);
    }

        //使用(有改动)https://github.com/MemoriesOfTime/CrystalWars/blob/master/src/main/java/cn/lanink/crystalwars/CrystalWars.java
        public void loadLanguage() {
            this.defaultLanguage = this.config.getString("default_language", "zh_CN");
            if (!languages.contains(this.defaultLanguage)) {
                getLogger().error("Language" + this.defaultLanguage + "Not supported, will load Chinese!");
                this.defaultLanguage = "zh_CN";
            }
            for (String language : languages) {
               Config languageConfig = new Config(Config.YAML);
                languageConfig.load(getDataFolder() + "/language/" + language + ".yml");
                this.languageMap.put(language, new Language(languageConfig));
            }
        }
    
        //同上
        public Language getLang() {
            return this.getLang(null);
        }
    
        //同上
        public Language getLang(CommandSender sender) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String playerLanguage = player.getLoginChainData().getLanguageCode();
                if (!this.languageMap.containsKey(playerLanguage)) {
                    playerLanguage = this.defaultLanguage;
                }
                return this.languageMap.get(playerLanguage);
            }
            return this.languageMap.get(this.defaultLanguage);
        }
}