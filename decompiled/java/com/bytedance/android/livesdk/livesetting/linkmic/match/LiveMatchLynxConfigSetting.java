package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_lynx_container_config")
public final class LiveMatchLynxConfigSetting {
    public static final LiveMatchLynxConfigSetting INSTANCE = new LiveMatchLynxConfigSetting();
    public static final LiveMatchLynxConfig DEFAULT = new LiveMatchLynxConfig("", 1, true, 0, 15000);

    public final boolean isLynxEnabledInCompetition() {
        return false;
    }

    private final LiveMatchLynxConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchLynxConfig liveMatchLynxConfig = DEFAULT;
        LiveMatchLynxConfig liveMatchLynxConfig2 = (LiveMatchLynxConfig) settingsManager.getValueSafely("live_match_lynx_container_config", liveMatchLynxConfig);
        return liveMatchLynxConfig2 != null ? liveMatchLynxConfig2 : liveMatchLynxConfig;
    }

    public final long createDeferEnterRoomWindowMs() {
        long j = getConfig().createDeferEnterRoomWindowMs;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public final long createDelayMs() {
        long j = getConfig().createDelayMs;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public final boolean loadLynxContainer() {
        return schemaV2().length() > 0;
    }

    public final String schemaV2() {
        return getConfig().schemaV2;
    }

    public final boolean startAnimationEnable() {
        return getConfig().startAnimationEnable == 1;
    }

    public final boolean useSparkLite() {
        return getConfig().useSparkLite;
    }
}
