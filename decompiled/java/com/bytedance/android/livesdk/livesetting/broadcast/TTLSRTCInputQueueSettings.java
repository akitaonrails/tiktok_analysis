package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlivestreamer_rtc_inputqueue")
public final class TTLSRTCInputQueueSettings {
    public static final RTCInputQueueSettings DEFAULT;
    public static final RTCInputQueueSettings setting;
    public static final TTLSRTCInputQueueSettings INSTANCE = new TTLSRTCInputQueueSettings();
    public static final int DEFAULT_QUEUE_SIZE = 2;

    static {
        RTCInputQueueSettings rTCInputQueueSettings = new RTCInputQueueSettings(false, INSTANCE.getDEFAULT_QUEUE_SIZE());
        DEFAULT = rTCInputQueueSettings;
        setting = (RTCInputQueueSettings) SettingsManager.INSTANCE.getValueSafely("ttlivestreamer_rtc_inputqueue", rTCInputQueueSettings);
    }

    public final int getQueueSize() {
        RTCInputQueueSettings rTCInputQueueSettings = setting;
        return rTCInputQueueSettings == null ? DEFAULT_QUEUE_SIZE : rTCInputQueueSettings.queueSize;
    }

    public final boolean isEnable() {
        RTCInputQueueSettings rTCInputQueueSettings = setting;
        if (rTCInputQueueSettings == null) {
            return false;
        }
        return rTCInputQueueSettings.enable;
    }

    public final RTCInputQueueSettings getDEFAULT() {
        return DEFAULT;
    }

    public final int getDEFAULT_QUEUE_SIZE() {
        return DEFAULT_QUEUE_SIZE;
    }

    public final RTCInputQueueSettings getSetting() {
        return setting;
    }
}
