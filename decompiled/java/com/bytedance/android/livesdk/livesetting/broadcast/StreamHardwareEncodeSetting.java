package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("stream_hardware_encode")
public final class StreamHardwareEncodeSetting {
    public static final int DEFAULT = 0;
    public static final StreamHardwareEncodeSetting INSTANCE = new StreamHardwareEncodeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("stream_hardware_encode", DEFAULT);
    }
}
