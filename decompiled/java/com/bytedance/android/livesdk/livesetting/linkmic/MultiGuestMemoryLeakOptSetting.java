package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_memory_leak_opt")
public final class MultiGuestMemoryLeakOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestMemoryLeakOptSetting INSTANCE = new MultiGuestMemoryLeakOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_memory_leak_opt", DEFAULT);
    }
}
