package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_fyp_easier_exit")
public final class LiveEasyExitCardSetting {
    public static final LiveEasyExitCardSetting INSTANCE = new LiveEasyExitCardSetting();
    public static final LiveEasyExitCardConfig DEFAULT = new LiveEasyExitCardConfig(false, -1, -1, 0, new LiveEasyExitCardDepthConfig(false, 0, 0, 0), false, false);

    public final LiveEasyExitCardConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveEasyExitCardConfig liveEasyExitCardConfig = DEFAULT;
        LiveEasyExitCardConfig liveEasyExitCardConfig2 = (LiveEasyExitCardConfig) settingsManager.getValueSafely("live_fyp_easier_exit", liveEasyExitCardConfig);
        return liveEasyExitCardConfig2 != null ? liveEasyExitCardConfig2 : liveEasyExitCardConfig;
    }

    public final int getDepthWatchDurationN() {
        return getConfig().depthConfig.watchDurationN * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public final int getDepthWatchDurationSingle() {
        return getConfig().depthConfig.watchDurationSingle * LSPassThroughRecordSizeConfig.DEFAULT;
    }
}
