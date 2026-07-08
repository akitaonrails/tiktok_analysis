package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ActivityBaseInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("promotion_template")
    public final Integer promotionTemplate;

    public ActivityBaseInfo(String str, Integer num) {
        this.activityId = str;
        this.promotionTemplate = num;
    }
}
