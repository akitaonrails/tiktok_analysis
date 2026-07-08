package com.bytedance.tt.reliability.queuemonitor.model;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueSnapshot {
    public final String callerKeyPoint;
    public final String groupType;
    public final String name;
    public final long pipelineLength;
    public final String queueId;
    public final QueueType queueType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueSnapshot)) {
            return false;
        }
        QueueSnapshot queueSnapshot = (QueueSnapshot) obj;
        return Intrinsics.LJFF(this.queueId, queueSnapshot.queueId) && Intrinsics.LJFF(this.name, queueSnapshot.name) && this.queueType == queueSnapshot.queueType && Intrinsics.LJFF(this.groupType, queueSnapshot.groupType) && Intrinsics.LJFF(this.callerKeyPoint, queueSnapshot.callerKeyPoint) && this.pipelineLength == queueSnapshot.pipelineLength;
    }

    public int hashCode() {
        int iHashCode = ((((((this.queueId.hashCode() * 31) + this.name.hashCode()) * 31) + this.queueType.hashCode()) * 31) + this.groupType.hashCode()) * 31;
        String str = this.callerKeyPoint;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.pipelineLength);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueSnapshot(queueId=");
        sbLIZ.append(this.queueId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", queueType=");
        sbLIZ.append(this.queueType);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.groupType);
        sbLIZ.append(", callerKeyPoint=");
        sbLIZ.append((Object) this.callerKeyPoint);
        sbLIZ.append(", pipelineLength=");
        sbLIZ.append(this.pipelineLength);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QueueSnapshot(String str, String str2, QueueType queueType, String str3, String str4, long j) {
        this.queueId = str;
        this.name = str2;
        this.queueType = queueType;
        this.groupType = str3;
        this.callerKeyPoint = str4;
        this.pipelineLength = j;
    }
}
