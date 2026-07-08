package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierBasicInfoData implements Serializable {

    @C09CT("cashier_display_info")
    public final CashierDisplayInfo cashierDisplayInfo;

    @C09CT("payment_methods")
    public final List<CBIPaymentMethod> cashierPaymentMethods;

    @C09CT("customized_info")
    public final CustomizedInfo customizedInfo;

    public CashierBasicInfoData() {
        this(null, null, null);
    }

    public CashierBasicInfoData(List<CBIPaymentMethod> list, CashierDisplayInfo cashierDisplayInfo, CustomizedInfo customizedInfo) {
        this.cashierPaymentMethods = list;
        this.cashierDisplayInfo = cashierDisplayInfo;
        this.customizedInfo = customizedInfo;
    }
}
