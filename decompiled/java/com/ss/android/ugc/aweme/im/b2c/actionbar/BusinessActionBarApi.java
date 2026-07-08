package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessActionBarApi implements IBusinessActionBarApi {
    public static final BusinessActionBarApi LIZIZ = new BusinessActionBarApi();
    public final /* synthetic */ IBusinessActionBarApi LIZ = (IBusinessActionBarApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IBusinessActionBarApi.class);

    @Override // com.ss.android.ugc.aweme.im.b2c.actionbar.IBusinessActionBarApi
    @InterfaceC1501170pAR("/tiktok/v1/im/chat/platformization/dynamic_action_bar/post")
    public Object getBusinessActionBarApi(@InterfaceC1485405rg ActionbarRequestBody actionbarRequestBody, InterfaceC1364105Vn<? super BusinessActionBarResponse> interfaceC1364105Vn) {
        return this.LIZ.getBusinessActionBarApi(actionbarRequestBody, interfaceC1364105Vn);
    }
}
