package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomStorePaymentMethodsModel {

    @C09CT("payment_method_id")
    public final List<String> paymentMethodId;

    public PipoEcomStorePaymentMethodsModel() {
        this(null, 1, null);
    }

    public PipoEcomStorePaymentMethodsModel(List<String> list) {
        this.paymentMethodId = list;
    }

    public PipoEcomStorePaymentMethodsModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
