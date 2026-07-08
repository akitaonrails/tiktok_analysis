package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AgentBridgePayRequestPaymentDetails {

    @C09CT("payment_details")
    public final List<AgentBridgePayRequestPaymentDetailItem> paymentDetailItems;

    @C09CT("risk_info")
    public final String riskInfo;

    public AgentBridgePayRequestPaymentDetails() {
        this(null, null);
    }

    public AgentBridgePayRequestPaymentDetails(List<AgentBridgePayRequestPaymentDetailItem> list, String str) {
        this.paymentDetailItems = list;
        this.riskInfo = str;
    }
}
