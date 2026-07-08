package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_layout_id_config")
public final class LiveCoHostLayoutIdConfigSetting {
    public static final LiveCoHostLayoutIdConfigSetting INSTANCE = new LiveCoHostLayoutIdConfigSetting();
    public static final LiveCoHostLayoutIdConfig DEFAULT = new LiveCoHostLayoutIdConfig("2001", "200101", "2002", "200201", "2010", "2011", "2101", "2102", "2103", "2104", "2200", new LiveCoHostScreenShareLayoutIdConfig(null, null, 3, null));

    public final LiveCoHostLayoutIdConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCoHostLayoutIdConfig liveCoHostLayoutIdConfig = DEFAULT;
        LiveCoHostLayoutIdConfig liveCoHostLayoutIdConfig2 = (LiveCoHostLayoutIdConfig) settingsManager.getValueSafely("live_cohost_layout_id_config", liveCoHostLayoutIdConfig);
        return liveCoHostLayoutIdConfig2 != null ? liveCoHostLayoutIdConfig2 : liveCoHostLayoutIdConfig;
    }

    public final String getNormal(boolean z) {
        String str = getValue().normal;
        if (z && LinkMicRtcRatioOptimize.isAnchorEnable()) {
            return getValue().normalCrop;
        }
        if (!LinkMicRtcRatioOptimize.isAudienceEnable()) {
            return str;
        }
        return getValue().normalExpandCrop;
    }

    public final String getNormalExpand(boolean z) {
        String str = getValue().normalExpand;
        if (z && LinkMicRtcRatioOptimize.isAnchorEnable()) {
            return getValue().normalExpandCrop;
        }
        if (!LinkMicRtcRatioOptimize.isAudienceEnable()) {
            return str;
        }
        return getValue().normalExpandCrop;
    }
}
