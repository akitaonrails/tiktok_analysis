package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopTabUiAlignmentConfig {

    @C09CT("tab_bottom_theme_animator_duration")
    public final int tabBottomThemeAnimatorDuration;

    @C09CT("tab_center_rule_opt")
    public final int tabCenterRuleOpt;

    @C09CT("tab_click_transform_animator")
    public final int tabClickTransformAnimator;

    @C09CT("tab_hilt_area_rule_opt")
    public final int tabHitAreaRuleOpt;

    @C09CT("tab_margin_rule_opt")
    public final int tabMarginRuleOpt;

    @C09CT("tab_icon_theme_animator_duration")
    public final int tabTopIconAnimatorDuration;

    @C09CT("tab_top_theme_animator_duration")
    public final int tabTopThemeAnimatorDuration;

    public TopTabUiAlignmentConfig() {
        this(0, 0, 0, 0, 0, 0, 0);
    }

    public TopTabUiAlignmentConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.tabMarginRuleOpt = i;
        this.tabHitAreaRuleOpt = i2;
        this.tabCenterRuleOpt = i3;
        this.tabTopThemeAnimatorDuration = i4;
        this.tabBottomThemeAnimatorDuration = i5;
        this.tabTopIconAnimatorDuration = i6;
        this.tabClickTransformAnimator = i7;
    }
}
