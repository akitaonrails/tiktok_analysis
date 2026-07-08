package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAllianceDetail implements Serializable {

    @C09CT("poi_basic_info")
    public final PoiAllianceBaseInfo baseInfo;

    @C09CT("tag_info_list")
    public final List<PoiAllianceTag> tags;

    public PoiAllianceDetail() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAllianceDetail(baseInfo=");
        sbLIZ.append(this.baseInfo);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCommissionPoi() {
        PoiAllianceBaseInfo poiAllianceBaseInfo = this.baseInfo;
        return poiAllianceBaseInfo != null && poiAllianceBaseInfo.isCommission();
    }

    public PoiAllianceDetail(PoiAllianceBaseInfo poiAllianceBaseInfo, List<PoiAllianceTag> list) {
        this.baseInfo = poiAllianceBaseInfo;
        this.tags = list;
    }
}
