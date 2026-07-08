package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveMatchEnigmaDelay {
    public static final TypeAdapter ADAPTER;

    @C09CT("score_bar_grow_animation")
    public long ScoreGrowAnimationDelay;

    @C09CT("delay_reveal_result")
    public long delayRevealResult;

    @C09CT("enigma_first_show_animation_delay")
    public long enigmaFirstShowAnimationDelay;

    @C09CT("enigma_left_plus_fade_delay")
    public long enigmaLeftPlusFadeDelay;

    @C09CT("enigma_left_plus_fade_duration")
    public long enigmaLeftPlusFadeDuration;

    @C09CT("enigma_pulse_animation_delay")
    public long enigmaPulseAnimationDelay;

    @C09CT("enigma_video_height_dp")
    public float enigmaVideoHeightDp;

    @C09CT("enigma_video_offset_dp")
    public float enigmaVideoOffsetDp;

    @C09CT("hide_wind_delay")
    public long hideWindDelay;

    @C09CT("mvp_animation_delay")
    public long mvpAnimationDelay;

    @C09CT("opponent_closing_bracket_animation_delay")
    public long opponentClosingBracketAnimationDelay;

    @C09CT("opponent_closing_bracket_animation_duration")
    public long opponentClosingBracketAnimationDuration;

    @C09CT("opponent_score_bar_fade_and_translation_delay")
    public long opponentScoreBarFadeAndTranslationDelay;

    @C09CT("opponent_score_bar_plus_and_x_fade_duration")
    public long opponentScoreBarPlusAndXDuration;

    @C09CT("opponent_score_bar_translation_duration")
    public long opponentScoreBarTranslationDuration;

    @C09CT("opponent_solo_match_translation_delay")
    public long opponentSoloMatchTranslationDelay;

    @C09CT("opponent_solo_score_bar_plus_and_x_delay")
    public long opponentSoloScoreBarPlusAndXDelay;

    @C09CT("opponent_solo_score_fade_in_delay")
    public long opponentSoloScoreFadeInDelay;

    @C09CT("opponent_solo_score_fade_in_duration")
    public long opponentSoloScoreFadeInDuration;

    @C09CT("opponent_solo_score_fade_out_delay")
    public long opponentSoloScoreFadeOutDelay;

    @C09CT("opponent_solo_score_fade_out_duration")
    public long opponentSoloScoreFadeOutDuration;

    @C09CT("scroll_animation_long_duration")
    public long scoreAnimationLongDuration;

    @C09CT("scroll_animation_short_duration")
    public long scoreAnimationShortDuration;

    @C09CT("score_bar_animation_delay")
    public long scoreBarAnimationDelay;

    @C09CT("score_scroll_animation_delay")
    public long scoreScrollAnimationDelay;

    @C09CT("enigma_scroll_score_threshold")
    public long scoreThreshold;

    @C09CT("self_enigma_scaling_duration")
    public long selfEnigmaScalingDuration;

    @C09CT("skip_reveal_animation_delay")
    public long skipRevealAnimationDelay;

    @C09CT("switch_first_rank_delay")
    public long switchFirstRankDelay;

    @C09CT("switch_first_rank_progress_bar_update_delay")
    public long switchFirstRankProgressBarUpdateDelay;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchEnigmaDelay_OptTypeAdapter();
    }

    public LiveMatchEnigmaDelay() {
        this(480L, 4200L, 800L, 800L, 400L, 100L, 2760L, 2760L, 240L, 280L, 800L, 4400L, 4500L, Mp4ScreenVideoLoadTimeout.CONTROL, 5080L, 80L, 600L, 120L, 320L, 440L, 640L, 600L, 44.0f, 82.0f, 4000L, 5400L, 1100L, 180L, 6320L, 500L);
    }

    public LiveMatchEnigmaDelay(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, float f, float f2, long j23, long j24, long j25, long j26, long j28, long j29) {
        this.selfEnigmaScalingDuration = j;
        this.scoreScrollAnimationDelay = j2;
        this.scoreBarAnimationDelay = j3;
        this.scoreAnimationLongDuration = j4;
        this.scoreAnimationShortDuration = j5;
        this.scoreThreshold = j6;
        this.enigmaFirstShowAnimationDelay = j7;
        this.enigmaPulseAnimationDelay = j8;
        this.opponentScoreBarPlusAndXDuration = j9;
        this.opponentScoreBarTranslationDuration = j10;
        this.opponentScoreBarFadeAndTranslationDelay = j11;
        this.ScoreGrowAnimationDelay = j12;
        this.switchFirstRankDelay = j13;
        this.switchFirstRankProgressBarUpdateDelay = j14;
        this.opponentSoloMatchTranslationDelay = j15;
        this.opponentSoloScoreBarPlusAndXDelay = j16;
        this.opponentClosingBracketAnimationDuration = j17;
        this.opponentClosingBracketAnimationDelay = j18;
        this.opponentSoloScoreFadeOutDuration = j19;
        this.opponentSoloScoreFadeOutDelay = j20;
        this.opponentSoloScoreFadeInDuration = j21;
        this.opponentSoloScoreFadeInDelay = j22;
        this.enigmaVideoHeightDp = f;
        this.enigmaVideoOffsetDp = f2;
        this.mvpAnimationDelay = j23;
        this.hideWindDelay = j24;
        this.enigmaLeftPlusFadeDelay = j25;
        this.enigmaLeftPlusFadeDuration = j26;
        this.delayRevealResult = j28;
        this.skipRevealAnimationDelay = j29;
    }
}
