package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRequestElement {

    @C09CT("element")
    public final String element;

    @C09CT("is_encrypted")
    public final Boolean isEncrypted;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_value")
    public final String paramValue;

    public PayRequestElement() {
        this(null, null, null, null);
    }

    public PayRequestElement(String str, String str2, String str3, Boolean bool) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
        this.isEncrypted = bool;
    }
}
