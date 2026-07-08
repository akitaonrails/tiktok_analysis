package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_float_window_continue_live")
public final class FloatWindowContinueLiveABSetting {
    public static final int DEFAULT = 0;
    public static final FloatWindowContinueLiveABSetting INSTANCE = new FloatWindowContinueLiveABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_float_window_continue_live", DEFAULT) == 1;
    }
}
