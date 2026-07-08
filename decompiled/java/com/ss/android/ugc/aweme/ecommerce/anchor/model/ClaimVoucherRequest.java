package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ClaimVoucherRequest {

    @C09CT("bcm_coupon_id")
    public final String bcmCouponId;

    @C09CT("btm")
    public final String btm;

    @C09CT("claim_type")
    public final Integer claimType;

    @C09CT("request_source")
    public final Integer requestSource;

    @C09CT("voucher_type_id")
    public final String voucherTypeID;

    public ClaimVoucherRequest() {
        this(null, null, null, null, null);
    }

    public ClaimVoucherRequest(String str, Integer num, String str2, String str3, Integer num2) {
        this.voucherTypeID = str;
        this.requestSource = num;
        this.bcmCouponId = str2;
        this.btm = str3;
        this.claimType = num2;
    }
}
