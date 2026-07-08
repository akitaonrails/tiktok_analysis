package com.ss.android.ugc.aweme.im.b2c.landing;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IBusinessLandingMsgAPI {
    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/landing_msg/post")
    Object getBusinessChatLandingMsgV2(@InterfaceC1485405rg LandingMessageRequestBody landingMessageRequestBody, InterfaceC1364105Vn<? super BusinessChatLandingMsgRespV2> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("/tiktok/v2/im/chat/business/first/interact")
    Object syncFirstInteractV2(@InterfaceC1485405rg AdFirstInteractReqBodyV2 adFirstInteractReqBodyV2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
