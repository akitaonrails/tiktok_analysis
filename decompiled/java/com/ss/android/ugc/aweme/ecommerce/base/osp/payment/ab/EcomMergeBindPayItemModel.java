package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomMergeBindPayItemModel {

    @C09CT("bind_payment_method_id")
    public final String bindPmId;

    @C09CT("pay_payment_method_id")
    public final String payPmId;

    public EcomMergeBindPayItemModel() {
        this(null, null);
    }

    public EcomMergeBindPayItemModel(String str, String str2) {
        this.payPmId = str;
        this.bindPmId = str2;
    }
}
