package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_anchor_stream_stall_report_config")
public final class AnchorStreamJankABSetting {
    public static final AnchorStreamJankABSetting INSTANCE = new AnchorStreamJankABSetting();
    public static final LiveConfig DEFAULT = new LiveConfig(false, 3, 4, 80);

    public static final boolean enableNormalRoom() {
        return INSTANCE.getSettingValue().enableNormalRoom;
    }

    public static final int maxAccumulateTimes() {
        return INSTANCE.getSettingValue().maxAccumulateTimes;
    }

    public static final int stallThreshold() {
        return INSTANCE.getSettingValue().stallThreshold;
    }

    public static final int windowPercent() {
        return INSTANCE.getSettingValue().windowPercent;
    }

    public final LiveConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveConfig liveConfig = DEFAULT;
        LiveConfig liveConfig2 = (LiveConfig) settingsManager.getValueSafely("live_anchor_stream_stall_report_config", liveConfig);
        return liveConfig2 != null ? liveConfig2 : liveConfig;
    }
}
