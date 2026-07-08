package com.bytedance.pipo.ttpay.recharge.network;

import X.C0X52;
import X.C1505720pHm;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface RechargeApi {
    public static final C1505720pHm LIZ = C1505720pHm.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/payin_basic_info")
    Object cashierBasicInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg CashierBasicInfoRequest cashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/wallet/consult")
    Object consult(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg ConsultRequest consultRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ConsultResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/wallet/get_order_info")
    Object getOrderInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg GetOrderInfoRequest getOrderInfoRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetOrderInfoResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("cashier/client/v1/pre_deal_payment_info")
    Object preDealPaymentInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg PreDealPaymentRequest preDealPaymentRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<PreDealPaymentResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("wallet/v1/topup/submit")
    Object submitPayment(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg SubmitPaymentRequest submitPaymentRequest, InterfaceC1364105Vn<? super C0X52<Response>> interfaceC1364105Vn);
}
