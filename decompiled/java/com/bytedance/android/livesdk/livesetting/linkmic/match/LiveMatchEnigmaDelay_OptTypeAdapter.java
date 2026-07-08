package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveMatchEnigmaDelay_OptTypeAdapter extends TypeAdapter<LiveMatchEnigmaDelay> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchEnigmaDelay read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchEnigmaDelay liveMatchEnigmaDelay = new LiveMatchEnigmaDelay(480L, 4200L, 800L, 800L, 400L, 100L, 2760L, 2760L, 240L, 280L, 800L, 4400L, 4500L, Mp4ScreenVideoLoadTimeout.CONTROL, 5080L, 80L, 600L, 120L, 320L, 440L, 640L, 600L, 44.0f, 82.0f, 4000L, 5400L, 1100L, 180L, 6320L, 500L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1832256451:
                        if (strLJJJJ.equals("opponent_score_bar_translation_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentScoreBarTranslationDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1652757755:
                        if (strLJJJJ.equals("opponent_closing_bracket_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentClosingBracketAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1594243087:
                        if (strLJJJJ.equals("enigma_left_plus_fade_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaLeftPlusFadeDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1283695919:
                        if (strLJJJJ.equals("score_bar_grow_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.ScoreGrowAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1227342555:
                        if (strLJJJJ.equals("opponent_score_bar_fade_and_translation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentScoreBarFadeAndTranslationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1184181072:
                        if (strLJJJJ.equals("mvp_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.mvpAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810359837:
                        if (strLJJJJ.equals("score_scroll_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.scoreScrollAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -649654951:
                        if (strLJJJJ.equals("enigma_first_show_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaFirstShowAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -549845430:
                        if (strLJJJJ.equals("switch_first_rank_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.switchFirstRankDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -319774295:
                        if (strLJJJJ.equals("hide_wind_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.hideWindDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -151880675:
                        if (strLJJJJ.equals("opponent_solo_score_fade_out_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloScoreFadeOutDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 69364385:
                        if (strLJJJJ.equals("opponent_solo_score_fade_in_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloScoreFadeInDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 337494870:
                        if (strLJJJJ.equals("skip_reveal_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.skipRevealAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 407008062:
                        if (strLJJJJ.equals("opponent_score_bar_plus_and_x_fade_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentScoreBarPlusAndXDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 523714458:
                        if (strLJJJJ.equals("opponent_solo_score_fade_out_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloScoreFadeOutDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 562049725:
                        if (strLJJJJ.equals("opponent_solo_match_translation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloMatchTranslationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 705027110:
                        if (strLJJJJ.equals("opponent_solo_score_bar_plus_and_x_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloScoreBarPlusAndXDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 917962480:
                        if (strLJJJJ.equals("enigma_scroll_score_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.scoreThreshold = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 972188688:
                        if (strLJJJJ.equals("enigma_video_offset_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaVideoOffsetDp = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 993501103:
                        if (strLJJJJ.equals("score_bar_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.scoreBarAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1026445066:
                        if (strLJJJJ.equals("scroll_animation_long_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.scoreAnimationLongDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1072497234:
                        if (strLJJJJ.equals("switch_first_rank_progress_bar_update_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.switchFirstRankProgressBarUpdateDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1139441766:
                        if (strLJJJJ.equals("enigma_left_plus_fade_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaLeftPlusFadeDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1318389500:
                        if (strLJJJJ.equals("enigma_video_height_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaVideoHeightDp = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1519130387:
                        if (strLJJJJ.equals("delay_reveal_result")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.delayRevealResult = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1685689554:
                        if (strLJJJJ.equals("opponent_closing_bracket_animation_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentClosingBracketAnimationDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1888811646:
                        if (strLJJJJ.equals("enigma_pulse_animation_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.enigmaPulseAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1898546109:
                        if (strLJJJJ.equals("self_enigma_scaling_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.selfEnigmaScalingDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1996922180:
                        if (strLJJJJ.equals("scroll_animation_short_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.scoreAnimationShortDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2042011574:
                        if (strLJJJJ.equals("opponent_solo_score_fade_in_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaDelay.opponentSoloScoreFadeInDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchEnigmaDelay;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchEnigmaDelay liveMatchEnigmaDelay) throws IOException {
        LiveMatchEnigmaDelay liveMatchEnigmaDelay2 = liveMatchEnigmaDelay;
        if (liveMatchEnigmaDelay2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("self_enigma_scaling_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.selfEnigmaScalingDuration);
        c09dl.LJIILLIIL("score_scroll_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.scoreScrollAnimationDelay);
        c09dl.LJIILLIIL("score_bar_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.scoreBarAnimationDelay);
        c09dl.LJIILLIIL("scroll_animation_long_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.scoreAnimationLongDuration);
        c09dl.LJIILLIIL("scroll_animation_short_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.scoreAnimationShortDuration);
        c09dl.LJIILLIIL("enigma_scroll_score_threshold");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.scoreThreshold);
        c09dl.LJIILLIIL("enigma_first_show_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.enigmaFirstShowAnimationDelay);
        c09dl.LJIILLIIL("enigma_pulse_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.enigmaPulseAnimationDelay);
        c09dl.LJIILLIIL("opponent_score_bar_plus_and_x_fade_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentScoreBarPlusAndXDuration);
        c09dl.LJIILLIIL("opponent_score_bar_translation_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentScoreBarTranslationDuration);
        c09dl.LJIILLIIL("opponent_score_bar_fade_and_translation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentScoreBarFadeAndTranslationDelay);
        c09dl.LJIILLIIL("score_bar_grow_animation");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.ScoreGrowAnimationDelay);
        c09dl.LJIILLIIL("switch_first_rank_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.switchFirstRankDelay);
        c09dl.LJIILLIIL("switch_first_rank_progress_bar_update_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.switchFirstRankProgressBarUpdateDelay);
        c09dl.LJIILLIIL("opponent_solo_match_translation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloMatchTranslationDelay);
        c09dl.LJIILLIIL("opponent_solo_score_bar_plus_and_x_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloScoreBarPlusAndXDelay);
        c09dl.LJIILLIIL("opponent_closing_bracket_animation_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentClosingBracketAnimationDuration);
        c09dl.LJIILLIIL("opponent_closing_bracket_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentClosingBracketAnimationDelay);
        c09dl.LJIILLIIL("opponent_solo_score_fade_out_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloScoreFadeOutDuration);
        c09dl.LJIILLIIL("opponent_solo_score_fade_out_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloScoreFadeOutDelay);
        c09dl.LJIILLIIL("opponent_solo_score_fade_in_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloScoreFadeInDuration);
        c09dl.LJIILLIIL("opponent_solo_score_fade_in_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.opponentSoloScoreFadeInDelay);
        c09dl.LJIILLIIL("enigma_video_height_dp");
        c09dl.LJJJJ(Float.valueOf(liveMatchEnigmaDelay2.enigmaVideoHeightDp));
        c09dl.LJIILLIIL("enigma_video_offset_dp");
        c09dl.LJJJJ(Float.valueOf(liveMatchEnigmaDelay2.enigmaVideoOffsetDp));
        c09dl.LJIILLIIL("mvp_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.mvpAnimationDelay);
        c09dl.LJIILLIIL("hide_wind_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.hideWindDelay);
        c09dl.LJIILLIIL("enigma_left_plus_fade_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.enigmaLeftPlusFadeDelay);
        c09dl.LJIILLIIL("enigma_left_plus_fade_duration");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.enigmaLeftPlusFadeDuration);
        c09dl.LJIILLIIL("delay_reveal_result");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.delayRevealResult);
        c09dl.LJIILLIIL("skip_reveal_animation_delay");
        c09dl.LJJIZ(liveMatchEnigmaDelay2.skipRevealAnimationDelay);
        c09dl.LJII();
    }
}
