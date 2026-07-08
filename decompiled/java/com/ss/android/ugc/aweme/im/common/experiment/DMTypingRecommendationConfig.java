package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class DMTypingRecommendationConfig {

    @C09CT("animation_duration")
    public final long animationDuration;

    @C09CT("dynamic_delay_clicks_to_decrease")
    public final int dynamicDelayClicksToDecrease;

    @C09CT("dynamic_delay_decrease_step_ms")
    public final long dynamicDelayDecreaseStepMs;

    @C09CT("dynamic_delay_increase_step_ms")
    public final long dynamicDelayIncreaseStepMs;

    @C09CT("dynamic_delay_max_ms")
    public final long dynamicDelayMaxMs;

    @C09CT("dynamic_delay_shows_to_increase")
    public final int dynamicDelayShowsToIncrease;

    @C09CT("input_delay")
    public final long inputDelay;

    @C09CT("max_distance")
    public final float maxDistance;

    @C09CT("max_input_length")
    public final int maxInputLength;

    @C09CT("max_words")
    public final int maxWords;

    @C09CT("min_stickers")
    public final int minStickers;

    @C09CT("toast_duration")
    public final int toastDurationSec;

    @C09CT("client_top_k")
    public final int topK;

    public DMTypingRecommendationConfig() {
        this(100L, 200L, 3, 5, 20, 0.815f, 50, 4, 400L, 50L, 50L, 10, 1);
    }

    public DMTypingRecommendationConfig(long j, long j2, int i, int i2, int i3, float f, int i4, int i5, long j3, long j4, long j5, int i6, int i7) {
        this.inputDelay = j;
        this.animationDuration = j2;
        this.maxWords = i;
        this.minStickers = i2;
        this.topK = i3;
        this.maxDistance = f;
        this.maxInputLength = i4;
        this.toastDurationSec = i5;
        this.dynamicDelayMaxMs = j3;
        this.dynamicDelayIncreaseStepMs = j4;
        this.dynamicDelayDecreaseStepMs = j5;
        this.dynamicDelayShowsToIncrease = i6;
        this.dynamicDelayClicksToDecrease = i7;
    }
}
