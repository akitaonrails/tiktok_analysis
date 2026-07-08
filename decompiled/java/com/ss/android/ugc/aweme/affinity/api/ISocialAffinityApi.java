package com.ss.android.ugc.aweme.affinity.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes4.dex */
public interface ISocialAffinityApi {
    @InterfaceC1501160pAQ("/tiktok/v1/affinity/scores")
    Object fetchSocialAffinity(@InterfaceC1501070pAH("requests") String str, @InterfaceC1501070pAH("ab_params") String str2, InterfaceC1364105Vn<? super SocialAffinityResponse> interfaceC1364105Vn);
}
