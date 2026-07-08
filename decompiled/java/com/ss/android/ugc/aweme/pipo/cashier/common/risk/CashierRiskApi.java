package com.ss.android.ugc.aweme.pipo.cashier.common.risk;

import X.C0X52;
import X.C1708810uZL;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface CashierRiskApi {
    public static final C1708810uZL LIZ = C1708810uZL.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/authen_pre_risk")
    Object authenPreRisk(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg AuthenPreRiskRequest authenPreRiskRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<AuthenPreRiskResponse>>> interfaceC1364105Vn);
}
