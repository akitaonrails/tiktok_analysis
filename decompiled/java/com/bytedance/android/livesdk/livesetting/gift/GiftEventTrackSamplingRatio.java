package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_event_track_sampling_ratio")
public final class GiftEventTrackSamplingRatio {
    public static final int DEFAULT = 0;
    public static final GiftEventTrackSamplingRatio INSTANCE = new GiftEventTrackSamplingRatio();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_event_track_sampling_ratio", DEFAULT);
    }
}
