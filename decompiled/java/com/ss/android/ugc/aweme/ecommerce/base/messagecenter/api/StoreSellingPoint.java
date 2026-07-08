package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class StoreSellingPoint {

    @C09CT("expRatePercentile")
    public final Integer expRatePercentile;

    @C09CT("rateDisplayStyle")
    public final Integer rateDisplayStyle;

    @C09CT("shopRatingDisplay")
    public final String shopRatingDisplay;

    @C09CT("showRateNotApplicable")
    public final Boolean showRateNotApplicable;

    public StoreSellingPoint(String str, Integer num, Integer num2, Boolean bool) {
        this.shopRatingDisplay = str;
        this.expRatePercentile = num;
        this.rateDisplayStyle = num2;
        this.showRateNotApplicable = bool;
    }
}
