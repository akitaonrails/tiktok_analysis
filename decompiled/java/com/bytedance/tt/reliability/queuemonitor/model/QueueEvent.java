package com.bytedance.tt.reliability.queuemonitor.model;

import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueEvent {
    public final boolean blockedFlag;
    public final String blockedReason;
    public final String callerKeyPoint;
    public final String callerThreadName;
    public final String configId;
    public final double dequeueRate;
    public final double enqueueRate;
    public final String groupType;
    public final String name;
    public final Double producerContributionRate;
    public final Double producerSampleRate;
    public final Long producerStackHash;
    public final String producerStackTrace;
    public final String queueId;
    public final long queueLength;
    public final QueueType queueType;
    public final double trafficIntensity;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueEvent)) {
            return false;
        }
        QueueEvent queueEvent = (QueueEvent) obj;
        return Intrinsics.LJFF(this.queueId, queueEvent.queueId) && Intrinsics.LJFF(this.name, queueEvent.name) && this.queueType == queueEvent.queueType && Intrinsics.LJFF(this.groupType, queueEvent.groupType) && Intrinsics.LJFF(this.callerThreadName, queueEvent.callerThreadName) && Intrinsics.LJFF(this.callerKeyPoint, queueEvent.callerKeyPoint) && this.blockedFlag == queueEvent.blockedFlag && Intrinsics.LJFF(this.blockedReason, queueEvent.blockedReason) && this.queueLength == queueEvent.queueLength && Intrinsics.LJFF(Double.valueOf(this.trafficIntensity), Double.valueOf(queueEvent.trafficIntensity)) && Intrinsics.LJFF(Double.valueOf(this.enqueueRate), Double.valueOf(queueEvent.enqueueRate)) && Intrinsics.LJFF(Double.valueOf(this.dequeueRate), Double.valueOf(queueEvent.dequeueRate)) && Intrinsics.LJFF(this.producerStackHash, queueEvent.producerStackHash) && Intrinsics.LJFF(this.producerStackTrace, queueEvent.producerStackTrace) && Intrinsics.LJFF(this.producerSampleRate, queueEvent.producerSampleRate) && Intrinsics.LJFF(this.producerContributionRate, queueEvent.producerContributionRate) && Intrinsics.LJFF(this.configId, queueEvent.configId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    public int hashCode() {
        int iHashCode = ((((((((this.queueId.hashCode() * 31) + this.name.hashCode()) * 31) + this.queueType.hashCode()) * 31) + this.groupType.hashCode()) * 31) + this.callerThreadName.hashCode()) * 31;
        String str = this.callerKeyPoint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.blockedFlag;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode2 + r0) * 31;
        String str2 = this.blockedReason;
        int iHashCode3 = (((((((((i + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.queueLength)) * 31) + C786410Ut5.X2(this.trafficIntensity)) * 31) + C786410Ut5.X2(this.enqueueRate)) * 31) + C786410Ut5.X2(this.dequeueRate)) * 31;
        Long l = this.producerStackHash;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.producerStackTrace;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.producerSampleRate;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.producerContributionRate;
        return ((iHashCode6 + (d2 != null ? d2.hashCode() : 0)) * 31) + this.configId.hashCode();
    }

    public String toString() {
        return "QueueEvent(queueId=" + this.queueId + ", name=" + this.name + ", queueType=" + this.queueType + ", groupType=" + this.groupType + ", callerThreadName=" + this.callerThreadName + ", callerKeyPoint=" + ((Object) this.callerKeyPoint) + ", blockedFlag=" + this.blockedFlag + ", blockedReason=" + ((Object) this.blockedReason) + ", queueLength=" + this.queueLength + ", trafficIntensity=" + this.trafficIntensity + ", enqueueRate=" + this.enqueueRate + ", dequeueRate=" + this.dequeueRate + ", producerStackHash=" + this.producerStackHash + ", producerStackTrace=" + ((Object) this.producerStackTrace) + ", producerSampleRate=" + this.producerSampleRate + ", producerContributionRate=" + this.producerContributionRate + ", configId=" + this.configId + ')';
    }

    public QueueEvent(String str, String str2, QueueType queueType, String str3, String str4, String str5, boolean z, String str6, long j, double d, double d2, double d3, Long l, String str7, Double d4, Double d5, String str8) {
        this.queueId = str;
        this.name = str2;
        this.queueType = queueType;
        this.groupType = str3;
        this.callerThreadName = str4;
        this.callerKeyPoint = str5;
        this.blockedFlag = z;
        this.blockedReason = str6;
        this.queueLength = j;
        this.trafficIntensity = d;
        this.enqueueRate = d2;
        this.dequeueRate = d3;
        this.producerStackHash = l;
        this.producerStackTrace = str7;
        this.producerSampleRate = d4;
        this.producerContributionRate = d5;
        this.configId = str8;
    }
}
