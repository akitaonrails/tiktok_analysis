package com.ss.android.ugc.aweme.affinity.api;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialAffinityApi implements ISocialAffinityApi {
    public static final SocialAffinityApi LIZIZ = new SocialAffinityApi();
    public final /* synthetic */ ISocialAffinityApi LIZ = (ISocialAffinityApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(ISocialAffinityApi.class);

    @Override // com.ss.android.ugc.aweme.affinity.api.ISocialAffinityApi
    @InterfaceC1501160pAQ("/tiktok/v1/affinity/scores")
    public Object fetchSocialAffinity(@InterfaceC1501070pAH("requests") String str, @InterfaceC1501070pAH("ab_params") String str2, InterfaceC1364105Vn<? super SocialAffinityResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137942);
        Object objFetchSocialAffinity = this.LIZ.fetchSocialAffinity(str, str2, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objFetchSocialAffinity;
    }
}
