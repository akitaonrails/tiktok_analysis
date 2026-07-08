package com.bytedance.pipo.verify.base.network.data;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ExchangeTokenResult {

    @C09CT("fp_session_id")
    public final String session;

    public ExchangeTokenResult() {
        this(null);
    }

    public ExchangeTokenResult(String str) {
        this.session = str;
    }
}
