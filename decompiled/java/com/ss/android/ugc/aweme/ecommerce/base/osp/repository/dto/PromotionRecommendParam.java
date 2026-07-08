package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionRecommendParam implements Serializable {
    public static final int $stable = 0;

    @C09CT("activity_id")
    public String activityId;

    @C09CT("fulfillment_type")
    public Integer fulfillmentType;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("threshold_diff")
    public String thresholdDiff;

    public PromotionRecommendParam() {
        this(null, null, null, null);
    }

    public PromotionRecommendParam(Integer num, String str, String str2, String str3) {
        this.fulfillmentType = num;
        this.activityId = str;
        this.thresholdDiff = str2;
        this.sellerId = str3;
    }
}
