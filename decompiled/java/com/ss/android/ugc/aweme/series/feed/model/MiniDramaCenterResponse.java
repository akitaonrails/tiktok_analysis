package com.ss.android.ugc.aweme.series.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MiniDramaCenterResponse extends BaseResponse {

    @C09CT("collections")
    public final List<ShortDramaOverview> collections;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("filter_list")
    public final Map<String, List<MiniDramaCenterFilterOption>> filterList;

    @C09CT("has_more")
    public final Boolean hasMore;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniDramaCenterResponse)) {
            return false;
        }
        MiniDramaCenterResponse miniDramaCenterResponse = (MiniDramaCenterResponse) obj;
        return Intrinsics.LJFF(this.filterList, miniDramaCenterResponse.filterList) && Intrinsics.LJFF(this.collections, miniDramaCenterResponse.collections) && Intrinsics.LJFF(this.hasMore, miniDramaCenterResponse.hasMore) && Intrinsics.LJFF(this.cursor, miniDramaCenterResponse.cursor);
    }

    public final int hashCode() {
        Map<String, List<MiniDramaCenterFilterOption>> map = this.filterList;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<ShortDramaOverview> list = this.collections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.cursor;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaCenterResponse(filterList=");
        sbLIZ.append(this.filterList);
        sbLIZ.append(", collections=");
        sbLIZ.append(this.collections);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiniDramaCenterResponse(Map<String, ? extends List<MiniDramaCenterFilterOption>> map, List<ShortDramaOverview> list, Boolean bool, String str) {
        this.filterList = map;
        this.collections = list;
        this.hasMore = bool;
        this.cursor = str;
    }
}
