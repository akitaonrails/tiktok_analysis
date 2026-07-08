package com.ss.android.ugc.aweme.pipo.cashier.refund.api;

import X.C0X52;
import X.C1708780uZI;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfoRequest;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfoWrapper;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundRequest;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface RefundCashierApi {
    public static final C1708780uZI LIZ = C1708780uZI.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/refund_basic_info")
    Object cashierBasicInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg RefundCashierBasicInfoRequest refundCashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<RefundCashierBasicInfoWrapper>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/refund_retry")
    Object requestRefund(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg RefundRequest refundRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
