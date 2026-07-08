package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsFixCashierCcdcFirstModel {

    @C09CT("enable_clear_cached_ccdc")
    public final boolean enableClearCachedCard;

    @C09CT("enable_top_cached_ccdc")
    public final boolean enableTopCachedCard;

    public PipoTtsFixCashierCcdcFirstModel() {
        this(false, false);
    }

    public PipoTtsFixCashierCcdcFirstModel(boolean z, boolean z2) {
        this.enableClearCachedCard = z;
        this.enableTopCachedCard = z2;
    }
}
