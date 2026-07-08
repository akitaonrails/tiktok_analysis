package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CollectionListResponse extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("item_archive_detail_list")
    public List<CollectionDetail> items;

    @C09CT("pin_section")
    public List<CollectionDetail> pinSection;

    @C09CT("total")
    public final Long total;

    public CollectionListResponse() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionListResponse)) {
            return false;
        }
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        return Intrinsics.LJFF(this.items, collectionListResponse.items) && Intrinsics.LJFF(this.pinSection, collectionListResponse.pinSection) && Intrinsics.LJFF(this.cursor, collectionListResponse.cursor) && Intrinsics.LJFF(this.hasMore, collectionListResponse.hasMore) && Intrinsics.LJFF(this.total, collectionListResponse.total);
    }

    public final int hashCode() {
        List<CollectionDetail> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CollectionDetail> list2 = this.pinSection;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.cursor;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.total;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionListResponse(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", pinSection=");
        sbLIZ.append(this.pinSection);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionListResponse(List<CollectionDetail> list, List<CollectionDetail> list2, Long l, Boolean bool, Long l2) {
        this.items = list;
        this.pinSection = list2;
        this.cursor = l;
        this.hasMore = bool;
        this.total = l2;
    }
}
