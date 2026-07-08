package com.ss.android.ugc.aweme.story.model;

import X.C330630Cxh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes5.dex */
public interface FriendInteractionContentReuseApi {
    public static final C330630Cxh LIZ = C330630Cxh.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/friend/interaction/content_reuse")
    Object getForUser(@InterfaceC1501070pAH("user_id") String str, InterfaceC1364105Vn<? super ContentReuseResponse> interfaceC1364105Vn);
}
