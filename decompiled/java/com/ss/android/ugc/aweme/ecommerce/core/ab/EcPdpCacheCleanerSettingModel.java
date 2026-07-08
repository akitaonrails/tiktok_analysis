package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpCacheCleanerSettingModel {

    @C09CT("bcm_standard_track")
    public final Boolean bcmStandardTrack;

    @C09CT("bubble_selling_points")
    public final Boolean bubbleSellingPoints;

    @C09CT("entrance_bubble")
    public final Boolean entranceBubble;

    @C09CT("exception_ux")
    public final Boolean exceptionUX;

    @C09CT("global_waist_banner")
    public final Boolean globalWaistBanner;

    @C09CT("platform_promotion")
    public final Boolean platformPromotion;

    @C09CT("pop_up_triggers")
    public final Boolean popupTriggers;

    @C09CT("product_selling_points")
    public final Boolean productSellingPoints;

    @C09CT("promotion_waist")
    public final Boolean promotionWaist;

    @C09CT("share_button_benefit")
    public final Boolean shareButtonBenefit;

    @C09CT("try_on")
    public final Boolean tryOnData;

    public EcPdpCacheCleanerSettingModel() {
        this(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    }

    public EcPdpCacheCleanerSettingModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11) {
        this.platformPromotion = bool;
        this.popupTriggers = bool2;
        this.entranceBubble = bool3;
        this.bubbleSellingPoints = bool4;
        this.exceptionUX = bool5;
        this.promotionWaist = bool6;
        this.globalWaistBanner = bool7;
        this.bcmStandardTrack = bool8;
        this.productSellingPoints = bool9;
        this.tryOnData = bool10;
        this.shareButtonBenefit = bool11;
    }
}
