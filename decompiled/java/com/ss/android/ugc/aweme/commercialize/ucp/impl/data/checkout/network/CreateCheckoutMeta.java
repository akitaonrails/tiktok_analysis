package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateCheckoutMeta {

    @C09CT("idempotency-key")
    public final String idempotencyKey;

    @C09CT("ucp-agent")
    public final UCPAgent ucpAgent;

    public CreateCheckoutMeta(UCPAgent uCPAgent, String str) {
        this.ucpAgent = uCPAgent;
        this.idempotencyKey = str;
    }
}
