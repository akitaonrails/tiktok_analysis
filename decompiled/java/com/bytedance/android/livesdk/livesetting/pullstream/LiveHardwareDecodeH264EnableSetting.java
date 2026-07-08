package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_hardware_decode_h264_enable")
public final class LiveHardwareDecodeH264EnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeH264EnableSetting INSTANCE = new LiveHardwareDecodeH264EnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_hardware_decode_h264_enable", DEFAULT);
    }
}
