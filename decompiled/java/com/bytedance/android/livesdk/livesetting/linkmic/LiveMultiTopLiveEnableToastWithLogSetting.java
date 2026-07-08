package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_top_live_enable_toast_with_log")
public final class LiveMultiTopLiveEnableToastWithLogSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMultiTopLiveEnableToastWithLogSetting INSTANCE = new LiveMultiTopLiveEnableToastWithLogSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_top_live_enable_toast_with_log", DEFAULT);
    }
}
