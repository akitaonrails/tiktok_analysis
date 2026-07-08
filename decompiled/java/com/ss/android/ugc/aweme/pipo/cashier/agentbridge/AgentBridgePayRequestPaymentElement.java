package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AgentBridgePayRequestPaymentElement {

    @C09CT("element")
    public final String element;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_value")
    public final String paramValue;

    public AgentBridgePayRequestPaymentElement() {
        this(null, null, null);
    }

    public AgentBridgePayRequestPaymentElement(String str, String str2, String str3) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
    }
}
