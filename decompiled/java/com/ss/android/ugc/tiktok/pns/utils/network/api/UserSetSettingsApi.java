package com.ss.android.ugc.tiktok.pns.utils.network.api;

import X.C862930XtD;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.network.model.BaseResponse;

/* JADX INFO: loaded from: classes15.dex */
public interface UserSetSettingsApi {
    public static final C862930XtD LIZ = C862930XtD.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/user/set/settings/")
    Object setUserSetting(@InterfaceC1501070pAH("field") String str, @InterfaceC1501070pAH("value") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
