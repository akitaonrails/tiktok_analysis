package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.coupon;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaCouponInfo {

    @C09CT("discount_limit_text")
    public final String discountLimitText;

    @C09CT("discount_text")
    public final String discountText;

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("threshold_text")
    public final String thresholdText;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public SeaCouponInfo(String str, String str2, String str3, String str4, String str5) {
        this.voucherTypeId = str;
        this.instanceKey = str2;
        this.discountText = str3;
        this.discountLimitText = str4;
        this.thresholdText = str5;
    }
}
