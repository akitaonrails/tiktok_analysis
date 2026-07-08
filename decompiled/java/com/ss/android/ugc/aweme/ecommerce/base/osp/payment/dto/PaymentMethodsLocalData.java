package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodsLocalData {

    @C09CT("methods_info_in_credit")
    public final CreditInfoMethodsLocalData methodsInfoListInCredit;

    @C09CT("original_method_info")
    public final PaymentMethodLocalInfo originalMethodInfo;

    @C09CT("payment_methods_info_list")
    public final List<PaymentMethodLocalInfo> paymentMethodsInfoList;

    @C09CT("recommend_methods_info_list")
    public final List<PaymentMethodLocalInfo> recommendMethodsInfoList;

    @C09CT("stored_methods_info_list")
    public final List<PaymentMethodLocalInfo> storedMethodsInfoList;

    public PaymentMethodsLocalData() {
        this(null, null, null, null, null);
    }

    public PaymentMethodsLocalData(List<PaymentMethodLocalInfo> list, List<PaymentMethodLocalInfo> list2, List<PaymentMethodLocalInfo> list3, PaymentMethodLocalInfo paymentMethodLocalInfo, CreditInfoMethodsLocalData creditInfoMethodsLocalData) {
        this.paymentMethodsInfoList = list;
        this.recommendMethodsInfoList = list2;
        this.storedMethodsInfoList = list3;
        this.originalMethodInfo = paymentMethodLocalInfo;
        this.methodsInfoListInCredit = creditInfoMethodsLocalData;
    }
}
