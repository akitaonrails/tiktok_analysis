package com.ss.android.ugc.aweme.ad.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdForestData {

    @C09CT("enable_dynamic_ad")
    public final boolean enableDynamicAd;

    @C09CT("enable_forest_challenge")
    public final boolean enableForestChallenge;

    @C09CT("enable_lynx_interaction")
    public final boolean enableInteraction;

    @C09CT("enable_lynx_card")
    public final boolean enableLynxCard;

    @C09CT("enable_lynx_landing_page")
    public final boolean enableLynxLandingPage;

    @C09CT("enable_lynx_live_links")
    public final boolean enableLynxLiveLinks;

    @C09CT("enable_lynx_mask")
    public final boolean enableLynxMask;

    @C09CT("enable_lynx_new_fake_user_fragment")
    public final boolean enableLynxNewFakeUserFragment;

    @C09CT("enable_lynx_sticker")
    public final boolean enableLynxSticker;

    @C09CT("enable_lynx_superlike")
    public final boolean enableLynxSuperLike;

    @C09CT("enable_lynx_survey")
    public final boolean enableLynxSurvey;

    @C09CT("enable_lynx_wish_list")
    public final boolean enableLynxWishList;

    @C09CT("enable_lynx_product_title")
    public final boolean enableProductTitle;

    @C09CT("enable_shake_egg")
    public final boolean enableShakeEgg;

    public AdForestData() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public AdForestData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.enableLynxLandingPage = z;
        this.enableDynamicAd = z2;
        this.enableLynxWishList = z3;
        this.enableLynxNewFakeUserFragment = z4;
        this.enableLynxLiveLinks = z5;
        this.enableLynxSurvey = z6;
        this.enableLynxSuperLike = z7;
        this.enableLynxCard = z8;
        this.enableLynxMask = z9;
        this.enableForestChallenge = z10;
        this.enableLynxSticker = z11;
        this.enableProductTitle = z12;
        this.enableInteraction = z13;
        this.enableShakeEgg = z14;
    }
}
