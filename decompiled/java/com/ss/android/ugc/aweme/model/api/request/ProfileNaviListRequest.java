package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC19484711Kz;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviListResponse;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import java.util.Collections;

/* JADX INFO: loaded from: classes14.dex */
public final class ProfileNaviListRequest {
    public static final Api LIZ;

    /* JADX INFO: loaded from: classes30.dex */
    public interface Api {
        @InterfaceC1501160pAQ("tiktok/v1/navi/list/")
        AbstractC19484711Kz<ProfileNaviListResponse> getNaviList(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("panel") String str);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = (Api) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofitWithInterceptors(C2188811AlT.LIZIZ(sbLIZ), true, Api.class, Collections.singletonList(new EPRequestInterceptor()));
    }
}
