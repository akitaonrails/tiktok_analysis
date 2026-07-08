package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "top_live_add_icon_scale_animator_for_exit_live")
public final class TopLiveAddIconScaleAnimatorForExitLiveSetting {
    public static final boolean DEFAULT = false;
    public static final TopLiveAddIconScaleAnimatorForExitLiveSetting INSTANCE = new TopLiveAddIconScaleAnimatorForExitLiveSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("top_live_add_icon_scale_animator_for_exit_live", DEFAULT);
    }
}
