package com.ss.android.ugc.aweme.relation.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface RealSocialFollowApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commit/follow/user/")
    Object followOfflineWithRetrofitPost(@InterfaceC1501150pAP Map<String, String> map, InterfaceC1364105Vn<? super FollowStatus> interfaceC1364105Vn);
}
