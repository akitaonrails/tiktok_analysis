package com.ss.android.ugc.aweme.ecommerce.search.vision.entrance;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchEntranceConfig {

    @C09CT("photo_search_disable_drag_box")
    public final boolean disableDrag;

    @C09CT("enable_cart_entrance")
    public final boolean enableCartEntrance;

    @C09CT("drag_follow_hand")
    public final boolean enableFollowHand;

    @C09CT("photo_search_enable_force_intervene")
    public final boolean enableForceIntervene;

    @C09CT("photo_search_enable_repeat_search_guide")
    public final boolean enableRepeatSearchGuide;

    @C09CT("photo_search_enable_search_entrance")
    public final boolean enableSearchEntrance;

    @C09CT("photo_search_half_screen_height_ratio")
    public final Float halfScreenHeightRatio;

    @C09CT("photo_search_hide_nav_bar")
    public final boolean hideNavBar;

    @C09CT("photo_search_page_style")
    public final int pageStyle;

    @C09CT("screenshot_popup_strategy")
    public final int screenshotPopupStrategy;

    @C09CT("photo_search_type")
    public final int searchType;

    @C09CT("source")
    public final String source;

    public PhotoSearchEntranceConfig() {
        this(3, 0, false, false, null, false, false, false, Float.valueOf(0.73f), false, false, 0);
    }

    public PhotoSearchEntranceConfig(int i, int i2, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, Float f, boolean z6, boolean z7, int i3) {
        this.pageStyle = i;
        this.searchType = i2;
        this.disableDrag = z;
        this.enableSearchEntrance = z2;
        this.source = str;
        this.enableForceIntervene = z3;
        this.enableRepeatSearchGuide = z4;
        this.enableCartEntrance = z5;
        this.halfScreenHeightRatio = f;
        this.hideNavBar = z6;
        this.enableFollowHand = z7;
        this.screenshotPopupStrategy = i3;
    }
}
