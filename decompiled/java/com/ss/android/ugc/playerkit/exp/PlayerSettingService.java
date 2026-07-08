package com.ss.android.ugc.playerkit.exp;

import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerSettingService {
    public static PlayerSettingService instance;
    public static boolean isDebug;

    public Object get(String str, Type type, Object obj, boolean z, boolean z2) {
        return obj;
    }

    public static PlayerSettingService getInstance() {
        PlayerSettingService playerSettingService = instance;
        return playerSettingService == null ? (PlayerSettingService) InjectedConfigManager.getConfig(PlayerSettingService.class) : playerSettingService;
    }

    public static boolean isDebug() {
        if (instance != null) {
            return isDebug;
        }
        PlayerGlobalConfig playerGlobalConfig = (PlayerGlobalConfig) InjectedConfigManager.getConfig(PlayerGlobalConfig.class);
        if (playerGlobalConfig == null) {
            return false;
        }
        return playerGlobalConfig.isDebug();
    }

    public static void init(PlayerSettingService playerSettingService, boolean z) {
        instance = playerSettingService;
        isDebug = z;
    }
}
