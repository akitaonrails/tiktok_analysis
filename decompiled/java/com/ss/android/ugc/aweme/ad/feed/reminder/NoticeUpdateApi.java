package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;

/* JADX INFO: loaded from: classes29.dex */
public interface NoticeUpdateApi {
    @InterfaceC1501170pAR("/tiktok/v1/ad/notice/update/")
    C11NZ<AdNoticeModel> postAdNotice(@InterfaceC1501070pAH("biz") int i, @InterfaceC1501070pAH("creative_id") String str, @InterfaceC1501070pAH("enable_notice") Boolean bool, @InterfaceC1501070pAH("log_id") String str2);
}
