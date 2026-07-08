package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C0X52;
import X.C1717530unP;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes27.dex */
public interface AgentBridgeApi {
    public static final C1717530unP LIZ = C1717530unP.LIZ;

    @InterfaceC1501170pAR("/payment/v1/access_token")
    Object acquireAccessToken(@InterfaceC1501350pAj("X-Tt-Token") String str, @InterfaceC1501350pAj("sdk-version") String str2, @InterfaceC1485405rg AcquireAccessTokenRequest acquireAccessTokenRequest, InterfaceC1364105Vn<? super C0X52<AcquireAccessTokenData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/delegate_payment")
    Object delegatePayment(@InterfaceC1501350pAj("pipo-idempotency-id") String str, @InterfaceC1501350pAj("pipo-fp-session-id") String str2, @InterfaceC1501350pAj("pipo-fp-token") String str3, @InterfaceC1485405rg DelegatePaymentRequest delegatePaymentRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/payin_basic_info")
    Object payinBasicInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501350pAj("pipo-fp-token") String str2, @InterfaceC1485405rg PayinBasicInfoRequest payinBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);
}
