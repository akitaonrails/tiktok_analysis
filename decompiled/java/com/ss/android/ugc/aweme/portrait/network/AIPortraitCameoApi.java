package com.ss.android.ugc.aweme.portrait.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.theater.model.CameoData;

/* JADX INFO: loaded from: classes9.dex */
public interface AIPortraitCameoApi {
    @InterfaceC1501160pAQ("/api/cameo/draft/list")
    Object getCameoDraftList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("business_list") String str, InterfaceC1364105Vn<? super AIPortraitCameoResponse<AIPortraitCameoDraftListData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/cameo/post/list")
    Object getCameoPostList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("uid") String str, @InterfaceC1501070pAH("business_list") String str2, InterfaceC1364105Vn<? super AIPortraitCameoResponse<CameoData>> interfaceC1364105Vn);
}
