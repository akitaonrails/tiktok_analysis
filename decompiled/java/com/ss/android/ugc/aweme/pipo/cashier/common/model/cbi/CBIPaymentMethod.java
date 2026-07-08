package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIPaymentMethod {

    @C09CT("elements")
    public final List<Element> elements;

    @C09CT("needed_elements")
    public final List<Element> neededElements;

    @C09CT("payment_method")
    public final CBIPaymentMethodDetail paymentMethodDetail;

    @C09CT("pci_sensitive")
    public final Boolean pciSensitive;

    @C09CT("stored_payment_method_detail")
    public final CBIPaymentMethodDetail storedPaymentMethodDetail;

    public final CBIPaymentMethodDetail LIZ() {
        CBIPaymentMethodDetail cBIPaymentMethodDetail = this.paymentMethodDetail;
        return cBIPaymentMethodDetail == null ? this.storedPaymentMethodDetail : cBIPaymentMethodDetail;
    }

    public CBIPaymentMethod(CBIPaymentMethodDetail cBIPaymentMethodDetail, CBIPaymentMethodDetail cBIPaymentMethodDetail2, Boolean bool, List<Element> list, List<Element> list2) {
        this.paymentMethodDetail = cBIPaymentMethodDetail;
        this.storedPaymentMethodDetail = cBIPaymentMethodDetail2;
        this.pciSensitive = bool;
        this.elements = list;
        this.neededElements = list2;
    }
}
