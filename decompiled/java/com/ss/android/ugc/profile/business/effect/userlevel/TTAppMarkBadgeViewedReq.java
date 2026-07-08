package com.ss.android.ugc.profile.business.effect.userlevel;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class TTAppMarkBadgeViewedReq {
    public static final int $stable = 0;

    @C09CT("badge_id")
    public final int badgeId;

    public TTAppMarkBadgeViewedReq() {
        this(0);
    }

    public TTAppMarkBadgeViewedReq(int i) {
        this.badgeId = i;
    }
}
