package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListModule extends BaseComponentData implements Serializable {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("items")
    public final List<PoiRecommendFeatureListItem> items;

    @C09CT("cursor")
    public final String nextCursor;

    public PoiRecommendFeatureListModule() {
        this(null, null, null);
    }

    public final PoiRecommendFeatureListModule copy(List<PoiRecommendFeatureListItem> list, String str, Boolean bool) {
        return new PoiRecommendFeatureListModule(list, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureListModule)) {
            return false;
        }
        PoiRecommendFeatureListModule poiRecommendFeatureListModule = (PoiRecommendFeatureListModule) obj;
        return Intrinsics.LJFF(this.items, poiRecommendFeatureListModule.items) && Intrinsics.LJFF(this.nextCursor, poiRecommendFeatureListModule.nextCursor) && Intrinsics.LJFF(this.hasMore, poiRecommendFeatureListModule.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiRecommendFeatureListItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextCursor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureListModule(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<PoiRecommendFeatureListItem> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        if (baseComponentData instanceof PoiRecommendFeatureListModule) {
            PoiRecommendFeatureListModule poiRecommendFeatureListModule = (PoiRecommendFeatureListModule) baseComponentData;
            if (Intrinsics.LJFF(this.items, poiRecommendFeatureListModule.items) && Intrinsics.LJFF(this.nextCursor, poiRecommendFeatureListModule.nextCursor) && Intrinsics.LJFF(this.hasMore, poiRecommendFeatureListModule.hasMore)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public PoiRecommendFeatureListModule(List<PoiRecommendFeatureListItem> list, String str, Boolean bool) {
        this.items = list;
        this.nextCursor = str;
        this.hasMore = bool;
    }
}
