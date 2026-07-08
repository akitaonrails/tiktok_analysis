package com.bytedance.pipo.verify.base.network.api;

import X.C0X52;
import X.C1706960uWM;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.bytedance.pipo.verify.base.model.response.VerifyEventTrackingRequest;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface VerifyTrackApi {
    public static final C1706960uWM LIZ = C1706960uWM.LIZ;

    @InterfaceC1501170pAR("/payment/v1/risk/verify_event_tracking")
    Object verifyEventTracking(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg VerifyEventTrackingRequest verifyEventTrackingRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
