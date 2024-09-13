package cn.stevei5mc.deathinfo;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.Server;

public class DeathInfo extends PluginBase {
    private static DeathInfo instance;

    public static DeathInfo getInstance() {
        return instance;
    }

    public void onLoad() {
        instance = this;
    }

    public void onEnable() {
        Server.getInstance().getScheduler().scheduleDelayedTask(this, () -> {
            this.getLogger().warning("§c警告! §c本插件为免费且开源的一款插件，如果你是付费获取到的那么你就被骗了");
            this.getLogger().info("§a开源链接和使用方法: §bhttps://github.com/stevei5mc/DeathInfo");
        },20);
    }

    public void onDisable() {
        this.getLogger().info("已停止运行，感谢你的使用");
    }
}