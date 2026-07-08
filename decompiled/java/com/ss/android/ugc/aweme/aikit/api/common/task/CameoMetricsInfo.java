package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CameoMetricsInfo implements Serializable {

    @C09CT("activate_filter")
    public final Integer activateFilter;

    @C09CT("activate_function")
    public final String activateFunction;

    @C09CT("faceid_created_way")
    public final String faceIDCreatedWay;

    @C09CT("generate_count")
    public final Integer generateCount;

    public CameoMetricsInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoMetricsInfo)) {
            return false;
        }
        CameoMetricsInfo cameoMetricsInfo = (CameoMetricsInfo) obj;
        return Intrinsics.LJFF(this.generateCount, cameoMetricsInfo.generateCount) && Intrinsics.LJFF(this.faceIDCreatedWay, cameoMetricsInfo.faceIDCreatedWay) && Intrinsics.LJFF(this.activateFunction, cameoMetricsInfo.activateFunction) && Intrinsics.LJFF(this.activateFilter, cameoMetricsInfo.activateFilter);
    }

    public int hashCode() {
        Integer num = this.generateCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.faceIDCreatedWay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activateFunction;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.activateFilter;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoMetricsInfo(generateCount=");
        sbLIZ.append(this.generateCount);
        sbLIZ.append(", faceIDCreatedWay=");
        sbLIZ.append(this.faceIDCreatedWay);
        sbLIZ.append(", activateFunction=");
        sbLIZ.append(this.activateFunction);
        sbLIZ.append(", activateFilter=");
        sbLIZ.append(this.activateFilter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CameoMetricsInfo(Integer num, String str, String str2, Integer num2) {
        this.generateCount = num;
        this.faceIDCreatedWay = str;
        this.activateFunction = str2;
        this.activateFilter = num2;
    }
}
