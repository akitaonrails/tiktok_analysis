package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeItems {

    @C09CT("common_last_read_time")
    public final long commonLastReadTime;

    @C09CT("common_last_read_time_for_friend")
    public final long commonLastReadTimeForFriends;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("group")
    public final int group;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("notice_list")
    public List<? extends MusNotice> items;

    @C09CT("last_read_time")
    public final long lastReadTime;

    @C09CT("list_type")
    public final int listType;

    @C09CT("max_time")
    public final long maxTime;

    @C09CT("min_time")
    public final long minTime;

    @C09CT("total")
    public final int total;

    @C09CT("unread_activity_notice_count")
    public final int unreadCount;

    public NoticeItems() {
        this(null, false, 0, 0L, 0L, 0L, 0, 0, 0L, 0L, "", 0);
    }

    public String toString() {
        return "NoticeItems(items=" + this.items + ", hasMore=" + this.hasMore + ", total=" + this.total + ", maxTime=" + this.maxTime + ", minTime=" + this.minTime + ", lastReadTime=" + this.lastReadTime + ", group=" + this.group + ", listType=" + this.listType + ", commonLastReadTime=" + this.commonLastReadTime + ", commonLastReadTimeForFriends=" + this.commonLastReadTimeForFriends + ", cursor=" + this.cursor + ", unreadCount=" + this.unreadCount + ')';
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<? extends MusNotice> list) {
        this.items = list;
    }

    public NoticeItems(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3, int i2, int i3, long j4, long j5, String str, int i4) {
        this.items = list;
        this.hasMore = z;
        this.total = i;
        this.maxTime = j;
        this.minTime = j2;
        this.lastReadTime = j3;
        this.group = i2;
        this.listType = i3;
        this.commonLastReadTime = j4;
        this.commonLastReadTimeForFriends = j5;
        this.cursor = str;
        this.unreadCount = i4;
    }
}
