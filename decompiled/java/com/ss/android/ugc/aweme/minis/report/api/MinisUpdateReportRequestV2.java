package com.ss.android.ugc.aweme.minis.report.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MinisUpdateReportRequestV2 {

    @C09CT("minis_data")
    public final String minisData;

    @C09CT("object_id")
    public final String objectId;

    @C09CT("performance_data_uri")
    public final String performanceDataUri;

    @C09CT("report_status")
    public final Integer reportStatus;

    @C09CT("screenshot_uris")
    public final List<String> screenshotUris;

    public MinisUpdateReportRequestV2() {
        this("", null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisUpdateReportRequestV2)) {
            return false;
        }
        MinisUpdateReportRequestV2 minisUpdateReportRequestV2 = (MinisUpdateReportRequestV2) obj;
        return Intrinsics.LJFF(this.objectId, minisUpdateReportRequestV2.objectId) && Intrinsics.LJFF(this.screenshotUris, minisUpdateReportRequestV2.screenshotUris) && Intrinsics.LJFF(this.minisData, minisUpdateReportRequestV2.minisData) && Intrinsics.LJFF(this.performanceDataUri, minisUpdateReportRequestV2.performanceDataUri) && Intrinsics.LJFF(this.reportStatus, minisUpdateReportRequestV2.reportStatus);
    }

    public final int hashCode() {
        int iHashCode = this.objectId.hashCode() * 31;
        List<String> list = this.screenshotUris;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.minisData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.performanceDataUri;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.reportStatus;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisUpdateReportRequestV2(objectId=");
        sbLIZ.append(this.objectId);
        sbLIZ.append(", screenshotUris=");
        sbLIZ.append(this.screenshotUris);
        sbLIZ.append(", minisData=");
        sbLIZ.append(this.minisData);
        sbLIZ.append(", performanceDataUri=");
        sbLIZ.append(this.performanceDataUri);
        sbLIZ.append(", reportStatus=");
        sbLIZ.append(this.reportStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisUpdateReportRequestV2(String str, List<String> list, String str2, String str3, Integer num) {
        this.objectId = str;
        this.screenshotUris = list;
        this.minisData = str2;
        this.performanceDataUri = str3;
        this.reportStatus = num;
    }
}
