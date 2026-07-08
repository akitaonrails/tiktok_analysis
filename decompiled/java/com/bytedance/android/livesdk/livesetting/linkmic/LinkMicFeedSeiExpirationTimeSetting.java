package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_feed_sei_expiration_time")
public final class LinkMicFeedSeiExpirationTimeSetting {
    public static final int DEFAULT = 3000;
    public static final LinkMicFeedSeiExpirationTimeSetting INSTANCE = new LinkMicFeedSeiExpirationTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_feed_sei_expiration_time", DEFAULT);
    }
}
