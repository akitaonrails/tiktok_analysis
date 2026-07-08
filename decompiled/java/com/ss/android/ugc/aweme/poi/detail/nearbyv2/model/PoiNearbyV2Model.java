package com.ss.android.ugc.aweme.poi.detail.nearbyv2.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyV2Model extends BaseComponentData implements Serializable {

    @C09CT("current_tab_key")
    public final String currentTabKey;

    @C09CT("is_show_tab")
    public final Boolean isShowTab;

    @C09CT("tab_list")
    public final List<PoiNearbyV2Tab> tabList;

    @C09CT("title")
    public final String title;

    public PoiNearbyV2Model() {
        this(null, null, null, null);
    }

    public final PoiNearbyV2Model copy(String str, String str2, Boolean bool, List<PoiNearbyV2Tab> list) {
        return new PoiNearbyV2Model(str, str2, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiNearbyV2Model)) {
            return false;
        }
        PoiNearbyV2Model poiNearbyV2Model = (PoiNearbyV2Model) obj;
        return Intrinsics.LJFF(this.title, poiNearbyV2Model.title) && Intrinsics.LJFF(this.currentTabKey, poiNearbyV2Model.currentTabKey) && Intrinsics.LJFF(this.isShowTab, poiNearbyV2Model.isShowTab) && Intrinsics.LJFF(this.tabList, poiNearbyV2Model.tabList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentTabKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isShowTab;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PoiNearbyV2Tab> list = this.tabList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiNearbyV2Model(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", currentTabKey=");
        sbLIZ.append(this.currentTabKey);
        sbLIZ.append(", isShowTab=");
        sbLIZ.append(this.isShowTab);
        sbLIZ.append(", tabList=");
        sbLIZ.append(this.tabList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCurrentTabKey() {
        return this.currentTabKey;
    }

    public final List<PoiNearbyV2Tab> getTabList() {
        return this.tabList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isShowTab() {
        return this.isShowTab;
    }

    public PoiNearbyV2Model(String str, String str2, Boolean bool, List<PoiNearbyV2Tab> list) {
        this.title = str;
        this.currentTabKey = str2;
        this.isShowTab = bool;
        this.tabList = list;
    }
}
