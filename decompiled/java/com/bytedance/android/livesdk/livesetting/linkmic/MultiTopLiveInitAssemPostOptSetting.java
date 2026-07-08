package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_init_assem_post_opt")
public final class MultiTopLiveInitAssemPostOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiTopLiveInitAssemPostOptSetting INSTANCE = new MultiTopLiveInitAssemPostOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_init_assem_post_opt", DEFAULT);
    }
}
