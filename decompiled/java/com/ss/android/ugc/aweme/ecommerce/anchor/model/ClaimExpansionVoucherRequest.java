package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimExpansionVoucherRequest {

    @C09CT("basic_voucher_id")
    public final String basicVoucherId;

    @C09CT("basic_voucher_type_id")
    public final String basicVoucherTypeId;

    @C09CT("bcm_coupon_id")
    public final String bcmCouponId;

    @C09CT("btm")
    public final String btm;

    @C09CT("claim_type")
    public final Integer claimType;

    @C09CT("display_form")
    public final Integer displayForm;

    @C09CT("expansion_voucher_type_id")
    public final String expansionVoucherTypeId;

    @C09CT("resource_place_key")
    public final String resourcePlaceKey;

    @C09CT("tt_uid")
    public final Long ttUid;

    public ClaimExpansionVoucherRequest() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ClaimExpansionVoucherRequest(String str, String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2, Long l) {
        this.resourcePlaceKey = str;
        this.expansionVoucherTypeId = str2;
        this.displayForm = num;
        this.basicVoucherTypeId = str3;
        this.basicVoucherId = str4;
        this.bcmCouponId = str5;
        this.btm = str6;
        this.claimType = num2;
        this.ttUid = l;
    }
}
