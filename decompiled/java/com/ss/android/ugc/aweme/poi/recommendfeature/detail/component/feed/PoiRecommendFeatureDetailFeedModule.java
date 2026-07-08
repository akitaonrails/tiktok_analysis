package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailFeedModule extends BaseComponentData implements Serializable {

    @C09CT("data_version")
    public final String dataVersion;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("items")
    public final List<PoiRecommendFeatureDetailFeedItemData> items;

    @C09CT("next_cursor")
    public final String nextCursor;

    public PoiRecommendFeatureDetailFeedModule() {
        this(null, null, null, null);
    }

    public final PoiRecommendFeatureDetailFeedModule copy(List<PoiRecommendFeatureDetailFeedItemData> list, String str, String str2, Boolean bool) {
        return new PoiRecommendFeatureDetailFeedModule(list, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureDetailFeedModule)) {
            return false;
        }
        PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule = (PoiRecommendFeatureDetailFeedModule) obj;
        return Intrinsics.LJFF(this.items, poiRecommendFeatureDetailFeedModule.items) && Intrinsics.LJFF(this.nextCursor, poiRecommendFeatureDetailFeedModule.nextCursor) && Intrinsics.LJFF(this.dataVersion, poiRecommendFeatureDetailFeedModule.dataVersion) && Intrinsics.LJFF(this.hasMore, poiRecommendFeatureDetailFeedModule.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiRecommendFeatureDetailFeedItemData> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextCursor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dataVersion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailFeedModule(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.dataVersion);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDataVersion() {
        return this.dataVersion;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<PoiRecommendFeatureDetailFeedItemData> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        if (baseComponentData instanceof PoiRecommendFeatureDetailFeedModule) {
            PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule = (PoiRecommendFeatureDetailFeedModule) baseComponentData;
            if (Intrinsics.LJFF(this.items, poiRecommendFeatureDetailFeedModule.items) && Intrinsics.LJFF(this.nextCursor, poiRecommendFeatureDetailFeedModule.nextCursor) && Intrinsics.LJFF(this.dataVersion, poiRecommendFeatureDetailFeedModule.dataVersion) && Intrinsics.LJFF(this.hasMore, poiRecommendFeatureDetailFeedModule.hasMore)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public PoiRecommendFeatureDetailFeedModule(List<PoiRecommendFeatureDetailFeedItemData> list, String str, String str2, Boolean bool) {
        this.items = list;
        this.nextCursor = str;
        this.dataVersion = str2;
        this.hasMore = bool;
    }
}
