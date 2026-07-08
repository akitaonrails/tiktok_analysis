package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class FypAffiliateMeta implements Serializable {

    @C09CT("button_scene")
    public final String buttonScene;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("has_added_products")
    public final Boolean hasAddedProducts;

    @C09CT("has_applied_for_samples")
    public final Boolean hasAppliedForSamples;

    @C09CT("is_category_match")
    public final Boolean isCategoryMatch;

    @C09CT("is_popular_video")
    public final Boolean isPopularVideo;

    @C09CT("pick_score")
    public final String pickScore;

    public FypAffiliateMeta() {
        this(null, null, null, null, null, null, null);
    }

    public final Boolean isCategoryMatch() {
        return this.isCategoryMatch;
    }

    public final Boolean isPopularVideo() {
        return this.isPopularVideo;
    }

    public FypAffiliateMeta(Integer num, Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, String str2) {
        this.buttonType = num;
        this.isCategoryMatch = bool;
        this.isPopularVideo = bool2;
        this.pickScore = str;
        this.hasAppliedForSamples = bool3;
        this.hasAddedProducts = bool4;
        this.buttonScene = str2;
    }
}
