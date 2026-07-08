package com.ss.android.ugc.aweme.live.toplives.notifications.repo;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.android.live.network.response.BaseResponse;
import webcast.api.feed.TopliveNoticeData;
import webcast.api.feed.TopliveNoticeExtra;
import webcast.api.feed.TopliveNoticeOperateResponse;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveNoticeActivityApi {
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    @InterfaceC1501170pAR("/webcast/feed/toplive_notice/unread_count/")
    C11NZ<C470590Icr<TopliveNoticeUnreadCountData>> getLiveNotificationUnread(@InterfaceC1501070pAH("user_id") long j);

    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    @InterfaceC1501170pAR("/webcast/feed/toplive_notice/list/")
    C11NZ<BaseResponse<TopliveNoticeData, TopliveNoticeExtra>> getLiveNotifications(@InterfaceC1501070pAH("last_notice_id") long j, @InterfaceC1501070pAH("last_notice_create_time") long j2);

    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(3)
    @InterfaceC1501170pAR("/webcast/feed/toplive_notice/operate/")
    C11NZ<C470590Icr<TopliveNoticeOperateResponse>> operateLiveNotification(@InterfaceC1501070pAH("notice_id") long j, @InterfaceC1501070pAH("operate_type") int i);
}
