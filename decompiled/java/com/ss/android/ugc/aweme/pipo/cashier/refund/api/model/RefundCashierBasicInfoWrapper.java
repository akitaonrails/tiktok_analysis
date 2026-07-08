package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierBasicInfoWrapper {

    @C09CT("refund_module")
    public final RefundCashierBasicInfo refundModule;

    @C09CT("version")
    public final String version;

    public RefundCashierBasicInfoWrapper() {
        this(null, null);
    }

    public RefundCashierBasicInfoWrapper(String str, RefundCashierBasicInfo refundCashierBasicInfo) {
        this.version = str;
        this.refundModule = refundCashierBasicInfo;
    }
}
