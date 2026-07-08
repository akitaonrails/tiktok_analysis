package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChartInfo implements Serializable {

    @C09CT("chart_id")
    public final String chartId;

    @C09CT("chart_topic_name")
    public final String chartTopicName;

    @C09CT("chart_type")
    public final Integer chartType;

    @C09CT("region_poi_id")
    public final String regionPoiId;

    public ChartInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartInfo)) {
            return false;
        }
        ChartInfo chartInfo = (ChartInfo) obj;
        return Intrinsics.LJFF(this.chartType, chartInfo.chartType) && Intrinsics.LJFF(this.regionPoiId, chartInfo.regionPoiId) && Intrinsics.LJFF(this.chartTopicName, chartInfo.chartTopicName) && Intrinsics.LJFF(this.chartId, chartInfo.chartId);
    }

    public int hashCode() {
        Integer num = this.chartType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.regionPoiId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chartTopicName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chartId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChartInfo(chartType=");
        sbLIZ.append(this.chartType);
        sbLIZ.append(", regionPoiId=");
        sbLIZ.append(this.regionPoiId);
        sbLIZ.append(", chartTopicName=");
        sbLIZ.append(this.chartTopicName);
        sbLIZ.append(", chartId=");
        sbLIZ.append(this.chartId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChartInfo(Integer num, String str, String str2, String str3) {
        this.chartType = num;
        this.regionPoiId = str;
        this.chartTopicName = str2;
        this.chartId = str3;
    }
}
