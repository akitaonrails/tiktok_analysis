package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class EcPayCodeFinishSchemaModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("payment_methods")
    public final List<String> paymentMethods;

    public EcPayCodeFinishSchemaModel() {
        this(null, false);
    }

    public EcPayCodeFinishSchemaModel(List<String> list, boolean z) {
        this.paymentMethods = list;
        this.enable = z;
    }
}
