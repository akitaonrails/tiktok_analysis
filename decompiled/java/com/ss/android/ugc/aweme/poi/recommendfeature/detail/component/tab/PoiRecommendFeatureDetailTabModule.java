package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailTabModule extends BaseComponentData implements Serializable {

    @C09CT("current_id")
    public final String currentId;

    @C09CT("tabs")
    public final List<PoiRecommendFeatureDetailTabItem> tabs;

    public PoiRecommendFeatureDetailTabModule() {
        this(null, null);
    }

    public final PoiRecommendFeatureDetailTabModule copy(List<PoiRecommendFeatureDetailTabItem> list, String str) {
        return new PoiRecommendFeatureDetailTabModule(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureDetailTabModule)) {
            return false;
        }
        PoiRecommendFeatureDetailTabModule poiRecommendFeatureDetailTabModule = (PoiRecommendFeatureDetailTabModule) obj;
        return Intrinsics.LJFF(this.tabs, poiRecommendFeatureDetailTabModule.tabs) && Intrinsics.LJFF(this.currentId, poiRecommendFeatureDetailTabModule.currentId);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiRecommendFeatureDetailTabItem> list = this.tabs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.currentId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailTabModule(tabs=");
        sbLIZ.append(this.tabs);
        sbLIZ.append(", currentId=");
        sbLIZ.append(this.currentId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int resolveSelectedIndex() {
        List<PoiRecommendFeatureDetailTabItem> list = this.tabs;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str = this.currentId;
        if (str != null && str.length() != 0) {
            Iterator<PoiRecommendFeatureDetailTabItem> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().id, str)) {
                    i++;
                } else if (i >= 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final String getCurrentId() {
        return this.currentId;
    }

    public final List<PoiRecommendFeatureDetailTabItem> getTabs() {
        return this.tabs;
    }

    public PoiRecommendFeatureDetailTabModule(List<PoiRecommendFeatureDetailTabItem> list, String str) {
        this.tabs = list;
        this.currentId = str;
    }
}
