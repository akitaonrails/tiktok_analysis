package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("live_enigma_match_animation_timing")
public final class LiveMatchEnigmaAnimationTimingSettings {
    public static final LiveMatchEnigmaAnimationTimingSettings INSTANCE = new LiveMatchEnigmaAnimationTimingSettings();
    public static final LiveMatchEnigmaDelay DEFAULT = new LiveMatchEnigmaDelay(480, 4200, 800, 800, 400, 100, 2760, 2760, 240, 280, 800, 4400, 4500, Mp4ScreenVideoLoadTimeout.CONTROL, 5080, 80, 600, 120, 320, 440, 640, 600, 44.0f, 82.0f, 4000, 5400, 1100, 180, 6320, 500);

    private final LiveMatchEnigmaDelay getConfig() {
        return (LiveMatchEnigmaDelay) SettingsManager.INSTANCE.getValueSafely("live_enigma_match_animation_timing", DEFAULT);
    }

    public final long getEnigmaFirstShowAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaFirstShowAnimationDelay;
        }
        return 2760L;
    }

    public final long getEnigmaLeftPlusFadeDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaLeftPlusFadeDelay;
        }
        return 1100L;
    }

    public final long getEnigmaLeftPlusFadeDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaLeftPlusFadeDuration;
        }
        return 180L;
    }

    public final long getEnigmaMVPAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.mvpAnimationDelay;
        }
        return 4000L;
    }

    public final long getEnigmaPulseAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaPulseAnimationDelay;
        }
        return 2760L;
    }

    public final float getEnigmaRevealVideoHeightDp() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaVideoHeightDp;
        }
        return 44.0f;
    }

    public final float getEnigmaRevealVideoOffsetDp() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.enigmaVideoOffsetDp;
        }
        return 82.0f;
    }

    public final long getHideWindDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.hideWindDelay;
        }
        return 5400L;
    }

    public final long getOpponentClosingBracketAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentClosingBracketAnimationDelay;
        }
        return 120L;
    }

    public final long getOpponentClosingBracketAnimationDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentClosingBracketAnimationDuration;
        }
        return 600L;
    }

    public final long getOpponentScoreBarFadeAndTranslationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentScoreBarFadeAndTranslationDelay;
        }
        return 800L;
    }

    public final long getOpponentScoreBarPlusAndXDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentScoreBarPlusAndXDuration;
        }
        return 240L;
    }

    public final long getOpponentScoreBarTranslationDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentScoreBarTranslationDuration;
        }
        return 280L;
    }

    public final long getOpponentSoloMatchTranslationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloMatchTranslationDelay;
        }
        return 5080L;
    }

    public final long getOpponentSoloScoreBarPlusAndXDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloScoreBarPlusAndXDelay;
        }
        return 80L;
    }

    public final long getOpponentSoloScoreFadeInDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloScoreFadeInDelay;
        }
        return 600L;
    }

    public final long getOpponentSoloScoreFadeInDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloScoreFadeInDuration;
        }
        return 640L;
    }

    public final long getOpponentSoloScoreFadeOutDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloScoreFadeOutDelay;
        }
        return 440L;
    }

    public final long getOpponentSoloScoreFadeOutDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.opponentSoloScoreFadeOutDuration;
        }
        return 320L;
    }

    public final long getScoreAnimationLongDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.scoreAnimationLongDuration;
        }
        return 800L;
    }

    public final long getScoreAnimationShortDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.scoreAnimationShortDuration;
        }
        return 400L;
    }

    public final long getScoreBarAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.scoreBarAnimationDelay;
        }
        return 800L;
    }

    public final long getScoreGrowAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.ScoreGrowAnimationDelay;
        }
        return 4400L;
    }

    public final long getScoreScrollAnimationDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.scoreScrollAnimationDelay;
        }
        return 4200L;
    }

    public final long getScrollAnimationThreshold() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.scoreThreshold;
        }
        return 100L;
    }

    public final long getSelfEnigmaScalingDuration() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.selfEnigmaScalingDuration;
        }
        return 480L;
    }

    public final long getSwitchFirstRankDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            return config.switchFirstRankDelay;
        }
        return 4500L;
    }

    public final long getSwitchFirstRankProgressBarUpdateDelay() {
        LiveMatchEnigmaDelay config = getConfig();
        return config != null ? config.switchFirstRankProgressBarUpdateDelay : Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    public final long getEnigmaDelayRevealResult(boolean z) {
        if (z) {
            LiveMatchEnigmaDelay config = getConfig();
            if (config != null) {
                return config.delayRevealResult;
            }
            return 6320L;
        }
        LiveMatchEnigmaDelay config2 = getConfig();
        if (config2 != null) {
            return config2.skipRevealAnimationDelay;
        }
        return 500L;
    }

    public final long getScoreAnimationDuration(long j) {
        long j2;
        LiveMatchEnigmaDelay config = getConfig();
        if (config != null) {
            j2 = config.scoreThreshold;
        } else {
            j2 = 100;
        }
        if (j > j2) {
            LiveMatchEnigmaDelay config2 = getConfig();
            if (config2 != null) {
                return config2.scoreAnimationLongDuration;
            }
            return 800L;
        }
        LiveMatchEnigmaDelay config3 = getConfig();
        if (config3 != null) {
            return config3.scoreAnimationShortDuration;
        }
        return 400L;
    }
}
