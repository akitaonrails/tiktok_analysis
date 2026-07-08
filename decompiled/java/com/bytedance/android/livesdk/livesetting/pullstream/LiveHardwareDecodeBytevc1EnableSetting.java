package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_hardware_decode_bytevc1_enable")
public final class LiveHardwareDecodeBytevc1EnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeBytevc1EnableSetting INSTANCE = new LiveHardwareDecodeBytevc1EnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_hardware_decode_bytevc1_enable", DEFAULT);
    }
}
