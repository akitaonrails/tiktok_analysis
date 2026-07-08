package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UnReadVideoInfo implements Serializable {

    @C09CT("latest_unread_video_created_time")
    public long latestUnreadVideoCreatedTime;

    @C09CT("unread_count")
    public int unReadCount;

    public UnReadVideoInfo() {
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public UnReadVideoInfo(int i, long j) {
        this.unReadCount = i;
        this.latestUnreadVideoCreatedTime = j;
    }
}
