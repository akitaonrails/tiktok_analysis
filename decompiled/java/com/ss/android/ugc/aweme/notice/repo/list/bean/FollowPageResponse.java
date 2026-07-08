package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowPageResponse extends BaseResponse {

    @C09CT("common_last_read_time")
    public final long commonLastReadTime;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("follow_page_list")
    public final List<FollowPageData> data;

    @C09CT("follow_req_offset")
    public final long followReqOffset;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean lobPb;

    @C09CT("noticeLastReadTime")
    public final long noticeLastReadTime;

    @C09CT("notice_max_time")
    public final long noticeMaxTime;

    @C09CT("notice_min_time")
    public final long noticeMinTime;

    @C09CT("total")
    public final int total;

    @C09CT("unread_count")
    public final int unreadCount;

    public FollowPageResponse() {
        this(0, false, 0L, 0L, 0L, 0L, null, 0L, null, 0, "");
    }

    public final FollowPageResponse copy(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list, long j5, LogPbBean logPbBean, int i2, String str) {
        return new FollowPageResponse(i, z, j, j2, j3, j4, list, j5, logPbBean, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageResponse)) {
            return false;
        }
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        return this.total == followPageResponse.total && this.hasMore == followPageResponse.hasMore && this.followReqOffset == followPageResponse.followReqOffset && this.noticeMaxTime == followPageResponse.noticeMaxTime && this.noticeMinTime == followPageResponse.noticeMinTime && this.noticeLastReadTime == followPageResponse.noticeLastReadTime && Intrinsics.LJFF(this.data, followPageResponse.data) && this.commonLastReadTime == followPageResponse.commonLastReadTime && Intrinsics.LJFF(this.lobPb, followPageResponse.lobPb) && this.unreadCount == followPageResponse.unreadCount && Intrinsics.LJFF(this.cursor, followPageResponse.cursor);
    }

    public int hashCode() {
        int iZ2 = ((((((((((this.total * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.followReqOffset)) * 31) + C786410Ut5.Y2(this.noticeMaxTime)) * 31) + C786410Ut5.Y2(this.noticeMinTime)) * 31) + C786410Ut5.Y2(this.noticeLastReadTime)) * 31;
        List<FollowPageData> list = this.data;
        int iHashCode = (((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.commonLastReadTime)) * 31;
        LogPbBean logPbBean = this.lobPb;
        return ((((iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + this.unreadCount) * 31) + this.cursor.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "FollowPageResponse(total=" + this.total + ", hasMore=" + this.hasMore + ", followReqOffset=" + this.followReqOffset + ", noticeMaxTime=" + this.noticeMaxTime + ", noticeMinTime=" + this.noticeMinTime + ", noticeLastReadTime=" + this.noticeLastReadTime + ", data=" + this.data + ", commonLastReadTime=" + this.commonLastReadTime + ", lobPb=" + this.lobPb + ", unreadCount=" + this.unreadCount + ", cursor=" + this.cursor + ')';
    }

    public final long getCommonLastReadTime() {
        return this.commonLastReadTime;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<FollowPageData> getData() {
        return this.data;
    }

    public final long getFollowReqOffset() {
        return this.followReqOffset;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final long getNoticeLastReadTime() {
        return this.noticeLastReadTime;
    }

    public final long getNoticeMaxTime() {
        return this.noticeMaxTime;
    }

    public final long getNoticeMinTime() {
        return this.noticeMinTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public FollowPageResponse(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list, long j5, LogPbBean logPbBean, int i2, String str) {
        this.total = i;
        this.hasMore = z;
        this.followReqOffset = j;
        this.noticeMaxTime = j2;
        this.noticeMinTime = j3;
        this.noticeLastReadTime = j4;
        this.data = list;
        this.commonLastReadTime = j5;
        this.lobPb = logPbBean;
        this.unreadCount = i2;
        this.cursor = str;
    }
}
