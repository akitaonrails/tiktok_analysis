package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_flex_trace_sampling")
public final class LiveAnchorPingAnchorWsSampleRate {
    public static final LiveAnchorPingAnchorWsSampleRate INSTANCE = new LiveAnchorPingAnchorWsSampleRate();
    public static final float DEFAULT = 0.1f;
    public static float value = SettingsManager.INSTANCE.getFloatValue("live_flex_trace_sampling", 0.1f);

    public final float getValue() {
        return value;
    }

    public final void setValue(float f) {
        value = f;
    }
}
