package com.ss.android.ugc.aweme.component.verify;

import X.C0X52;
import X.C1717560unS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinChangeConsultResult;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinForgotConsultResult;

/* JADX INFO: loaded from: classes27.dex */
public interface PinApi {
    public static final C1717560unS LIZ = C1717560unS.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/user/consult_change_pin")
    Object consultChangePin(@InterfaceC1501070pAH("risk_info") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<PinChangeConsultResult>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/consult_forgot_pin")
    Object consultForgotPin(@InterfaceC1501070pAH("risk_info") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<PinForgotConsultResult>>> interfaceC1364105Vn);
}
