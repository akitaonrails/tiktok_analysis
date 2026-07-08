package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomOspCallbackOptModel {

    @C09CT("opt_api_callback")
    public final Integer optApiCallback;

    @C09CT("opt_set_state_callback")
    public final Integer optSetStateCallback;

    public EcomOspCallbackOptModel() {
        this(0, 0);
    }

    public EcomOspCallbackOptModel(Integer num, Integer num2) {
        this.optApiCallback = num;
        this.optSetStateCallback = num2;
    }
}
