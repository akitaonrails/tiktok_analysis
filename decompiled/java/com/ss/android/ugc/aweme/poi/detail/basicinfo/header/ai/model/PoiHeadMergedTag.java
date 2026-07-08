package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeadMergedTag extends BaseComponentData implements Serializable {

    @C09CT("tag_type")
    public final String PoiHeadMergedTagType;

    @C09CT("chart_tag")
    public final ChartInfo chartInfo;

    @C09CT("detail_tag")
    public final PoiDetailTag poiDetailTag;

    public PoiHeadMergedTag() {
        this(null, null, null);
    }

    public final PoiHeadMergedTag copy(String str, PoiDetailTag poiDetailTag, ChartInfo chartInfo) {
        return new PoiHeadMergedTag(str, poiDetailTag, chartInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiHeadMergedTag)) {
            return false;
        }
        PoiHeadMergedTag poiHeadMergedTag = (PoiHeadMergedTag) obj;
        return Intrinsics.LJFF(this.PoiHeadMergedTagType, poiHeadMergedTag.PoiHeadMergedTagType) && Intrinsics.LJFF(this.poiDetailTag, poiHeadMergedTag.poiDetailTag) && Intrinsics.LJFF(this.chartInfo, poiHeadMergedTag.chartInfo);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.PoiHeadMergedTagType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiDetailTag poiDetailTag = this.poiDetailTag;
        int iHashCode2 = (iHashCode + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
        ChartInfo chartInfo = this.chartInfo;
        return iHashCode2 + (chartInfo != null ? chartInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeadMergedTag(PoiHeadMergedTagType=");
        sbLIZ.append(this.PoiHeadMergedTagType);
        sbLIZ.append(", poiDetailTag=");
        sbLIZ.append(this.poiDetailTag);
        sbLIZ.append(", chartInfo=");
        sbLIZ.append(this.chartInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ChartInfo getChartInfo() {
        return this.chartInfo;
    }

    public final PoiDetailTag getPoiDetailTag() {
        return this.poiDetailTag;
    }

    public final String getPoiHeadMergedTagType() {
        return this.PoiHeadMergedTagType;
    }

    public PoiHeadMergedTag(String str, PoiDetailTag poiDetailTag, ChartInfo chartInfo) {
        this.PoiHeadMergedTagType = str;
        this.poiDetailTag = poiDetailTag;
        this.chartInfo = chartInfo;
    }
}
