package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class LatestUnreadVideoInfo implements Serializable {

    @C09CT("aweme_info")
    public final Aweme firstAweme;

    @C09CT("total_unread")
    public final int totalUnread;

    public final Aweme getFirstAweme() {
        return this.firstAweme;
    }

    public final int getTotalUnread() {
        return this.totalUnread;
    }
}
