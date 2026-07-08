package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomCheckoutPaymentCodeOrderRefactorConfigModel {

    @C09CT("payment_methods")
    public final List<String> paymentMethods;

    public EcomCheckoutPaymentCodeOrderRefactorConfigModel() {
        this(null, 1, null);
    }

    public EcomCheckoutPaymentCodeOrderRefactorConfigModel(List<String> list) {
        this.paymentMethods = list;
    }

    public EcomCheckoutPaymentCodeOrderRefactorConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
