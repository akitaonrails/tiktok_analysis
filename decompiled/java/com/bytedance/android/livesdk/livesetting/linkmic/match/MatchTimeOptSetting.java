package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_time_opt_settings")
public final class MatchTimeOptSetting {
    public static final MatchTimeOptSetting INSTANCE = new MatchTimeOptSetting();
    public static final Config DEFAULT = new Config(false, false, 2000);

    private final Config getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_match_time_opt_settings", config);
        return config2 != null ? config2 : config;
    }

    public final boolean getAnchorStartTimeOptEnabled() {
        return getConfig().live_match_start_time_anchor_opt;
    }

    public final boolean getAudienceStartTimeOptEnabled() {
        return getConfig().live_match_start_time_opt;
    }

    public final long getMatchHalfRttLimit() {
        return getConfig().live_match_half_rtt_limit;
    }
}
