package com.ss.android.ugc.profile.business.profile.info.identifier.page.repository;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.model.ProfileIdentifierDetailsRsp;

/* JADX INFO: loaded from: classes4.dex */
public interface ProfileIdentifierAPI {
    @InterfaceC1501160pAQ("/tiktok/user/profile/identifier/details/v1")
    Object getIdentifierDetails(@InterfaceC1501070pAH("scene_id") int i, @InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, InterfaceC1364105Vn<? super ProfileIdentifierDetailsRsp> interfaceC1364105Vn);
}
