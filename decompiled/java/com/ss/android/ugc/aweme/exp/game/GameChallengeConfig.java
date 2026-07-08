package com.ss.android.ugc.aweme.exp.game;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class GameChallengeConfig implements Serializable {

    @C09CT("im_game_challenge_days_between_each_interval")
    public final int bannerDaysBetweenEachInterval;

    @C09CT("im_game_challenge_bottom_banner_display_delay")
    public final int bannerDisplayDelay;

    @C09CT("im_game_challenge_interval_show_count")
    public final int bannerIntervalShowCount;

    @C09CT("im_game_challenge_maximum_number_of_intervals")
    public final int bannerMaxNumIntervals;

    @C09CT("im_game_challenge_feature_flag")
    public final boolean enableGameChallenge;

    @C09CT("im_game_challenge_freq_version_code")
    public final int freqVersionCode;

    @C09CT("im_game_challenge_max_gameplay_duration")
    public final int maxGamePlayDuration;

    public GameChallengeConfig() {
        this(true, 3, 5, 5, 3, 0, 60);
    }

    public GameChallengeConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        this.enableGameChallenge = z;
        this.bannerIntervalShowCount = i;
        this.bannerDaysBetweenEachInterval = i2;
        this.bannerMaxNumIntervals = i3;
        this.bannerDisplayDelay = i4;
        this.freqVersionCode = i5;
        this.maxGamePlayDuration = i6;
    }
}
