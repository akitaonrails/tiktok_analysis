package com.ss.android.ugc.aweme.search.common.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ModifyProtectionConfig {

    @C09CT("enable_search_to_first_word_duration")
    public final boolean enableSearchToFirstWordDuration;

    @C09CT("fix_entity_ui")
    public final boolean fixEntityUi;

    @C09CT("fix_global_props_update")
    public final boolean fixGlobalPropsUpdate;

    @C09CT("fix_nimble_image_expose_count_reset")
    public final boolean fixNimbleImageExposeCountReset;

    @C09CT("fix_pov_ui_flicker")
    public final boolean fixPovUiFlicker;

    @C09CT("fix_recommend_words_feedback_toast_window")
    public final boolean fixRecommendWordsFeedbackToastWindow;

    @C09CT("fix_share_landing_page_feedback")
    public final boolean fixShareLandingPageFeedback;

    @C09CT("fix_top1_aigc_feedback_info")
    public final boolean fixTop1AigcFeedbackInfo;

    @C09CT("opt_pov_reference_get")
    public final boolean optPovReferenceGet;

    public ModifyProtectionConfig() {
        this(true, true, true, true, true, true, true, true, true);
    }

    public ModifyProtectionConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.fixEntityUi = z;
        this.fixPovUiFlicker = z2;
        this.optPovReferenceGet = z3;
        this.fixGlobalPropsUpdate = z4;
        this.fixShareLandingPageFeedback = z5;
        this.enableSearchToFirstWordDuration = z6;
        this.fixNimbleImageExposeCountReset = z7;
        this.fixRecommendWordsFeedbackToastWindow = z8;
        this.fixTop1AigcFeedbackInfo = z9;
    }
}
