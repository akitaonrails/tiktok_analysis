package com.ss.android.ugc.profile.business.ur.edit.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C1254360ikM;
import X.InterfaceC1485505rh;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface Lemon8API {
    public static final C1254360ikM LIZ = C1254360ikM.LIZ;

    @InterfaceC1501240pAY("/tiktok/lemon8/bind/v1")
    @InterfaceC1485505rh
    AbstractC19484711Kz<Lemon8BindResponse> LIZ(@InterfaceC1501100pAK("code") String str);

    @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
    C11NZ<BaseResponse> setUserSetting(@InterfaceC1501070pAH("field") String str, @InterfaceC1501070pAH("value") int i);

    @InterfaceC1501200pAU("/tiktok/lemon8/unbind/v1")
    AbstractC19484711Kz<BaseResponse> unBind();
}
