package com.bytedance.otis.attribution.api;

import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RunnableInfoData {
    public final long cpuTimeCost;
    public final String name;
    public final String sceneEnd;
    public final Map<String, Object> sceneInfoEnd;
    public final Map<String, Object> sceneInfoStart;
    public final String sceneStart;
    public final String workThreadName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RunnableInfoData)) {
            return false;
        }
        RunnableInfoData runnableInfoData = (RunnableInfoData) obj;
        return Intrinsics.LJFF(this.name, runnableInfoData.name) && Intrinsics.LJFF(this.workThreadName, runnableInfoData.workThreadName) && this.cpuTimeCost == runnableInfoData.cpuTimeCost && Intrinsics.LJFF(this.sceneStart, runnableInfoData.sceneStart) && Intrinsics.LJFF(this.sceneInfoStart, runnableInfoData.sceneInfoStart) && Intrinsics.LJFF(this.sceneEnd, runnableInfoData.sceneEnd) && Intrinsics.LJFF(this.sceneInfoEnd, runnableInfoData.sceneInfoEnd);
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.workThreadName.hashCode()) * 31) + C786410Ut5.Y2(this.cpuTimeCost)) * 31) + this.sceneStart.hashCode()) * 31) + this.sceneInfoStart.hashCode()) * 31) + this.sceneEnd.hashCode()) * 31) + this.sceneInfoEnd.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableInfoData(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", workThreadName=");
        sbLIZ.append(this.workThreadName);
        sbLIZ.append(", cpuTimeCost=");
        sbLIZ.append(this.cpuTimeCost);
        sbLIZ.append(", sceneStart=");
        sbLIZ.append(this.sceneStart);
        sbLIZ.append(", sceneInfoStart=");
        sbLIZ.append(this.sceneInfoStart);
        sbLIZ.append(", sceneEnd=");
        sbLIZ.append(this.sceneEnd);
        sbLIZ.append(", sceneInfoEnd=");
        sbLIZ.append(this.sceneInfoEnd);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RunnableInfoData(String str, String str2, long j, String str3, Map<String, ? extends Object> map, String str4, Map<String, ? extends Object> map2) {
        this.name = str;
        this.workThreadName = str2;
        this.cpuTimeCost = j;
        this.sceneStart = str3;
        this.sceneInfoStart = map;
        this.sceneEnd = str4;
        this.sceneInfoEnd = map2;
    }
}
