package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CreditInfoMethodsLocalData implements Serializable {
    public static final int $stable = 8;

    @C09CT("credit_method_info")
    public final PaymentMethodLocalInfo creditMethodInfo;

    @C09CT("payment_methods_info_list")
    public final List<PaymentMethodLocalInfo> paymentMethodsInfoList;

    @C09CT("recommend_methods_info_list")
    public final List<PaymentMethodLocalInfo> recommendMethodsInfoList;

    @C09CT("stored_methods_info_list")
    public final List<PaymentMethodLocalInfo> storedMethodsInfoList;

    public CreditInfoMethodsLocalData() {
        this(null, null, null, null);
    }

    public CreditInfoMethodsLocalData(PaymentMethodLocalInfo paymentMethodLocalInfo, List<PaymentMethodLocalInfo> list, List<PaymentMethodLocalInfo> list2, List<PaymentMethodLocalInfo> list3) {
        this.creditMethodInfo = paymentMethodLocalInfo;
        this.paymentMethodsInfoList = list;
        this.recommendMethodsInfoList = list2;
        this.storedMethodsInfoList = list3;
    }
}
