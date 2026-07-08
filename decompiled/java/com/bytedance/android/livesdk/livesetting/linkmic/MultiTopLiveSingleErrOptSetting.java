package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_single_err_opt")
public final class MultiTopLiveSingleErrOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveSingleErrOptSetting INSTANCE = new MultiTopLiveSingleErrOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_single_err_opt", DEFAULT);
    }
}
