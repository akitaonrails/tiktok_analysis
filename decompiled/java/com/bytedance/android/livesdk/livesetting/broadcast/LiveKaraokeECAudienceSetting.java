package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_ec_audience")
public final class LiveKaraokeECAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final LiveKaraokeECAudienceSetting INSTANCE = new LiveKaraokeECAudienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_karaoke_ec_audience", DEFAULT);
    }
}
