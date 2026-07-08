package com.ss.android.ugc.aweme.relation.api;

import X.C09S2;
import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class SocialFollowApi implements RealSocialFollowApi {
    public static final SocialFollowApi LIZIZ = new SocialFollowApi();
    public final /* synthetic */ RealSocialFollowApi LIZ = (RealSocialFollowApi) C09S2.LIZJ(RealSocialFollowApi.class, C0CQT.LIZJ);

    @Override // com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commit/follow/user/")
    public Object followOfflineWithRetrofitPost(@InterfaceC1501150pAP Map<String, String> map, InterfaceC1364105Vn<? super FollowStatus> interfaceC1364105Vn) {
        return this.LIZ.followOfflineWithRetrofitPost(map, interfaceC1364105Vn);
    }
}
