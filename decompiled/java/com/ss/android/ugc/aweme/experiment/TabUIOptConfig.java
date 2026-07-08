package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TabUIOptConfig {

    @C09CT("top_tab_text_color")
    public final Boolean tabTextColorOpt;

    @C09CT("top_icon_press")
    public final Boolean topIconPressOpt;

    @C09CT("top_layer_opt")
    public final Integer topLayerOpt;

    @C09CT("top_tab_arrow")
    public final Boolean topTabArrowOpt;

    @C09CT("top_tab_fading")
    public final Boolean topTabFadingOpt;

    @C09CT("top_tab_indicator")
    public final Boolean topTabIndicatorOpt;

    @C09CT("top_tab_shadow_new")
    public final Integer topTabShadowNew;

    @C09CT("top_tab_back_to_first_button")
    public final Boolean topTabUiOptBackToFirstButton;

    @C09CT("top_tab_shadow")
    public final Boolean topTabUiOptShadow;

    public TabUIOptConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2) {
        this.tabTextColorOpt = bool;
        this.topTabFadingOpt = bool2;
        this.topTabArrowOpt = bool3;
        this.topIconPressOpt = bool4;
        this.topTabIndicatorOpt = bool5;
        this.topTabUiOptShadow = bool6;
        this.topTabUiOptBackToFirstButton = bool7;
        this.topTabShadowNew = num;
        this.topLayerOpt = num2;
    }
}
