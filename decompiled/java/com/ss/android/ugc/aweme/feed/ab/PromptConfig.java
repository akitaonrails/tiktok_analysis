package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class PromptConfig {

    @C09CT("feedback_survey_position")
    public final int feedbackPosition;

    @C09CT("feedback_survey_position_cold_launch")
    public final int feedbackPositionColdLaunch;

    @C09CT("negative_feedback")
    public final String negativeFeedbackKey;

    @C09CT("negative")
    public final String negativeKey;

    @C09CT("input_panel_optimization_group")
    public final int panelOptimize;

    @C09CT("positive_feedback")
    public final String positiveFeedbackKey;

    @C09CT("positive")
    public final String positiveKey;

    @C09CT("ui_optimize")
    public final int uiOptimize;

    public PromptConfig() {
        this("", "", "", "", 0, 0, 0, 0);
    }

    public PromptConfig(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        this.positiveKey = str;
        this.negativeKey = str2;
        this.positiveFeedbackKey = str3;
        this.negativeFeedbackKey = str4;
        this.feedbackPosition = i;
        this.feedbackPositionColdLaunch = i2;
        this.uiOptimize = i3;
        this.panelOptimize = i4;
    }
}
