package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_error_handle_delay_time")
public final class MultiGuestLayoutErrorHandleDelayTimeSetting {
    public static final long DEFAULT = 2000;
    public static final MultiGuestLayoutErrorHandleDelayTimeSetting INSTANCE = new MultiGuestLayoutErrorHandleDelayTimeSetting();

    public final long getInMillSecond() {
        return SettingsManager.INSTANCE.getLongValue("multi_guest_layout_error_handle_delay_time", DEFAULT);
    }
}
