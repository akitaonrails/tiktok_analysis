package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxAggregateListResponse extends BaseResponse {

    @C09CT("top_info")
    public final AggTopInfo aggTopInfo;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("empty_description")
    public final String emptyDesc;

    @C09CT("end_list_description")
    public final String endListDescription;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("notice_agg_detail_infos")
    public final List<MusNotice> items;

    @C09CT("total")
    public final Long total;

    public InboxAggregateListResponse() {
        this(null, null, null, null, null, null, null);
    }

    public final InboxAggregateListResponse copy(Boolean bool, Long l, String str, String str2, AggTopInfo aggTopInfo, List<? extends MusNotice> list, String str3) {
        return new InboxAggregateListResponse(bool, l, str, str2, aggTopInfo, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxAggregateListResponse)) {
            return false;
        }
        InboxAggregateListResponse inboxAggregateListResponse = (InboxAggregateListResponse) obj;
        return Intrinsics.LJFF(this.hasMore, inboxAggregateListResponse.hasMore) && Intrinsics.LJFF(this.total, inboxAggregateListResponse.total) && Intrinsics.LJFF(this.cursor, inboxAggregateListResponse.cursor) && Intrinsics.LJFF(this.emptyDesc, inboxAggregateListResponse.emptyDesc) && Intrinsics.LJFF(this.aggTopInfo, inboxAggregateListResponse.aggTopInfo) && Intrinsics.LJFF(this.items, inboxAggregateListResponse.items) && Intrinsics.LJFF(this.endListDescription, inboxAggregateListResponse.endListDescription);
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.total;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.cursor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emptyDesc;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AggTopInfo aggTopInfo = this.aggTopInfo;
        int iHashCode5 = (iHashCode4 + (aggTopInfo == null ? 0 : aggTopInfo.hashCode())) * 31;
        List<MusNotice> list = this.items;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.endListDescription;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxAggregateListResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", emptyDesc=");
        sbLIZ.append(this.emptyDesc);
        sbLIZ.append(", aggTopInfo=");
        sbLIZ.append(this.aggTopInfo);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", endListDescription=");
        sbLIZ.append(this.endListDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AggTopInfo getAggTopInfo() {
        return this.aggTopInfo;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getEmptyDesc() {
        return this.emptyDesc;
    }

    public final String getEndListDescription() {
        return this.endListDescription;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MusNotice> getItems() {
        return this.items;
    }

    public final Long getTotal() {
        return this.total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxAggregateListResponse(Boolean bool, Long l, String str, String str2, AggTopInfo aggTopInfo, List<? extends MusNotice> list, String str3) {
        this.hasMore = bool;
        this.total = l;
        this.cursor = str;
        this.emptyDesc = str2;
        this.aggTopInfo = aggTopInfo;
        this.items = list;
        this.endListDescription = str3;
    }
}
