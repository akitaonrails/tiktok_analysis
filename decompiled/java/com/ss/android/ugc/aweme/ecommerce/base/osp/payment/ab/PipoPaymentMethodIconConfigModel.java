package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentMethodIconConfigModel {

    @C09CT("add_card_page_icon_threshold")
    public final int addCardPageIconThreshold;

    @C09CT("payment_method_icon_threshold")
    public final int paymentMethodIconThreshold;

    public PipoPaymentMethodIconConfigModel() {
        this(0, 0);
    }

    public PipoPaymentMethodIconConfigModel(int i, int i2) {
        this.addCardPageIconThreshold = i;
        this.paymentMethodIconThreshold = i2;
    }
}
