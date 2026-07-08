package com.ss.android.ugc.aweme.minis.api.instantplay;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1006810cJ5;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisInstantPlayConfigModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("idle_schedule_enabled")
    public final boolean idleScheduleEnabled;

    @C09CT("idle_schedule_required_cpu_score")
    public final int idleScheduleRequiredCpuScore;

    @C09CT("idle_schedule_required_memory_score")
    public final int idleScheduleRequiredMemoryScore;

    @C09CT("idle_schedule_required_traffic_score")
    public final int idleScheduleRequiredTrafficScore;

    @C09CT("memory_warning_critical_linger_ms_for_undisplayed")
    public final long memoryWarningCriticalLingerMsForUndisplayed;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisInstantPlayConfigModel)) {
            return false;
        }
        MinisInstantPlayConfigModel minisInstantPlayConfigModel = (MinisInstantPlayConfigModel) obj;
        return this.enabled == minisInstantPlayConfigModel.enabled && this.idleScheduleEnabled == minisInstantPlayConfigModel.idleScheduleEnabled && this.idleScheduleRequiredCpuScore == minisInstantPlayConfigModel.idleScheduleRequiredCpuScore && this.idleScheduleRequiredTrafficScore == minisInstantPlayConfigModel.idleScheduleRequiredTrafficScore && this.idleScheduleRequiredMemoryScore == minisInstantPlayConfigModel.idleScheduleRequiredMemoryScore && this.memoryWarningCriticalLingerMsForUndisplayed == minisInstantPlayConfigModel.memoryWarningCriticalLingerMsForUndisplayed;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.idleScheduleEnabled)) * 31) + this.idleScheduleRequiredCpuScore) * 31) + this.idleScheduleRequiredTrafficScore) * 31) + this.idleScheduleRequiredMemoryScore) * 31) + C786410Ut5.Y2(this.memoryWarningCriticalLingerMsForUndisplayed);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisInstantPlayConfigModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", idleScheduleEnabled=");
        sbLIZ.append(this.idleScheduleEnabled);
        sbLIZ.append(", idleScheduleRequiredCpuScore=");
        sbLIZ.append(this.idleScheduleRequiredCpuScore);
        sbLIZ.append(", idleScheduleRequiredTrafficScore=");
        sbLIZ.append(this.idleScheduleRequiredTrafficScore);
        sbLIZ.append(", idleScheduleRequiredMemoryScore=");
        sbLIZ.append(this.idleScheduleRequiredMemoryScore);
        sbLIZ.append(", memoryWarningCriticalLingerMsForUndisplayed=");
        sbLIZ.append(this.memoryWarningCriticalLingerMsForUndisplayed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisInstantPlayConfigModel() {
        this(true, true, EnumC1006810cJ5.High.getScore(), EnumC1006810cJ5.High.getScore(), EnumC1006810cJ5.High.getScore(), 60000L);
    }

    public MinisInstantPlayConfigModel(boolean z, boolean z2, int i, int i2, int i3, long j) {
        this.enabled = z;
        this.idleScheduleEnabled = z2;
        this.idleScheduleRequiredCpuScore = i;
        this.idleScheduleRequiredTrafficScore = i2;
        this.idleScheduleRequiredMemoryScore = i3;
        this.memoryWarningCriticalLingerMsForUndisplayed = j;
    }
}
