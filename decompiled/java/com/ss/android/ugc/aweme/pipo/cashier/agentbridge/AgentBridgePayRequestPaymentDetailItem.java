package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AgentBridgePayRequestPaymentDetailItem {

    @C09CT("payment_method")
    public final AgentBridgePayRequestPaymentMethod pm;

    public AgentBridgePayRequestPaymentDetailItem() {
        this(null);
    }

    public AgentBridgePayRequestPaymentDetailItem(AgentBridgePayRequestPaymentMethod agentBridgePayRequestPaymentMethod) {
        this.pm = agentBridgePayRequestPaymentMethod;
    }
}
