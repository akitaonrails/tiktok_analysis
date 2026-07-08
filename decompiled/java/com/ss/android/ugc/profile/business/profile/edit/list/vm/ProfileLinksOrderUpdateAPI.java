package com.ss.android.ugc.profile.business.profile.edit.list.vm;

import X.C11NZ;
import X.C1214380hhs;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface ProfileLinksOrderUpdateAPI {
    public static final C1214380hhs LIZ = C1214380hhs.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commit/user/")
    C11NZ<BaseResponse> updateProfileLinksOrder(@InterfaceC1501050pAF("profile_link_priority") String str);
}
