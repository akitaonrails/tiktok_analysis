package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_android_cycle_through_filters")
public final class LiveAndroidCycleThroughFiltersSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAndroidCycleThroughFiltersSetting INSTANCE = new LiveAndroidCycleThroughFiltersSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_android_cycle_through_filters", DEFAULT);
    }
}
