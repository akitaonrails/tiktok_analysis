package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SortItem {

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("is_pi")
    public final Boolean isPi;

    @C09CT("model")
    public final String model;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("hybrid_recommend_info")
    public final RecInfo recInfo;

    public SortItem() {
        this(null, null, null, null, null, null);
    }

    public SortItem(Boolean bool, String str, Boolean bool2, String str2, String str3, RecInfo recInfo) {
        this.isPi = bool;
        this.paymentMethodToken = str;
        this.isDefault = bool2;
        this.paymentMethodId = str2;
        this.model = str3;
        this.recInfo = recInfo;
    }
}
