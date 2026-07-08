package com.ss.android.ugc.profile.business.ur.alias;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.ur.alias.AliasListResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface UserAliasApi {
    @InterfaceC1501160pAQ("/tiktok/user/relation/alias/list/v1")
    Object fetchAliasList(InterfaceC1364105Vn<? super AliasListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/user/relation/alias/update/v1")
    Object updateUserAlias(@InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("sec_to_uid") String str2, @InterfaceC1501070pAH("alias") String str3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
