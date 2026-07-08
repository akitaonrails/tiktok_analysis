package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PayResponseData {

    @C09CT("cashier")
    public final n cashier;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("logid")
    public final String logId;

    @C09CT("new_pay_info")
    public final NewPayInfo newPayInfo;

    @C09CT("order_detail_schema")
    public final String orderDetailSchema;

    @C09CT("pay_success_schema")
    public final String paySuccessSchema;

    @C09CT("payment_methods")
    public final PaymentMethodsData paymentMethodsData;

    @C09CT("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("jump_schema_url")
    public final String schema;

    @C09CT("address")
    public final Address shippingAddress;

    public PayResponseData(n nVar, String str, NewPayInfo newPayInfo, Address address, PaymentMethodsData paymentMethodsData, List<PaymentPrice> list, ExceptionUX exceptionUX, String str2, String str3, String str4, String str5) {
        this.cashier = nVar;
        this.schema = str;
        this.newPayInfo = newPayInfo;
        this.shippingAddress = address;
        this.paymentMethodsData = paymentMethodsData;
        this.paymentPrice = list;
        this.exceptionUX = exceptionUX;
        this.logId = str2;
        this.pipoErrorAction = str3;
        this.paySuccessSchema = str4;
        this.orderDetailSchema = str5;
    }
}
