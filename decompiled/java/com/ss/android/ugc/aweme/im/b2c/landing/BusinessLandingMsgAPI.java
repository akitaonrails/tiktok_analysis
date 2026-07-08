package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLandingMsgAPI implements IBusinessLandingMsgAPI {
    public static final BusinessLandingMsgAPI LIZIZ = new BusinessLandingMsgAPI();
    public final /* synthetic */ IBusinessLandingMsgAPI LIZ = (IBusinessLandingMsgAPI) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IBusinessLandingMsgAPI.class);

    @Override // com.ss.android.ugc.aweme.im.b2c.landing.IBusinessLandingMsgAPI
    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/landing_msg/post")
    public Object getBusinessChatLandingMsgV2(@InterfaceC1485405rg LandingMessageRequestBody landingMessageRequestBody, InterfaceC1364105Vn<? super BusinessChatLandingMsgRespV2> interfaceC1364105Vn) {
        return this.LIZ.getBusinessChatLandingMsgV2(landingMessageRequestBody, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.landing.IBusinessLandingMsgAPI
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("/tiktok/v2/im/chat/business/first/interact")
    public Object syncFirstInteractV2(@InterfaceC1485405rg AdFirstInteractReqBodyV2 adFirstInteractReqBodyV2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.syncFirstInteractV2(adFirstInteractReqBodyV2, interfaceC1364105Vn);
    }
}
