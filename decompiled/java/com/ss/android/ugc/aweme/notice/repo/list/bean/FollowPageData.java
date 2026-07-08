package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowPageData {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("follow_request")
    public final FollowRequestData followRequest;

    @C09CT("is_priority")
    public final boolean isPriority;
    public long lastReadTime;

    @C09CT("notice")
    public final MusNotice notice;
    public final int type;

    public FollowPageData() {
        this(0, null, null, 0L, 0L, false);
    }

    public final boolean isPriority() {
        return this.isPriority;
    }

    public final void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public FollowPageData(int i, MusNotice musNotice, FollowRequestData followRequestData, long j, long j2, boolean z) {
        this.type = i;
        this.notice = musNotice;
        this.followRequest = followRequestData;
        this.createTime = j;
        this.lastReadTime = j2;
        this.isPriority = z;
    }
}
