package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_match_audience_tea_monitor_sample_percentage")
public final class LiveMatchAppLogAudienceSampleRate {
    public static final int DEFAULT = 20;
    public static final LiveMatchAppLogAudienceSampleRate INSTANCE = new LiveMatchAppLogAudienceSampleRate();

    public final int getRate() {
        return SettingsManager.INSTANCE.getIntValue("cohost_match_audience_tea_monitor_sample_percentage", DEFAULT);
    }
}
