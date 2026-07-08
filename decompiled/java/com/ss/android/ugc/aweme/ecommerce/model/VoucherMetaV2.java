package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class VoucherMetaV2 {

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public VoucherMetaV2() {
        this(null, null, null);
    }

    public VoucherMetaV2(String str, String str2, String str3) {
        this.voucherTypeId = str;
        this.voucherId = str2;
        this.instanceKey = str3;
    }
}
