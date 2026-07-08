package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ClaimInfo {

    @C09CT("live_voucher")
    public final LiveVoucher liveVoucher;

    @C09CT("success_msg")
    public final String successMsg;

    @C09CT("voucher")
    public final VoucherInfo voucher;

    public ClaimInfo(VoucherInfo voucherInfo, String str, LiveVoucher liveVoucher) {
        this.voucher = voucherInfo;
        this.successMsg = str;
        this.liveVoucher = liveVoucher;
    }
}
