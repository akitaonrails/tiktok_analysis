package com.ss.android.ugc.aweme.minis.report.log;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EtEventRecord {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("report_time")
    public final long reportTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtEventRecord)) {
            return false;
        }
        EtEventRecord etEventRecord = (EtEventRecord) obj;
        return Intrinsics.LJFF(this.eventName, etEventRecord.eventName) && Intrinsics.LJFF(this.params, etEventRecord.params) && this.reportTime == etEventRecord.reportTime;
    }

    public final int hashCode() {
        return (((this.eventName.hashCode() * 31) + this.params.hashCode()) * 31) + C786410Ut5.Y2(this.reportTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EtEventRecord(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", reportTime=");
        sbLIZ.append(this.reportTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EtEventRecord() {
        this("", C2097608Jq.LJ(), 0L);
    }

    public EtEventRecord(String str, Map<String, String> map, long j) {
        this.eventName = str;
        this.params = map;
        this.reportTime = j;
    }
}
