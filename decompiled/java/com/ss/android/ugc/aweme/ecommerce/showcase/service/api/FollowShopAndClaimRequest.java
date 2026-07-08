package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class FollowShopAndClaimRequest {

    @C09CT("bcm_coupon_id")
    public final String bcmCouponId;

    @C09CT("btm")
    public final String btm;

    @C09CT("follow_scene")
    public final Integer scene;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public FollowShopAndClaimRequest() {
        this(null, null, null, null, null, null);
    }

    public FollowShopAndClaimRequest(String str, String str2, Integer num, List<Integer> list, String str3, String str4) {
        this.sellerId = str;
        this.voucherTypeId = str2;
        this.scene = num;
        this.trafficSourceList = list;
        this.bcmCouponId = str3;
        this.btm = str4;
    }
}
