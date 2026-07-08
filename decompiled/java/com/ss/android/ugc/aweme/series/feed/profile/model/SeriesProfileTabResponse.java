package com.ss.android.ugc.aweme.series.feed.profile.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesProfileTabResponse extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("list")
    public final List<SeriesProfileTabItemModel> seriesProfileTabItems;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesProfileTabResponse)) {
            return false;
        }
        SeriesProfileTabResponse seriesProfileTabResponse = (SeriesProfileTabResponse) obj;
        return Intrinsics.LJFF(this.seriesProfileTabItems, seriesProfileTabResponse.seriesProfileTabItems) && Intrinsics.LJFF(this.cursor, seriesProfileTabResponse.cursor) && Intrinsics.LJFF(this.hasMore, seriesProfileTabResponse.hasMore);
    }

    public final int hashCode() {
        List<SeriesProfileTabItemModel> list = this.seriesProfileTabItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileTabResponse(seriesProfileTabItems=");
        sbLIZ.append(this.seriesProfileTabItems);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesProfileTabResponse() {
        this(new ArrayList(), 0L, Boolean.FALSE);
    }

    public SeriesProfileTabResponse(List<SeriesProfileTabItemModel> list, Long l, Boolean bool) {
        this.seriesProfileTabItems = list;
        this.cursor = l;
        this.hasMore = bool;
    }
}
