package cn.stevei5mc.deathinfo.utils;

public class ConfigUtils {
    
    public static ConfigUtils getInstance() {
        if (instance == null) {
            instance = new ConfigUtils();
        }
        return instance;
    }

    public void saveConfigFiles() {
    }

    public void loadConfigInfo() {
    }
}