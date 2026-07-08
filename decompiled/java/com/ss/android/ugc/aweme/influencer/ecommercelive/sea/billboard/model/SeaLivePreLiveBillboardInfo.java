package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLivePreLiveBillboardInfo {

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("is_billboard_v1")
    public final Boolean isNewBillboard;

    @C09CT("v1_billboards")
    public final List<SeaLiveBillboard> v1Billboards;

    public SeaLivePreLiveBillboardInfo() {
        this(Boolean.FALSE, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaLivePreLiveBillboardInfo)) {
            return false;
        }
        SeaLivePreLiveBillboardInfo seaLivePreLiveBillboardInfo = (SeaLivePreLiveBillboardInfo) obj;
        return Intrinsics.LJFF(this.isNewBillboard, seaLivePreLiveBillboardInfo.isNewBillboard) && Intrinsics.LJFF(this.v1Billboards, seaLivePreLiveBillboardInfo.v1Billboards) && Intrinsics.LJFF(this.daInfo, seaLivePreLiveBillboardInfo.daInfo);
    }

    public final int hashCode() {
        Boolean bool = this.isNewBillboard;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<SeaLiveBillboard> list = this.v1Billboards;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.daInfo;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLivePreLiveBillboardInfo(isNewBillboard=");
        sbLIZ.append(this.isNewBillboard);
        sbLIZ.append(", v1Billboards=");
        sbLIZ.append(this.v1Billboards);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLivePreLiveBillboardInfo(Boolean bool, List<SeaLiveBillboard> list, Map<String, ? extends Object> map) {
        this.isNewBillboard = bool;
        this.v1Billboards = list;
        this.daInfo = map;
    }
}
