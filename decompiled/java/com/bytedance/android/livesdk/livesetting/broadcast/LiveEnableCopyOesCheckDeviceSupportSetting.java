package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_copy_oes_process_check_device_support")
public final class LiveEnableCopyOesCheckDeviceSupportSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableCopyOesCheckDeviceSupportSetting INSTANCE = new LiveEnableCopyOesCheckDeviceSupportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_copy_oes_process_check_device_support", DEFAULT);
    }
}
