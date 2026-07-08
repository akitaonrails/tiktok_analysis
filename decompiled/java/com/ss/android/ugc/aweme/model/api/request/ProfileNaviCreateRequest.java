package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC19484711Kz;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviCreateResponse;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileNaviCreateRequest {
    public static final Api LIZ;

    public interface Api {
        @InterfaceC1501170pAR("tiktok/v1/navi/create/")
        AbstractC19484711Kz<ProfileNaviCreateResponse> createNavi(@InterfaceC1501070pAH("navi") String str);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = (Api) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofit(C2188811AlT.LIZIZ(sbLIZ), true, Api.class);
    }
}
