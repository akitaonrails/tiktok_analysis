package com.ss.android.ugc.profile.business.ci;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class NavBarBellData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("follow_status")
    public Integer followStatus;

    @C09CT("follow_toast_type")
    public Integer followToastType;

    @C09CT("live_push_notification_status")
    public Integer livePushNotificationStatus;

    @C09CT("post_push_notification_status")
    public Integer postNotificationStatus;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowToastType() {
        return this.followToastType;
    }

    public final Integer getLivePushNotificationStatus() {
        return this.livePushNotificationStatus;
    }

    public final Integer getPostNotificationStatus() {
        return this.postNotificationStatus;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowToastType(Integer num) {
        this.followToastType = num;
    }

    public final void setLivePushNotificationStatus(Integer num) {
        this.livePushNotificationStatus = num;
    }

    public final void setPostNotificationStatus(Integer num) {
        this.postNotificationStatus = num;
    }
}
