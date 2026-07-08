package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class IndependentCombinePaymentInfo {

    @C09CT("credit_info_list")
    public final List<IndependentCreditInfo> creditInfoList;

    public IndependentCombinePaymentInfo() {
        this(null);
    }

    public IndependentCombinePaymentInfo(List<IndependentCreditInfo> list) {
        this.creditInfoList = list;
    }
}
