package com.bytedance.tt.reliability.queuemonitor.model;

import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueMetrics {
    public final String callerKeyPoint;
    public final String callerThreadName;
    public final String configId;
    public final double dequeueRate;
    public final double enqueueRate;
    public final String groupType;
    public final String name;
    public final String queueId;
    public final long queueLength;
    public final QueueType queueType;
    public final double window;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueMetrics)) {
            return false;
        }
        QueueMetrics queueMetrics = (QueueMetrics) obj;
        return Intrinsics.LJFF(this.queueId, queueMetrics.queueId) && Intrinsics.LJFF(this.name, queueMetrics.name) && this.queueType == queueMetrics.queueType && Intrinsics.LJFF(this.groupType, queueMetrics.groupType) && Intrinsics.LJFF(this.callerThreadName, queueMetrics.callerThreadName) && Intrinsics.LJFF(this.callerKeyPoint, queueMetrics.callerKeyPoint) && Intrinsics.LJFF(Double.valueOf(this.enqueueRate), Double.valueOf(queueMetrics.enqueueRate)) && Intrinsics.LJFF(Double.valueOf(this.dequeueRate), Double.valueOf(queueMetrics.dequeueRate)) && this.queueLength == queueMetrics.queueLength && Intrinsics.LJFF(Double.valueOf(this.window), Double.valueOf(queueMetrics.window)) && Intrinsics.LJFF(this.configId, queueMetrics.configId);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.queueId.hashCode() * 31) + this.name.hashCode()) * 31) + this.queueType.hashCode()) * 31) + this.groupType.hashCode()) * 31) + this.callerThreadName.hashCode()) * 31;
        String str = this.callerKeyPoint;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.X2(this.enqueueRate)) * 31) + C786410Ut5.X2(this.dequeueRate)) * 31) + C786410Ut5.Y2(this.queueLength)) * 31) + C786410Ut5.X2(this.window)) * 31) + this.configId.hashCode();
    }

    public String toString() {
        return "QueueMetrics(queueId=" + this.queueId + ", name=" + this.name + ", queueType=" + this.queueType + ", groupType=" + this.groupType + ", callerThreadName=" + this.callerThreadName + ", callerKeyPoint=" + ((Object) this.callerKeyPoint) + ", enqueueRate=" + this.enqueueRate + ", dequeueRate=" + this.dequeueRate + ", queueLength=" + this.queueLength + ", window=" + this.window + ", configId=" + this.configId + ')';
    }

    public QueueMetrics(String str, String str2, QueueType queueType, String str3, String str4, String str5, double d, double d2, long j, double d3, String str6) {
        this.queueId = str;
        this.name = str2;
        this.queueType = queueType;
        this.groupType = str3;
        this.callerThreadName = str4;
        this.callerKeyPoint = str5;
        this.enqueueRate = d;
        this.dequeueRate = d2;
        this.queueLength = j;
        this.window = d3;
        this.configId = str6;
    }
}
