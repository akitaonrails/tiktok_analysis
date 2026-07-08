package com.ss.android.ugc.aweme.pipo.postpayment.impl;

import X.C0X52;
import X.C1706860uWC;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface PostPaymentReportUserActionApi {
    public static final C1706860uWC LIZ = C1706860uWC.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/report_user_action")
    Object reportUserAction(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg ReportUserActionRequest reportUserActionRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
