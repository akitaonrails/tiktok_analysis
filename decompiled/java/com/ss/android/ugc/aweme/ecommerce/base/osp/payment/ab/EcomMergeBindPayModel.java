package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomMergeBindPayModel {

    @C09CT("configs")
    public final List<EcomMergeBindPayItemModel> configs;

    public EcomMergeBindPayModel() {
        this(null);
    }

    public EcomMergeBindPayModel(List<EcomMergeBindPayItemModel> list) {
        this.configs = list;
    }
}
