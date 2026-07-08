package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AgentBridgePayRequestPaymentMethod {

    @C09CT("payment_elements")
    public final List<AgentBridgePayRequestPaymentElement> paymentElements;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    public AgentBridgePayRequestPaymentMethod() {
        this(null, null, null);
    }

    public AgentBridgePayRequestPaymentMethod(String str, String str2, List<AgentBridgePayRequestPaymentElement> list) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.paymentElements = list;
    }
}
