package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_async_push_delay_frame_cnt")
public final class TTLSAsyncPushDelayFrameCntSettings {
    public static final int DEFAULT = 0;
    public static final TTLSAsyncPushDelayFrameCntSettings INSTANCE = new TTLSAsyncPushDelayFrameCntSettings();

    public final int enabled() {
        return SettingsManager.INSTANCE.getIntValue("ttlivestreamer_async_push_delay_frame_cnt", DEFAULT);
    }
}
