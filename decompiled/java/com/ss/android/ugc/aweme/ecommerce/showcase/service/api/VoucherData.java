package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherData {

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public VoucherData() {
        this(null, null);
    }

    public VoucherData(String str, String str2) {
        this.voucherId = str;
        this.voucherTypeId = str2;
    }
}
