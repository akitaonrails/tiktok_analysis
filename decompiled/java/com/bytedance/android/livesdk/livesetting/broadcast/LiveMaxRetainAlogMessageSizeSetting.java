package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_max_retain_alog_message_size")
public final class LiveMaxRetainAlogMessageSizeSetting {
    public static final int DEFAULT = 500;
    public static final LiveMaxRetainAlogMessageSizeSetting INSTANCE = new LiveMaxRetainAlogMessageSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_max_retain_alog_message_size", DEFAULT);
    }
}
