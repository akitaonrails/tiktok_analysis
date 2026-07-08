package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxEntranceResponse extends BaseResponse {

    @C09CT("additional_notice_lists")
    public final List<NoticeItems> additionalNotices;

    @C09CT("notice_count_before_mark_read")
    public final List<NoticeCount> beforeMarkNoticeCounts;

    @C09CT("entrance_cells")
    public final List<InboxEntranceCell> entranceCells;

    @C09CT("entrance_count")
    public final List<EntranceCount> entranceCount;

    @C09CT("groups_in_filters")
    public final List<NoticeInboxFilterGroups> groups;

    @C09CT("latest_notice_time")
    public final Long latestNoticeTime;

    @C09CT("notice_count")
    public final List<NoticeCount> noticeCounts;

    @C09CT("server_time")
    public final Long serverTime;

    public InboxEntranceResponse() {
        this(null, null, null, null, null, 0L, null, 0L);
    }

    public final InboxEntranceResponse copy(List<InboxEntranceCell> list, List<EntranceCount> list2, List<NoticeCount> list3, List<NoticeInboxFilterGroups> list4, List<NoticeItems> list5, Long l, List<NoticeCount> list6, Long l2) {
        return new InboxEntranceResponse(list, list2, list3, list4, list5, l, list6, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceResponse)) {
            return false;
        }
        InboxEntranceResponse inboxEntranceResponse = (InboxEntranceResponse) obj;
        return Intrinsics.LJFF(this.entranceCells, inboxEntranceResponse.entranceCells) && Intrinsics.LJFF(this.entranceCount, inboxEntranceResponse.entranceCount) && Intrinsics.LJFF(this.noticeCounts, inboxEntranceResponse.noticeCounts) && Intrinsics.LJFF(this.groups, inboxEntranceResponse.groups) && Intrinsics.LJFF(this.additionalNotices, inboxEntranceResponse.additionalNotices) && Intrinsics.LJFF(this.latestNoticeTime, inboxEntranceResponse.latestNoticeTime) && Intrinsics.LJFF(this.beforeMarkNoticeCounts, inboxEntranceResponse.beforeMarkNoticeCounts) && Intrinsics.LJFF(this.serverTime, inboxEntranceResponse.serverTime);
    }

    public int hashCode() {
        List<InboxEntranceCell> list = this.entranceCells;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<EntranceCount> list2 = this.entranceCount;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NoticeCount> list3 = this.noticeCounts;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NoticeInboxFilterGroups> list4 = this.groups;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<NoticeItems> list5 = this.additionalNotices;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l = this.latestNoticeTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        List<NoticeCount> list6 = this.beforeMarkNoticeCounts;
        int iHashCode7 = (iHashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Long l2 = this.serverTime;
        return iHashCode7 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceResponse(entranceCells=");
        sbLIZ.append(this.entranceCells);
        sbLIZ.append(", entranceCount=");
        sbLIZ.append(this.entranceCount);
        sbLIZ.append(", noticeCounts=");
        sbLIZ.append(this.noticeCounts);
        sbLIZ.append(", groups=");
        sbLIZ.append(this.groups);
        sbLIZ.append(", additionalNotices=");
        sbLIZ.append(this.additionalNotices);
        sbLIZ.append(", latestNoticeTime=");
        sbLIZ.append(this.latestNoticeTime);
        sbLIZ.append(", beforeMarkNoticeCounts=");
        sbLIZ.append(this.beforeMarkNoticeCounts);
        sbLIZ.append(", serverTime=");
        sbLIZ.append(this.serverTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<NoticeItems> getAdditionalNotices() {
        return this.additionalNotices;
    }

    public final List<NoticeCount> getBeforeMarkNoticeCounts() {
        return this.beforeMarkNoticeCounts;
    }

    public final List<InboxEntranceCell> getEntranceCells() {
        return this.entranceCells;
    }

    public final List<EntranceCount> getEntranceCount() {
        return this.entranceCount;
    }

    public final List<NoticeInboxFilterGroups> getGroups() {
        return this.groups;
    }

    public final Long getLatestNoticeTime() {
        return this.latestNoticeTime;
    }

    public final List<NoticeCount> getNoticeCounts() {
        return this.noticeCounts;
    }

    public final Long getServerTime() {
        return this.serverTime;
    }

    public InboxEntranceResponse(List<InboxEntranceCell> list, List<EntranceCount> list2, List<NoticeCount> list3, List<NoticeInboxFilterGroups> list4, List<NoticeItems> list5, Long l, List<NoticeCount> list6, Long l2) {
        this.entranceCells = list;
        this.entranceCount = list2;
        this.noticeCounts = list3;
        this.groups = list4;
        this.additionalNotices = list5;
        this.latestNoticeTime = l;
        this.beforeMarkNoticeCounts = list6;
        this.serverTime = l2;
    }
}
