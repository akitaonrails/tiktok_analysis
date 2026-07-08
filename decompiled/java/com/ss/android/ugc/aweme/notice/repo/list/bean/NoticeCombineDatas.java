package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class NoticeCombineDatas {

    @C09CT("creator_notification")
    public List<NoticeItems> creatorNotification;

    @C09CT("live_message")
    public List<CombineLiveNotice> liveNotices;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("top_live")
    public RecommendAvatars recommendAvatars;

    @C09CT("report_inbox")
    public final List<NoticeItems> reportNotice;

    @C09CT("shop_creator_inbox")
    public List<NoticeItems> shopCreator;

    @C09CT("tiktok_shop_inbox")
    public List<NoticeItems> shopNotice;

    @C09CT("show_following_popup")
    public final Boolean showFollowingPopup;

    public NoticeCombineDatas() {
        this(null, null, null, null, null, null, null, null);
    }

    public final void setCreatorNotification(List<NoticeItems> list) {
        this.creatorNotification = list;
    }

    public final void setLiveNotices(List<CombineLiveNotice> list) {
        this.liveNotices = list;
    }

    public final void setRecommendAvatars(RecommendAvatars recommendAvatars) {
        this.recommendAvatars = recommendAvatars;
    }

    public final void setShopCreator(List<NoticeItems> list) {
        this.shopCreator = list;
    }

    public final void setShopNotice(List<NoticeItems> list) {
        this.shopNotice = list;
    }

    public NoticeCombineDatas(RecommendAvatars recommendAvatars, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3, List<NoticeItems> list4, List<NoticeItems> list5, LogPbBean logPbBean, Boolean bool) {
        this.recommendAvatars = recommendAvatars;
        this.liveNotices = list;
        this.shopNotice = list2;
        this.shopCreator = list3;
        this.creatorNotification = list4;
        this.reportNotice = list5;
        this.logPb = logPbBean;
        this.showFollowingPopup = bool;
    }
}
