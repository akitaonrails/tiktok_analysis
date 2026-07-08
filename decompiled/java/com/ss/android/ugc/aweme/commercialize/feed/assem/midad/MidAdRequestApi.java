package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C10GN;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes29.dex */
public interface MidAdRequestApi {
    public static final C10GN LIZ = C10GN.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/ad/long_video/mid_roll/")
    C11NZ<MidAdResponse> request(@InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("recent_items_from_client") String str2, @InterfaceC1501070pAH("long_video_item_id") long j, @InterfaceC1501070pAH("cmpl_enc") String str3, @InterfaceC1501070pAH("ad_user_agent") String str4, @InterfaceC1501070pAH("long_video_req_id") String str5);
}
