package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueMonitorConfig {

    @C09CT("drop_rate")
    public final double dropRate;

    @C09CT("enable_ui_thread_monitor")
    public final boolean enableUIThreadMonitor;

    @C09CT("enable_warn")
    public final boolean enableWarn;

    @C09CT("monitor_id")
    public final String id;

    @C09CT("report_period_sec")
    public final double reportPeriodSec;

    @C09CT("warn_period_sec")
    public final double warnPeriodSec;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueMonitorConfig)) {
            return false;
        }
        QueueMonitorConfig queueMonitorConfig = (QueueMonitorConfig) obj;
        return Intrinsics.LJFF(this.id, queueMonitorConfig.id) && this.enableUIThreadMonitor == queueMonitorConfig.enableUIThreadMonitor && Intrinsics.LJFF(Double.valueOf(this.reportPeriodSec), Double.valueOf(queueMonitorConfig.reportPeriodSec)) && this.enableWarn == queueMonitorConfig.enableWarn && Intrinsics.LJFF(Double.valueOf(this.warnPeriodSec), Double.valueOf(queueMonitorConfig.warnPeriodSec)) && Intrinsics.LJFF(Double.valueOf(this.dropRate), Double.valueOf(queueMonitorConfig.dropRate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        boolean z = this.enableUIThreadMonitor;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((((((iHashCode + r0) * 31) + C786410Ut5.X2(this.reportPeriodSec)) * 31) + (this.enableWarn ? 1 : 0)) * 31) + C786410Ut5.X2(this.warnPeriodSec)) * 31) + C786410Ut5.X2(this.dropRate);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueMonitorConfig(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", enableUIThreadMonitor=");
        sbLIZ.append(this.enableUIThreadMonitor);
        sbLIZ.append(", reportPeriodSec=");
        sbLIZ.append(this.reportPeriodSec);
        sbLIZ.append(", enableWarn=");
        sbLIZ.append(this.enableWarn);
        sbLIZ.append(", warnPeriodSec=");
        sbLIZ.append(this.warnPeriodSec);
        sbLIZ.append(", dropRate=");
        sbLIZ.append(this.dropRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QueueMonitorConfig() {
        this("", false, 0.05d, false, 0.05d, 0.3d);
    }

    public QueueMonitorConfig(String str, boolean z, double d, boolean z2, double d2, double d3) {
        this.id = str;
        this.enableUIThreadMonitor = z;
        this.reportPeriodSec = d;
        this.enableWarn = z2;
        this.warnPeriodSec = d2;
        this.dropRate = d3;
    }
}
