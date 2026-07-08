package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C09CT;
import X.C786410Ut5;
import X.EnumC1900710zYr;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorNoticeResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("extra_list")
    public List<? extends MusNotice> extraList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean lobPb;

    @C09CT("notice_list")
    public List<? extends MusNotice> notices;
    public EnumC1900710zYr requestType;

    @C09CT("filter_ids")
    public final List<Integer> resultFilterIds;

    @C09CT("sort_id")
    public final int resultSortId;

    @C09CT("tab_id")
    public final int resultTabId;

    @C09CT("class_tab_metadatas")
    public List<NoticeTabModel> tabDataModel;

    @C09CT("total")
    public final int total;

    @C09CT("unread_activity_notice_count")
    public final int unreadCount;

    public final CreatorNoticeResponse copy(List<? extends MusNotice> list, List<NoticeTabModel> list2, String str, int i, int i2, List<Integer> list3, int i3, boolean z, List<? extends MusNotice> list4, EnumC1900710zYr enumC1900710zYr, int i4, LogPbBean logPbBean) {
        return new CreatorNoticeResponse(list, list2, str, i, i2, list3, i3, z, list4, enumC1900710zYr, i4, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorNoticeResponse)) {
            return false;
        }
        CreatorNoticeResponse creatorNoticeResponse = (CreatorNoticeResponse) obj;
        return Intrinsics.LJFF(this.notices, creatorNoticeResponse.notices) && Intrinsics.LJFF(this.tabDataModel, creatorNoticeResponse.tabDataModel) && Intrinsics.LJFF(this.cursor, creatorNoticeResponse.cursor) && this.total == creatorNoticeResponse.total && this.resultSortId == creatorNoticeResponse.resultSortId && Intrinsics.LJFF(this.resultFilterIds, creatorNoticeResponse.resultFilterIds) && this.resultTabId == creatorNoticeResponse.resultTabId && this.hasMore == creatorNoticeResponse.hasMore && Intrinsics.LJFF(this.extraList, creatorNoticeResponse.extraList) && this.requestType == creatorNoticeResponse.requestType && this.unreadCount == creatorNoticeResponse.unreadCount && Intrinsics.LJFF(this.lobPb, creatorNoticeResponse.lobPb);
    }

    public int hashCode() {
        List<? extends MusNotice> list = this.notices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NoticeTabModel> list2 = this.tabDataModel;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.cursor;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.total) * 31) + this.resultSortId) * 31;
        List<Integer> list3 = this.resultFilterIds;
        int iHashCode4 = (((((iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.resultTabId) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<? extends MusNotice> list4 = this.extraList;
        int iHashCode5 = (((((iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31) + this.requestType.hashCode()) * 31) + this.unreadCount) * 31;
        LogPbBean logPbBean = this.lobPb;
        return iHashCode5 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "CreatorNoticeResponse(notices=" + this.notices + ", tabDataModel=" + this.tabDataModel + ", cursor=" + this.cursor + ", total=" + this.total + ", resultSortId=" + this.resultSortId + ", resultFilterIds=" + this.resultFilterIds + ", resultTabId=" + this.resultTabId + ", hasMore=" + this.hasMore + ", extraList=" + this.extraList + ", requestType=" + this.requestType + ", unreadCount=" + this.unreadCount + ", lobPb=" + this.lobPb + ')';
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<MusNotice> getExtraList() {
        return this.extraList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<MusNotice> getNotices() {
        return this.notices;
    }

    public final EnumC1900710zYr getRequestType() {
        return this.requestType;
    }

    public final List<Integer> getResultFilterIds() {
        return this.resultFilterIds;
    }

    public final int getResultSortId() {
        return this.resultSortId;
    }

    public final int getResultTabId() {
        return this.resultTabId;
    }

    public final List<NoticeTabModel> getTabDataModel() {
        return this.tabDataModel;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final void injectRequestType(EnumC1900710zYr enumC1900710zYr) {
        this.requestType = enumC1900710zYr;
    }

    public final void setExtraList(List<? extends MusNotice> list) {
        this.extraList = list;
    }

    public final void setNotices(List<? extends MusNotice> list) {
        this.notices = list;
    }

    public final void setRequestType(EnumC1900710zYr enumC1900710zYr) {
        this.requestType = enumC1900710zYr;
    }

    public final void setTabDataModel(List<NoticeTabModel> list) {
        this.tabDataModel = list;
    }

    public CreatorNoticeResponse(List<? extends MusNotice> list, List<NoticeTabModel> list2, String str, int i, int i2, List<Integer> list3, int i3, boolean z, List<? extends MusNotice> list4, EnumC1900710zYr enumC1900710zYr, int i4, LogPbBean logPbBean) {
        this.notices = list;
        this.tabDataModel = list2;
        this.cursor = str;
        this.total = i;
        this.resultSortId = i2;
        this.resultFilterIds = list3;
        this.resultTabId = i3;
        this.hasMore = z;
        this.extraList = list4;
        this.requestType = enumC1900710zYr;
        this.unreadCount = i4;
        this.lobPb = logPbBean;
    }
}
