package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class BindInfoItem {

    @C09CT("payment_method_bind_url")
    public final String paymentMethodBindUrl;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    public BindInfoItem() {
        this(null, null);
    }

    public BindInfoItem(String str, String str2) {
        this.paymentMethodId = str;
        this.paymentMethodBindUrl = str2;
    }
}
