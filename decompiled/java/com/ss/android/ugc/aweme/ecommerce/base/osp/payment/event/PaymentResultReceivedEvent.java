package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.event;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentResultReceivedEvent {

    @C09CT("close_page")
    public final boolean closePage;

    @C09CT("hide_loading")
    public final boolean hideLoading;

    public PaymentResultReceivedEvent() {
        this(true, true);
    }

    public PaymentResultReceivedEvent(boolean z, boolean z2) {
        this.closePage = z;
        this.hideLoading = z2;
    }
}
