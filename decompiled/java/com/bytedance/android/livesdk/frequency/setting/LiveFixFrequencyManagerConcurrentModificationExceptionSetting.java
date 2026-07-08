package com.bytedance.android.livesdk.frequency.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fix_frequency_manager_concurrent_modification_exception")
public final class LiveFixFrequencyManagerConcurrentModificationExceptionSetting {
    public static final LiveFixFrequencyManagerConcurrentModificationExceptionSetting INSTANCE = new LiveFixFrequencyManagerConcurrentModificationExceptionSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFixFrequencyManagerConcurrentModificationExceptionSetting.class);
    }
}
