package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC19484711Kz;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviStarterAvatarListResponse;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import java.util.Collections;

/* JADX INFO: loaded from: classes14.dex */
public final class ProfileNaviStarterAvatarListRequest {
    public static final Api LIZ;

    /* JADX INFO: loaded from: classes4.dex */
    public interface Api {
        @InterfaceC1501160pAQ("tiktok/v1/navi/candidates/")
        AbstractC19484711Kz<ProfileNaviStarterAvatarListResponse> getStarterAvatar(@InterfaceC1501070pAH("transparent_candidates_required") String str, @InterfaceC1501070pAH("scenario") int i, @InterfaceC1501070pAH("panel") String str2);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = (Api) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofitWithInterceptors(C2188811AlT.LIZIZ(sbLIZ), true, Api.class, Collections.singletonList(new EPRequestInterceptor()));
    }
}
