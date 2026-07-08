package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_audience_sei_identify_delay")
public final class LiveMatchAudienceSeiIdentifyDelaySetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchAudienceSeiIdentifyDelaySetting INSTANCE = new LiveMatchAudienceSeiIdentifyDelaySetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_audience_sei_identify_delay", DEFAULT);
    }
}
