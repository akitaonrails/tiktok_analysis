package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMic {
    public static final int $stable = 8;

    @C09CT("audience_id_list")
    public final List<Long> audienceIdList;

    @C09CT("followed_count")
    public final int followedCount;

    @C09CT("show_user_list")
    public final List<LiveUser> followedList;

    public LinkMic() {
        this(null, null, 0);
    }

    public LinkMic(List<LiveUser> list, List<Long> list2, int i) {
        this.followedList = list;
        this.audienceIdList = list2;
        this.followedCount = i;
    }
}
