package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class BulletinInviteButtonData {

    @C09CT("channel_id")
    public final Long bbId;

    @C09CT("channel_owner_id")
    public final String channelOwnId;

    @C09CT("subscription_info")
    public final BulletinSubscriptionInfo subscriptionInfo;

    public BulletinInviteButtonData(Long l, BulletinSubscriptionInfo bulletinSubscriptionInfo, String str) {
        this.bbId = l;
        this.subscriptionInfo = bulletinSubscriptionInfo;
        this.channelOwnId = str;
    }
}
