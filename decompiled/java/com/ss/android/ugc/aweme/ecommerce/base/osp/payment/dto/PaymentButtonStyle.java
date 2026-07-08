package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentButtonStyle {

    @C09CT("global_button_style")
    public ButtonStyle buttonStyle;

    public PaymentButtonStyle() {
        this(null);
    }

    public PaymentButtonStyle(ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }
}
