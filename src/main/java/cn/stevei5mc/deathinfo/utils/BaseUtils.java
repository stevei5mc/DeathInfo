package cn.stevei5mc.deathinfo.utils;

import cn.stevei5mc.deathinfo.DeathInfo;
import cn.nukkit.Player;
import cn.nukkit.Server;

public class BaseUtils {

    private static BaseUtils instance;
    private DeathInfo main = DeathInfo.getInstance();
    public static BaseUtils getInstance() {
        if (instance == null) {
            instance = new BaseUtils();
        }
        return instance;
    }

    public Boolean hasPlayerPermission(Player player,String permission) {
        if (player.hasPermission(permission)) {
            return true;
        }
        return false;
    }

    // 播放消息
    public void playMessage(String message,String deathPlayer) {
        playMessage(message,deathPlayer,false);
    }

    public void playMessage(String message,String deathPlayer,Boolean multiLanguage) {
        if (multiLanguage) {

        } else {
            Server.getInstance().broadcastMessage(message.replace("%1%",deathPlayer));
        }
    }
}