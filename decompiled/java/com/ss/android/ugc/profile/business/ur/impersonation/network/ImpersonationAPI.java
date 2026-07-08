package com.ss.android.ugc.profile.business.ur.impersonation.network;

import X.C1436305jl;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface ImpersonationAPI {
    public static final C1436305jl LIZ = C1436305jl.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/account/confirm_change")
    @InterfaceC1501300pAe
    Object confirmChange(@InterfaceC1501100pAK("user_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
