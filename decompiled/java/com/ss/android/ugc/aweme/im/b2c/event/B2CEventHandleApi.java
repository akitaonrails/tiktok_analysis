package com.ss.android.ugc.aweme.im.b2c.event;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CEventHandleApi implements IB2CEventHandleApi {
    public static final B2CEventHandleApi LIZIZ = new B2CEventHandleApi();
    public final /* synthetic */ IB2CEventHandleApi LIZ = (IB2CEventHandleApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IB2CEventHandleApi.class);

    @Override // com.ss.android.ugc.aweme.im.b2c.event.IB2CEventHandleApi
    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/event_handle/post")
    public Object reportEvent(@InterfaceC1485405rg B2CEventRequestBody b2CEventRequestBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.reportEvent(b2CEventRequestBody, interfaceC1364105Vn);
    }
}
