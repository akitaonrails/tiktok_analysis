package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_re_preload_opt")
public final class MultiTopLiveRePreloadOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveRePreloadOptSetting INSTANCE = new MultiTopLiveRePreloadOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_re_preload_opt", DEFAULT);
    }
}
