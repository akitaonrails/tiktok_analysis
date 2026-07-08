package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;

/* JADX INFO: loaded from: classes29.dex */
public interface AdNoticeApi {
    @InterfaceC1501160pAQ("/tiktok/v1/ad/notice/subscription/status/")
    C11NZ<AdNoticeModel> getAdNotice(@InterfaceC1501070pAH("biz") int i, @InterfaceC1501070pAH("creative_id") String str);
}
