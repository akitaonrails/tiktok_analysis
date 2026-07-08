package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueMonitorBaseConfig {

    @C09CT("monitor_config")
    public final QueueMonitorConfig monitorConfig;

    @C09CT("stack_sampling_config")
    public final StackTraceConfig stackSamplingConfig;

    @C09CT("warning_config")
    public final WarnConfig warningConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueMonitorBaseConfig)) {
            return false;
        }
        QueueMonitorBaseConfig queueMonitorBaseConfig = (QueueMonitorBaseConfig) obj;
        return Intrinsics.LJFF(this.monitorConfig, queueMonitorBaseConfig.monitorConfig) && Intrinsics.LJFF(this.warningConfig, queueMonitorBaseConfig.warningConfig) && Intrinsics.LJFF(this.stackSamplingConfig, queueMonitorBaseConfig.stackSamplingConfig);
    }

    public int hashCode() {
        int iHashCode = this.monitorConfig.hashCode() * 31;
        WarnConfig warnConfig = this.warningConfig;
        int iHashCode2 = (iHashCode + (warnConfig == null ? 0 : warnConfig.hashCode())) * 31;
        StackTraceConfig stackTraceConfig = this.stackSamplingConfig;
        return iHashCode2 + (stackTraceConfig != null ? stackTraceConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueMonitorBaseConfig(monitorConfig=");
        sbLIZ.append(this.monitorConfig);
        sbLIZ.append(", warningConfig=");
        sbLIZ.append(this.warningConfig);
        sbLIZ.append(", stackSamplingConfig=");
        sbLIZ.append(this.stackSamplingConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QueueMonitorBaseConfig(QueueMonitorConfig queueMonitorConfig, WarnConfig warnConfig, StackTraceConfig stackTraceConfig) {
        this.monitorConfig = queueMonitorConfig;
        this.warningConfig = warnConfig;
        this.stackSamplingConfig = stackTraceConfig;
    }
}
