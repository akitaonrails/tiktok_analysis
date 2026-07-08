package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimExpansionVoucherRequest {

    @C09CT("basic_voucher_id")
    public final String basicVoucherId;

    @C09CT("basic_voucher_type_id")
    public final String basicVoucherTypeId;

    @C09CT("display_form")
    public final Integer displayForm;

    @C09CT("expansion_voucher_type_id")
    public final String expansionVoucherId;

    @C09CT("resource_place_key")
    public final String resourcePlaceKey;

    public ClaimExpansionVoucherRequest() {
        this(null, null, null, null, null);
    }

    public ClaimExpansionVoucherRequest(String str, String str2, Integer num, String str3, String str4) {
        this.resourcePlaceKey = str;
        this.expansionVoucherId = str2;
        this.displayForm = num;
        this.basicVoucherTypeId = str3;
        this.basicVoucherId = str4;
    }
}
