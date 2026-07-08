package com.ss.android.ugc.aweme.pipo.cashier.cashier.api;

import X.C0X52;
import X.C1708790uZJ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface CashierApi {
    public static final C1708790uZJ LIZ = C1708790uZJ.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/payin_basic_info")
    Object cashierBasicInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg CashierBasicInfoRequest cashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<CashierBasicInfoData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/basic_info_v3")
    Object cashierBasicInfoV3(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg CashierBasicInfoRequest cashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<CashierPaymentOptionInfoResp>>> interfaceC1364105Vn);
}
