package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinePaymentInfo {

    @C09CT("credit_info_list")
    public List<CreditInfo> creditInfoList;

    public CombinePaymentInfo() {
        this(null);
    }

    public CombinePaymentInfo(List<CreditInfo> list) {
        this.creditInfoList = list;
    }
}
