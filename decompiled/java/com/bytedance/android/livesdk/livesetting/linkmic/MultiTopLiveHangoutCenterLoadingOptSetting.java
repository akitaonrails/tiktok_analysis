package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_hangout_center_loading_opt")
public final class MultiTopLiveHangoutCenterLoadingOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveHangoutCenterLoadingOptSetting INSTANCE = new MultiTopLiveHangoutCenterLoadingOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_hangout_center_loading_opt", DEFAULT);
    }
}
