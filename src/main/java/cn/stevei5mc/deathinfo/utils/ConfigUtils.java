package cn.stevei5mc.deathinfo.utils;

import cn.stevei5mc.deathinfo.DeathInfo;
import cn.nukkit.utils.Config;
import lombok.Getter;

public class ConfigUtils {

    private static ConfigUtils instance;
    private DeathInfo main = DeathInfo.getInstance();
    public static ConfigUtils getInstance() {
        if (instance == null) {
            instance = new ConfigUtils();
        }
        return instance;
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



    public void saveConfigFiles() {
        main.getDataFolder().mkdirs();
        main.saveDefaultConfig();
        // main.saveResource("type/contact.yml",false);
        main.saveResource("type/default.yml",false);
        // main.saveResource("type/drowning.yml",false);
        // main.saveResource("type/fall.yml",false);
        // main.saveResource("type/fire.yml",false);
        // main.saveResource("type/hunger.yml",false);
        // main.saveResource("type/lava.yml",false);
        // main.saveResource("type/lightning.yml",false);
        // main.saveResource("type/magma.yml",false);
        // main.saveResource("type/void.yml",false);
    }

    public void loadConfigInfo() {
        this.config = new Config(main.getDataFolder() + "/config.yml", Config.YAML);
        // this.typeContact = new Config(main.getDataFolder() + "/type/contact.yml", Config.YAML);
        this.typeDefault = new Config(main.getDataFolder() + "/type/default.yml", Config.YAML);
        // this.typeDrowning = new Config(main.getDataFolder() + "/type/drowning.yml", Config.YAML);
        // this.typeFall = new Config(main.getDataFolder() + "/type/fall.yml", Config.YAML);
        // this.typeFire = new Config(main.getDataFolder() + "/type/fire.yml", Config.YAML);
        // this.typeHunger = new Config(main.getDataFolder() + "/type/hunger.yml", Config.YAML);
        // this.typeLava = new Config(main.getDataFolder() + "/type/lava.yml", Config.YAML);
        // this.typeLightning = new Config(main.getDataFolder() + "/type/lightning.yml", Config.YAML);
        // this.typeMagma = new Config(main.getDataFolder() + "/type/magma.yml", Config.YAML);
        // this.typeVoid = new Config(main.getDataFolder() + "/type/void.yml", Config.YAML);
    }
}