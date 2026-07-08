package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("public_screen_buffer_sample_rate")
public final class LivePublicScreenBufferSampleRateSetting {
    public static final double DEFAULT = 0.0d;
    public static final LivePublicScreenBufferSampleRateSetting INSTANCE = new LivePublicScreenBufferSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("public_screen_buffer_sample_rate", DEFAULT);
    }
}
