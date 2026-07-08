package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "try_mode_count_down_opt")
public final class TryModeDialogOptSetting {
    public static final TryModeDialogConfig DEFAULT;
    public static final TryModeDialogOptSetting INSTANCE = new TryModeDialogOptSetting();
    public static final TryModeDialogConfig config;

    static {
        TryModeDialogConfig tryModeDialogConfig = new TryModeDialogConfig(0, 30L, 5L, 60L);
        DEFAULT = tryModeDialogConfig;
        config = (TryModeDialogConfig) SettingsManager.INSTANCE.getValueSafely("try_mode_count_down_opt", tryModeDialogConfig);
    }

    public final boolean enable() {
        return config.getValue() != 0;
    }

    public final long motionCheckDuration() {
        return config.getMotionDuration() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long motionCheckStartDuration() {
        TryModeDialogConfig tryModeDialogConfig = config;
        return (tryModeDialogConfig.getShortestDuration() - tryModeDialogConfig.getMotionDuration()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long shortestCheckDuration() {
        return config.getShortestDuration() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long longestCheckDuration() {
        if (enable()) {
            return config.getLongestDuration() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return 60000L;
    }
}
