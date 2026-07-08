package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinListResponse {

    @C09CT("item_list")
    public final List<BulletinItem> bulletinItems;

    @C09CT("style_list")
    public final List<BulletinStyleStruct> bulletinStyleStructList;

    @C09CT("current_timestamp")
    public final Long currentTimeStamp;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("viewer_identity_type")
    public final int identity;

    @C09CT("last_read_time")
    public final Long lastReadTime;

    @C09CT("need_located_bulletin_id")
    public final Long lastUnreadBulletinId;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("total")
    public final Integer total;

    @C09CT("unread_count")
    public final int unreadCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinListResponse)) {
            return false;
        }
        BulletinListResponse bulletinListResponse = (BulletinListResponse) obj;
        return this.statusCode == bulletinListResponse.statusCode && Intrinsics.LJFF(this.statusMsg, bulletinListResponse.statusMsg) && Intrinsics.LJFF(this.bulletinItems, bulletinListResponse.bulletinItems) && Intrinsics.LJFF(this.bulletinStyleStructList, bulletinListResponse.bulletinStyleStructList) && Intrinsics.LJFF(this.total, bulletinListResponse.total) && Intrinsics.LJFF(this.nextCursor, bulletinListResponse.nextCursor) && Intrinsics.LJFF(this.hasMore, bulletinListResponse.hasMore) && Intrinsics.LJFF(this.lastReadTime, bulletinListResponse.lastReadTime) && this.unreadCount == bulletinListResponse.unreadCount && Intrinsics.LJFF(this.currentTimeStamp, bulletinListResponse.currentTimeStamp) && this.identity == bulletinListResponse.identity && Intrinsics.LJFF(this.lastUnreadBulletinId, bulletinListResponse.lastUnreadBulletinId) && Intrinsics.LJFF(this.logPb, bulletinListResponse.logPb);
    }

    public String toString() {
        return "BulletinListResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", bulletinItems=" + this.bulletinItems + ", bulletinStyleStructList=" + this.bulletinStyleStructList + ", total=" + this.total + ", nextCursor=" + this.nextCursor + ", hasMore=" + this.hasMore + ", lastReadTime=" + this.lastReadTime + ", unreadCount=" + this.unreadCount + ", currentTimeStamp=" + this.currentTimeStamp + ", identity=" + this.identity + ", lastUnreadBulletinId=" + this.lastUnreadBulletinId + ", logPb=" + this.logPb + ')';
    }

    public BulletinListResponse(int i, String str, List<BulletinItem> list, List<BulletinStyleStruct> list2, Integer num, String str2, Boolean bool, Long l, int i2, Long l2, int i3, Long l3, LogPbBean logPbBean) {
        this.statusCode = i;
        this.statusMsg = str;
        this.bulletinItems = list;
        this.bulletinStyleStructList = list2;
        this.total = num;
        this.nextCursor = str2;
        this.hasMore = bool;
        this.lastReadTime = l;
        this.unreadCount = i2;
        this.currentTimeStamp = l2;
        this.identity = i3;
        this.lastUnreadBulletinId = l3;
        this.logPb = logPbBean;
    }

    public BulletinListResponse(int i, String str, List list, List list2, Integer num, String str2, Boolean bool, Long l, int i2, Long l2, int i3, Long l3, LogPbBean logPbBean, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? C13BV.INSTANCE : list2, (i4 & 16) != 0 ? null : num, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : bool, (i4 & 128) != 0 ? null : l, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? null : l2, (i4 & 1024) != 0 ? 0 : i3, l3, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? logPbBean : null);
    }
}
