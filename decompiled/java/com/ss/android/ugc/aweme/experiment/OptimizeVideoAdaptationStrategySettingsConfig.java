package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class OptimizeVideoAdaptationStrategySettingsConfig {

    @C09CT("enable_shrink_top_black")
    public final boolean enable_shrink_top_black;

    @C09CT("enable_survey_top_margin")
    public final boolean enable_survey_top_margin;

    @C09CT("enable_top_tab_transparent")
    public final boolean enable_top_tab_transparent;

    @C09CT("high_loss_max")
    public final float high_loss_max;

    @C09CT("low_loss_max")
    public final float low_loss_max;

    @C09CT("middle_loss_max")
    public final float middle_loss_max;

    public OptimizeVideoAdaptationStrategySettingsConfig() {
        this(0.1f, 0.15f, 0.2f, true, true, true);
    }

    public OptimizeVideoAdaptationStrategySettingsConfig(float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
        this.low_loss_max = f;
        this.middle_loss_max = f2;
        this.high_loss_max = f3;
        this.enable_shrink_top_black = z;
        this.enable_survey_top_margin = z2;
        this.enable_top_tab_transparent = z3;
    }
}
