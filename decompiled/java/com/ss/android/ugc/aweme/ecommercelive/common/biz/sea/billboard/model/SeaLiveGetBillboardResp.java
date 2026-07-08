package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveGetBillboardResp {

    @C09CT("billboard_version")
    public final Integer billboardVersion;

    @C09CT("billboards")
    public final List<SeaLiveBillboard> billboards;

    @C09CT("da_info")
    public Map<String, ? extends Object> daInfo;

    public SeaLiveGetBillboardResp() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaLiveGetBillboardResp)) {
            return false;
        }
        SeaLiveGetBillboardResp seaLiveGetBillboardResp = (SeaLiveGetBillboardResp) obj;
        return Intrinsics.LJFF(this.billboards, seaLiveGetBillboardResp.billboards) && Intrinsics.LJFF(this.daInfo, seaLiveGetBillboardResp.daInfo) && Intrinsics.LJFF(this.billboardVersion, seaLiveGetBillboardResp.billboardVersion);
    }

    public final int hashCode() {
        List<SeaLiveBillboard> list = this.billboards;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, ? extends Object> map = this.daInfo;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.billboardVersion;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveGetBillboardResp(billboards=");
        sbLIZ.append(this.billboards);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", billboardVersion=");
        sbLIZ.append(this.billboardVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLiveGetBillboardResp(List<SeaLiveBillboard> list, Map<String, ? extends Object> map, Integer num) {
        this.billboards = list;
        this.daInfo = map;
        this.billboardVersion = num;
    }
}
