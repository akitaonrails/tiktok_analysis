package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_top_live_load_more_opt")
public final class LiveSdkMultiTopLiveLoadMoreOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiTopLiveLoadMoreOptSetting INSTANCE = new LiveSdkMultiTopLiveLoadMoreOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_top_live_load_more_opt", DEFAULT);
    }
}
