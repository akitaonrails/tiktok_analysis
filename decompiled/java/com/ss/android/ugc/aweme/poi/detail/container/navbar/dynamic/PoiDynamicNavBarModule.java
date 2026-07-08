package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiNavButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShareInfo;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicNavBarModule extends BaseComponentData implements Serializable {

    @C09CT("have_background_top_map")
    public final Integer haveBackgroundTopMap;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_navigation_button_group")
    public final PoiNavButtonGroup poiNavButtonGroup;

    @C09CT("scrolling_bubble_list")
    public final List<PoiScrollingBubble> scrollingBubbleList;

    @C09CT("share_info")
    public final PoiShareInfo shareInfo;

    @C09CT("write_review_enable")
    public final boolean writeReviewEnable;

    public PoiDynamicNavBarModule() {
        this(null, null, null, false, null, null);
    }

    public final PoiDynamicNavBarModule copy(String str, PoiShareInfo poiShareInfo, Integer num, boolean z, PoiNavButtonGroup poiNavButtonGroup, List<PoiScrollingBubble> list) {
        return new PoiDynamicNavBarModule(str, poiShareInfo, num, z, poiNavButtonGroup, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDynamicNavBarModule)) {
            return false;
        }
        PoiDynamicNavBarModule poiDynamicNavBarModule = (PoiDynamicNavBarModule) obj;
        return Intrinsics.LJFF(this.poiName, poiDynamicNavBarModule.poiName) && Intrinsics.LJFF(this.shareInfo, poiDynamicNavBarModule.shareInfo) && Intrinsics.LJFF(this.haveBackgroundTopMap, poiDynamicNavBarModule.haveBackgroundTopMap) && this.writeReviewEnable == poiDynamicNavBarModule.writeReviewEnable && Intrinsics.LJFF(this.poiNavButtonGroup, poiDynamicNavBarModule.poiNavButtonGroup) && Intrinsics.LJFF(this.scrollingBubbleList, poiDynamicNavBarModule.scrollingBubbleList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.poiName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiShareInfo poiShareInfo = this.shareInfo;
        int iHashCode2 = (iHashCode + (poiShareInfo == null ? 0 : poiShareInfo.hashCode())) * 31;
        Integer num = this.haveBackgroundTopMap;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.writeReviewEnable)) * 31;
        PoiNavButtonGroup poiNavButtonGroup = this.poiNavButtonGroup;
        int iHashCode4 = (iHashCode3 + (poiNavButtonGroup == null ? 0 : poiNavButtonGroup.hashCode())) * 31;
        List<PoiScrollingBubble> list = this.scrollingBubbleList;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDynamicNavBarModule(poiName=");
        sbLIZ.append(this.poiName);
        sbLIZ.append(", shareInfo=");
        sbLIZ.append(this.shareInfo);
        sbLIZ.append(", haveBackgroundTopMap=");
        sbLIZ.append(this.haveBackgroundTopMap);
        sbLIZ.append(", writeReviewEnable=");
        sbLIZ.append(this.writeReviewEnable);
        sbLIZ.append(", poiNavButtonGroup=");
        sbLIZ.append(this.poiNavButtonGroup);
        sbLIZ.append(", scrollingBubbleList=");
        sbLIZ.append(this.scrollingBubbleList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFakeNavBarModule() {
        return this.poiName == null && this.shareInfo == null && this.haveBackgroundTopMap == null;
    }

    public final Integer getHaveBackgroundTopMap() {
        return this.haveBackgroundTopMap;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final PoiNavButtonGroup getPoiNavButtonGroup() {
        return this.poiNavButtonGroup;
    }

    public final List<PoiScrollingBubble> getScrollingBubbleList() {
        return this.scrollingBubbleList;
    }

    public final PoiShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final boolean getWriteReviewEnable() {
        return this.writeReviewEnable;
    }

    public final PoiDynamicNavBarModule merge$poi_release(PoiDynamicNavBarModule poiDynamicNavBarModule) {
        String str;
        PoiShareInfo poiShareInfo;
        Integer num;
        boolean z;
        PoiNavButtonGroup poiNavButtonGroup;
        List<PoiScrollingBubble> list;
        if (poiDynamicNavBarModule == null || (str = poiDynamicNavBarModule.poiName) == null) {
            str = this.poiName;
        }
        if (poiDynamicNavBarModule == null || (poiShareInfo = poiDynamicNavBarModule.shareInfo) == null) {
            poiShareInfo = this.shareInfo;
        }
        if (poiDynamicNavBarModule == null || (num = poiDynamicNavBarModule.haveBackgroundTopMap) == null) {
            num = this.haveBackgroundTopMap;
        }
        if (poiDynamicNavBarModule != null) {
            z = poiDynamicNavBarModule.writeReviewEnable;
        } else {
            z = this.writeReviewEnable;
        }
        if (poiDynamicNavBarModule == null || (poiNavButtonGroup = poiDynamicNavBarModule.poiNavButtonGroup) == null) {
            poiNavButtonGroup = this.poiNavButtonGroup;
        }
        if (poiDynamicNavBarModule == null || (list = poiDynamicNavBarModule.scrollingBubbleList) == null) {
            list = this.scrollingBubbleList;
        }
        return copy(str, poiShareInfo, num, z, poiNavButtonGroup, list);
    }

    public PoiDynamicNavBarModule(String str, PoiShareInfo poiShareInfo, Integer num, boolean z, PoiNavButtonGroup poiNavButtonGroup, List<PoiScrollingBubble> list) {
        this.poiName = str;
        this.shareInfo = poiShareInfo;
        this.haveBackgroundTopMap = num;
        this.writeReviewEnable = z;
        this.poiNavButtonGroup = poiNavButtonGroup;
        this.scrollingBubbleList = list;
    }
}
