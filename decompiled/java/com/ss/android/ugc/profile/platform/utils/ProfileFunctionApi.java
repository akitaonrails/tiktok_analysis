package com.ss.android.ugc.profile.platform.utils;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileFunctionApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/profile/record/v1")
    C11NZ<BaseResponse> recordSemiClick(@InterfaceC1501050pAF("action_type") int i, @InterfaceC1501050pAF("component_name") String str);
}
