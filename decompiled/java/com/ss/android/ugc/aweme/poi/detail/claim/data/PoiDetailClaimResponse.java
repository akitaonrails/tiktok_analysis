package com.ss.android.ugc.aweme.poi.detail.claim.data;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.InterfaceC2753014t;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailClaimResponse extends BaseComponentData implements Serializable, InterfaceC2753014t {
    public final String LL;

    @C09CT("business_account_info")
    public final PoiBusinessAccountInfo businessAccountInfo;

    @C09CT("manage_tools")
    public final List<PoiClaimManageToolModel> manageToolList;

    public PoiDetailClaimResponse() {
        this(null, null, "PoiDetailClaimResponse");
    }

    public final PoiDetailClaimResponse copy(PoiBusinessAccountInfo poiBusinessAccountInfo, List<PoiClaimManageToolModel> list, String str) {
        return new PoiDetailClaimResponse(poiBusinessAccountInfo, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailClaimResponse)) {
            return false;
        }
        PoiDetailClaimResponse poiDetailClaimResponse = (PoiDetailClaimResponse) obj;
        return Intrinsics.LJFF(this.businessAccountInfo, poiDetailClaimResponse.businessAccountInfo) && Intrinsics.LJFF(this.manageToolList, poiDetailClaimResponse.manageToolList) && Intrinsics.LJFF(this.LL, poiDetailClaimResponse.LL);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        PoiBusinessAccountInfo poiBusinessAccountInfo = this.businessAccountInfo;
        int iHashCode = (poiBusinessAccountInfo == null ? 0 : poiBusinessAccountInfo.hashCode()) * 31;
        List<PoiClaimManageToolModel> list = this.manageToolList;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.LL.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailClaimResponse(businessAccountInfo=");
        sbLIZ.append(this.businessAccountInfo);
        sbLIZ.append(", manageToolList=");
        sbLIZ.append(this.manageToolList);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isValid() {
        List<PoiClaimManageToolModel> list;
        return (this.businessAccountInfo == null || (list = this.manageToolList) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public final PoiBusinessAccountInfo getBusinessAccountInfo() {
        return this.businessAccountInfo;
    }

    public final List<PoiClaimManageToolModel> getManageToolList() {
        return this.manageToolList;
    }

    public String getSourceId() {
        return this.LL;
    }

    public PoiDetailClaimResponse(PoiBusinessAccountInfo poiBusinessAccountInfo, List<PoiClaimManageToolModel> list, String str) {
        this.businessAccountInfo = poiBusinessAccountInfo;
        this.manageToolList = list;
        this.LL = str;
    }
}
