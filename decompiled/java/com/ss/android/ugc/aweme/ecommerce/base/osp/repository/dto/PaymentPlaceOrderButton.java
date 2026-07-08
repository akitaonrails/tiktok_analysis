package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPlaceOrderButton {

    @C09CT("payment_place_order_button_list")
    public List<PaymentPlaceOrderButtonInfo> paymentPlaceOrderButtonList;

    @C09CT("place_order_button")
    public PlaceOrderButtonInfo placeOrderButton;

    @C09CT("recommend_installment_button")
    public PaymentPlaceOrderButtonInfo recommendInstallmentButton;

    public PaymentPlaceOrderButton() {
        this(null, null, null);
    }

    public PaymentPlaceOrderButton(PaymentPlaceOrderButtonInfo paymentPlaceOrderButtonInfo, PlaceOrderButtonInfo placeOrderButtonInfo, List<PaymentPlaceOrderButtonInfo> list) {
        this.recommendInstallmentButton = paymentPlaceOrderButtonInfo;
        this.placeOrderButton = placeOrderButtonInfo;
        this.paymentPlaceOrderButtonList = list;
    }
}
