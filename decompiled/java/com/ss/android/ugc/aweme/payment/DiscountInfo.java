package com.ss.android.ugc.aweme.payment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class DiscountInfo {

    @C09CT("voucher_use_status")
    public final VoucherUseStatus voucherUseStatus;

    public DiscountInfo() {
        this(VoucherUseStatus.NO_VOUCHER_USED);
    }

    public DiscountInfo(VoucherUseStatus voucherUseStatus) {
        this.voucherUseStatus = voucherUseStatus;
    }
}
