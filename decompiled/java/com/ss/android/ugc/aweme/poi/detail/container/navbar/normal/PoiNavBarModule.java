package com.ss.android.ugc.aweme.poi.detail.container.navbar.normal;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShareInfo;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNavBarModule extends BaseComponentData implements Serializable {

    @C09CT("have_background_top_map")
    public final Integer haveBackgroundTopMap;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("share_info")
    public final PoiShareInfo shareInfo;

    @C09CT("write_review_enable")
    public final boolean writeReviewEnable;

    public PoiNavBarModule() {
        this(null, null, null, false);
    }

    public final PoiNavBarModule copy(String str, PoiShareInfo poiShareInfo, Integer num, boolean z) {
        return new PoiNavBarModule(str, poiShareInfo, num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiNavBarModule)) {
            return false;
        }
        PoiNavBarModule poiNavBarModule = (PoiNavBarModule) obj;
        return Intrinsics.LJFF(this.poiName, poiNavBarModule.poiName) && Intrinsics.LJFF(this.shareInfo, poiNavBarModule.shareInfo) && Intrinsics.LJFF(this.haveBackgroundTopMap, poiNavBarModule.haveBackgroundTopMap) && this.writeReviewEnable == poiNavBarModule.writeReviewEnable;
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
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.writeReviewEnable);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiNavBarModule(poiName=");
        sbLIZ.append(this.poiName);
        sbLIZ.append(", shareInfo=");
        sbLIZ.append(this.shareInfo);
        sbLIZ.append(", haveBackgroundTopMap=");
        sbLIZ.append(this.haveBackgroundTopMap);
        sbLIZ.append(", writeReviewEnable=");
        sbLIZ.append(this.writeReviewEnable);
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

    public final PoiShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final boolean getWriteReviewEnable() {
        return this.writeReviewEnable;
    }

    public PoiNavBarModule(String str, PoiShareInfo poiShareInfo, Integer num, boolean z) {
        this.poiName = str;
        this.shareInfo = poiShareInfo;
        this.haveBackgroundTopMap = num;
        this.writeReviewEnable = z;
    }
}
