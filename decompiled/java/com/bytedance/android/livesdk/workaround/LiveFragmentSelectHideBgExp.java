package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_fragment_select_hide_bg_exp")
public final class LiveFragmentSelectHideBgExp {
    public static final boolean DEFAULT = false;
    public static final LiveFragmentSelectHideBgExp INSTANCE = new LiveFragmentSelectHideBgExp();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fragment_select_hide_bg_exp", DEFAULT);
    }
}
