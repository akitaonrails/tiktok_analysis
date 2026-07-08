package com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SimpleBulletinBoardInfo {

    @C09CT("bulletin_account")
    public final BulletinBoardInfo accountInfo;

    @C09CT("channel_access_control")
    public final BulletinChannelAccessControl channelAccessControl;

    @C09CT("comment_enable")
    public final Boolean commentEnable;

    @C09CT("viewer_identity_type")
    public final int identity;

    @C09CT("plus_post_orders")
    public final List<BulletinPublishAction> plusPostSettingList;

    @C09CT("quick_post_orders")
    public final List<BulletinPublishAction> quickPostSettingList;

    @C09CT("subscription_info")
    public final BulletinSubscriptionInfo subscriptionInfo;

    public SimpleBulletinBoardInfo() {
        this(null, 0, null, null, null, null, null);
    }

    public SimpleBulletinBoardInfo(BulletinBoardInfo bulletinBoardInfo, int i, BulletinSubscriptionInfo bulletinSubscriptionInfo, BulletinChannelAccessControl bulletinChannelAccessControl, List<BulletinPublishAction> list, List<BulletinPublishAction> list2, Boolean bool) {
        this.accountInfo = bulletinBoardInfo;
        this.identity = i;
        this.subscriptionInfo = bulletinSubscriptionInfo;
        this.channelAccessControl = bulletinChannelAccessControl;
        this.quickPostSettingList = list;
        this.plusPostSettingList = list2;
        this.commentEnable = bool;
    }
}
