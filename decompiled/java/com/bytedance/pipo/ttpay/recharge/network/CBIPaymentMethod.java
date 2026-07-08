package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIPaymentMethod implements Serializable {

    @C09CT("elements")
    public final List<Object> elements;

    @C09CT("needed_elements")
    public final List<Object> neededElements;

    @C09CT("payment_method")
    public final CBIPaymentMethodDetail paymentMethodDetail;

    @C09CT("pci_sensitive")
    public final Boolean pciSensitive;

    @C09CT("stored_payment_method_detail")
    public final CBIPaymentMethodDetail storedPaymentMethodDetail;

    public CBIPaymentMethod(CBIPaymentMethodDetail cBIPaymentMethodDetail, CBIPaymentMethodDetail cBIPaymentMethodDetail2, Boolean bool, List<Object> list, List<Object> list2) {
        this.paymentMethodDetail = cBIPaymentMethodDetail;
        this.storedPaymentMethodDetail = cBIPaymentMethodDetail2;
        this.pciSensitive = bool;
        this.elements = list;
        this.neededElements = list2;
    }
}
