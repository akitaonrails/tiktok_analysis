package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_game_router_config")
public final class LiveMatchGameRouterConfigSetting {
    public static final LiveMatchGameRouterConfigSetting INSTANCE = new LiveMatchGameRouterConfigSetting();
    public static final RouterConfig DEFAULT = new RouterConfig(null, 1, null);

    public final RouterConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RouterConfig routerConfig = DEFAULT;
        RouterConfig routerConfig2 = (RouterConfig) settingsManager.getValueSafely("live_match_game_router_config", routerConfig);
        return routerConfig2 != null ? routerConfig2 : routerConfig;
    }

    public final List<String> getEnterFromList() {
        return getValue().enterFromList;
    }
}
