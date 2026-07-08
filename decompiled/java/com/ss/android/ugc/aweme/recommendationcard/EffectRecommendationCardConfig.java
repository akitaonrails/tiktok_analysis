package com.ss.android.ugc.aweme.recommendationcard;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectRecommendationCardConfig {

    @C09CT("effect_card_additional_cool_down_days")
    public final int coolDownDays;

    @C09CT("effect_card_no_action_times")
    public final int noActionTimes;

    @C09CT("effect_card_reduced_max_count")
    public final int reducedMaxCount;

    @C09CT("effect_card_reset_counter")
    public final boolean resetCounter;

    public EffectRecommendationCardConfig() {
        this(5, 3, 1, false);
    }

    public EffectRecommendationCardConfig(int i, int i2, int i3, boolean z) {
        this.coolDownDays = i;
        this.noActionTimes = i2;
        this.reducedMaxCount = i3;
        this.resetCounter = z;
    }
}
