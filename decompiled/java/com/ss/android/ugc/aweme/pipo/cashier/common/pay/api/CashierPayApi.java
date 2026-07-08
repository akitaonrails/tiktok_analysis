package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C0X52;
import X.C1707120uWc;
import X.C1708770uZH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface CashierPayApi {
    public static final C1708770uZH LIZ = C1708770uZH.LIZ;

    @InterfaceC1501170pAR("/payment/v1/client/pay")
    Object pay(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg PayRequest payRequest, InterfaceC1364105Vn<? super C0X52<C1707120uWc>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/get_binding_result")
    Object queryBindingResult(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg GeneralQueryRequestBody generalQueryRequestBody, InterfaceC1364105Vn<? super C0X52<BaseResponse<GeneralQueryResultData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/query_trade_result")
    Object queryTradeResult(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg TradeQueryRequest tradeQueryRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<TradeQueryResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/upload_pay_info")
    Object uploadPayInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg UploadPayInfoRequest uploadPayInfoRequest, InterfaceC1364105Vn<? super C0X52<C1707120uWc>> interfaceC1364105Vn);
}
