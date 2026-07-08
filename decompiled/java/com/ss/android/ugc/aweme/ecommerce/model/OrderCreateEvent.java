package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderCreateEvent {

    @C09CT("pay_middle_url")
    public final String payMiddleUrl;

    public OrderCreateEvent() {
        this(null);
    }

    public OrderCreateEvent(String str) {
        this.payMiddleUrl = str;
    }
}
