package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentListResponseData {

    @C09CT("default_summary")
    public final Summary defaultSummary;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("order_info")
    public final OrderInfo orderInfo;

    @C09CT("payment_methods")
    public final PaymentMethodsData paymentMethodsData;

    @C09CT("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @C09CT("pre_risk_param")
    public final n preRiskParam;

    @C09CT("address")
    public final Address shippingAddress;

    public PaymentListResponseData(Address address, PaymentMethodsData paymentMethodsData, List<PaymentPrice> list, ExceptionUX exceptionUX, n nVar, Summary summary, OrderInfo orderInfo) {
        this.shippingAddress = address;
        this.paymentMethodsData = paymentMethodsData;
        this.paymentPrice = list;
        this.exceptionUX = exceptionUX;
        this.preRiskParam = nVar;
        this.defaultSummary = summary;
        this.orderInfo = orderInfo;
    }
}
