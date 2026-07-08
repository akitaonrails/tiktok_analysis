package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentTooltip {

    @C09CT("text")
    public String text;

    @C09CT("url")
    public String url;

    public PaymentTooltip() {
        this(null, null);
    }

    public PaymentTooltip(String str, String str2) {
        this.text = str;
        this.url = str2;
    }
}
