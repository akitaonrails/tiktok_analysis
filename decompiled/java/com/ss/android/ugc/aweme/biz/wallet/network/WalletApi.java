package com.ss.android.ugc.aweme.biz.wallet.network;

import X.C0X52;
import X.C1717570unT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.OpenStateResult;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;

/* JADX INFO: loaded from: classes27.dex */
public interface WalletApi {
    public static final C1717570unT LIZ = C1717570unT.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/user/create_user")
    Object createUser(@InterfaceC1501070pAH("risk_info") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/create_user_agreement")
    Object createUserAgreement(@InterfaceC1501070pAH("risk_info") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/register_flow_decision")
    Object getRegisterFlowDecision(@InterfaceC1501370pAl("pipo-fp-token") String str, @InterfaceC1501370pAl("pipo-fp-session-id") String str2, @InterfaceC1501100pAK("merchant_id") String str3, @InterfaceC1501070pAH("biz_content") String str4, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/register_flow_decision")
    Object getRegisterFlowDecisionV2(@InterfaceC1501370pAl("pipo-fp-token") String str, @InterfaceC1501370pAl("pipo-fp-session-id") String str2, @InterfaceC1485405rg CommonBizContentRequestWrapper commonBizContentRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/open_account")
    Object openCaAccount(@InterfaceC1501070pAH("risk_info") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/query_account_open_result")
    Object queryAccountOpenResult(InterfaceC1364105Vn<? super C0X52<BaseResponse<OpenStateResult>>> interfaceC1364105Vn);
}
