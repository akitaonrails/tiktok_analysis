package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOrderPayStorageSchemaModel {

    @C09CT("black_list")
    public final List<String> blackPaymentMethods;

    @C09CT("enable")
    public final boolean enable;

    public EcOrderPayStorageSchemaModel() {
        this(null, false);
    }

    public EcOrderPayStorageSchemaModel(List<String> list, boolean z) {
        this.blackPaymentMethods = list;
        this.enable = z;
    }
}
