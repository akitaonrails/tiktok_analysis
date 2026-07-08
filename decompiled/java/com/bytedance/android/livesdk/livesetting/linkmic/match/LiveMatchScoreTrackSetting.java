package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_score_track_config")
public final class LiveMatchScoreTrackSetting {
    public static final LiveMatchScoreTrackSetting INSTANCE = new LiveMatchScoreTrackSetting();
    public static final LiveMatchScoreTrackConfig DEFAULT = new LiveMatchScoreTrackConfig(true, false, 30.0f);

    private final LiveMatchScoreTrackConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchScoreTrackConfig liveMatchScoreTrackConfig = DEFAULT;
        LiveMatchScoreTrackConfig liveMatchScoreTrackConfig2 = (LiveMatchScoreTrackConfig) settingsManager.getValueSafely("live_match_score_track_config", liveMatchScoreTrackConfig);
        return liveMatchScoreTrackConfig2 != null ? liveMatchScoreTrackConfig2 : liveMatchScoreTrackConfig;
    }

    public final boolean enableTrack() {
        return getConfig().enable_track;
    }

    public final boolean enableTrackNormal() {
        return getConfig().enable_track_normal;
    }

    public final long getPeriodicCheckInterval() {
        return (long) (getConfig().periodic_check_interval * LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
