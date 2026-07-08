package com.ss.android.ugc.aweme.poi.detail.nearbyv2.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyV2Tab extends BaseComponentData implements Serializable {

    @C09CT("poi_list")
    public final List<PoiGeneralCard> poiList;

    @C09CT("tab_key")
    public final String tabKey;

    @C09CT("tab_name")
    public final String tabName;

    public PoiNearbyV2Tab() {
        this(null, null, null);
    }

    public final PoiNearbyV2Tab copy(String str, String str2, List<PoiGeneralCard> list) {
        return new PoiNearbyV2Tab(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiNearbyV2Tab)) {
            return false;
        }
        PoiNearbyV2Tab poiNearbyV2Tab = (PoiNearbyV2Tab) obj;
        return Intrinsics.LJFF(this.tabName, poiNearbyV2Tab.tabName) && Intrinsics.LJFF(this.tabKey, poiNearbyV2Tab.tabKey) && Intrinsics.LJFF(this.poiList, poiNearbyV2Tab.poiList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.tabName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PoiGeneralCard> list = this.poiList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiNearbyV2Tab(tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabKey=");
        sbLIZ.append(this.tabKey);
        sbLIZ.append(", poiList=");
        sbLIZ.append(this.poiList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PoiGeneralCard> getPoiList() {
        return this.poiList;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public PoiNearbyV2Tab(String str, String str2, List<PoiGeneralCard> list) {
        this.tabName = str;
        this.tabKey = str2;
        this.poiList = list;
    }
}
