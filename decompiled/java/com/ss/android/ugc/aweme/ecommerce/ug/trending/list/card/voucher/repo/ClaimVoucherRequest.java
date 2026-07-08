package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ClaimVoucherRequest {

    @C09CT("bcm_coupon_id")
    public final String bcmCouponId;

    @C09CT("btm")
    public final String btm;

    @C09CT("claim_type")
    public final int claimType;

    @C09CT("request_source")
    public final int requestSource;

    @C09CT("source")
    public final Integer trafficSource;

    @C09CT("voucher_type_id")
    public final String voucherTypeID;

    public ClaimVoucherRequest() {
        this("", 1, 0, "", "", 3);
    }

    public ClaimVoucherRequest(String str, int i, Integer num, String str2, String str3, int i2) {
        this.voucherTypeID = str;
        this.requestSource = i;
        this.trafficSource = num;
        this.btm = str2;
        this.bcmCouponId = str3;
        this.claimType = i2;
    }
}
