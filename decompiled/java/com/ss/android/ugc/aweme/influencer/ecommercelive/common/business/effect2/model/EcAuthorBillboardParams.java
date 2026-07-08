package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcAuthorBillboardParams {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("activity_status")
    public final Integer activityStatus;

    @C09CT("available_price")
    public final String availablePrice;

    @C09CT("end_time")
    public final String endTime;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("origin_price")
    public final String originPrice;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_image_url")
    public final String productImage;

    @C09CT("product_index")
    public final String productIndex;

    @C09CT("product_name")
    public final String productName;

    @C09CT("start_time")
    public final String startTime;

    public EcAuthorBillboardParams() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public EcAuthorBillboardParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10) {
        this.eventName = str;
        this.productImage = str2;
        this.productIndex = str3;
        this.productId = str4;
        this.productName = str5;
        this.availablePrice = str6;
        this.originPrice = str7;
        this.activityId = str8;
        this.activityStatus = num;
        this.startTime = str9;
        this.endTime = str10;
    }
}
