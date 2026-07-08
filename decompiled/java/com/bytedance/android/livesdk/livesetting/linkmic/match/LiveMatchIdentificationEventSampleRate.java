package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_match_identification_event_sample_rate")
public final class LiveMatchIdentificationEventSampleRate {
    public static final double DEFAULT = 0.5d;
    public static final LiveMatchIdentificationEventSampleRate INSTANCE = new LiveMatchIdentificationEventSampleRate();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("multi_match_identification_event_sample_rate", DEFAULT);
    }
}
