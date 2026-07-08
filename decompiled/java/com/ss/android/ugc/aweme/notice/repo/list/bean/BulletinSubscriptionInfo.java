package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSubscriptionInfo {

    @C09CT("no_need_follow_on_subscribe")
    public final boolean noNeedFollowOnSubscribe;

    @C09CT("subscribe_status")
    public final int subscribeStatus;

    public BulletinSubscriptionInfo() {
        this(-1, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSubscriptionInfo(subscribeStatus=");
        sbLIZ.append(this.subscribeStatus);
        sbLIZ.append(", noNeedFollowOnSubscribe=");
        sbLIZ.append(this.noNeedFollowOnSubscribe);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinSubscriptionInfo(int i, boolean z) {
        this.subscribeStatus = i;
        this.noNeedFollowOnSubscribe = z;
    }
}
