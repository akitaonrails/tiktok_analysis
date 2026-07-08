package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class VoucherAction {

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public VoucherAction() {
        this(0, null, null);
    }

    public VoucherAction(Integer num, String str, String str2) {
        this.type = num;
        this.text = str;
        this.schema = str2;
    }
}
