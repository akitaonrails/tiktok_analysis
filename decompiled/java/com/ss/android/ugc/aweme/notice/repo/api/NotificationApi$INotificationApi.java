package com.ss.android.ugc.aweme.notice.repo.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;

/* JADX INFO: loaded from: classes5.dex */
public interface NotificationApi$INotificationApi {
    @InterfaceC1501160pAQ("/aweme/v1/feedback/cancel/")
    C0X9S<String> cancelFeedback();

    @InterfaceC1501160pAQ("/aweme/v1/notice/count/")
    C0X9S<NoticeList> query(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("ab_settings") String str, @InterfaceC1501070pAH("need_hv_follow_count") boolean z, @InterfaceC1501070pAH("need_latest_notice_time") boolean z2, @InterfaceC1501070pAH("need_latest_unread_notice_time") boolean z3);
}
