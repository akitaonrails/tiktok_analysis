package com.ss.android.ugc.aweme.search.common.repo;

import X.C11NZ;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchContinuousLoadingApi {
    @InterfaceC1501240pAY("/aweme/v1/search/loadmore/")
    @InterfaceC1501300pAe
    C11NZ<ContinuousLoadingAwemeList> getAwemeList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_UID) String str2, @InterfaceC1501100pAK("cursor") int i2, @InterfaceC1501100pAK("count") int i3, @InterfaceC1501100pAK("last_create_time") long j);
}
