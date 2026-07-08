package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_info_reduce_measure")
public final class LiveMainFrameworkUpdateReduceMeasureSetting {
    public static final LiveMainFrameworkUpdateReduceMeasureSetting INSTANCE = new LiveMainFrameworkUpdateReduceMeasureSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_user_info_reduce_measure", true);

    public final boolean enable() {
        return value;
    }
}
