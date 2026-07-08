package com.ss.android.ugc.aweme.profilerec.network;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.service.profilerec.model.ProfileRecResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface ProfileRecApi {
    @InterfaceC1501200pAU("tiktok/v1/onboarding/config/")
    Object prefetchProfileRec(@InterfaceC1501070pAH("onboarding_profile_user_id") Long l, @InterfaceC1501070pAH("onboarding_profile_username") String str, @InterfaceC1501070pAH("onboarding_profile_type") int i, InterfaceC1364105Vn<? super C0X52<ProfileRecResponse>> interfaceC1364105Vn);
}
