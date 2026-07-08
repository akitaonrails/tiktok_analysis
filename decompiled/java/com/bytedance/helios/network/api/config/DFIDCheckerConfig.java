package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class DFIDCheckerConfig {

    @C09CT("app2app_enabled")
    public final boolean app2appEnabled;

    @C09CT("app2app_report_sample_rate")
    public final double app2appReportSampleRate;

    @C09CT("stack_sample_rate")
    public final double stackSampleRate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DFIDCheckerConfig)) {
            return false;
        }
        DFIDCheckerConfig dFIDCheckerConfig = (DFIDCheckerConfig) obj;
        return this.app2appEnabled == dFIDCheckerConfig.app2appEnabled && Double.compare(this.app2appReportSampleRate, dFIDCheckerConfig.app2appReportSampleRate) == 0 && Double.compare(this.stackSampleRate, dFIDCheckerConfig.stackSampleRate) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.app2appEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + C786410Ut5.X2(this.app2appReportSampleRate)) * 31) + C786410Ut5.X2(this.stackSampleRate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DFIDCheckerConfig(app2appEnabled=");
        sbLIZ.append(this.app2appEnabled);
        sbLIZ.append(", app2appReportSampleRate=");
        sbLIZ.append(this.app2appReportSampleRate);
        sbLIZ.append(", stackSampleRate=");
        sbLIZ.append(this.stackSampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DFIDCheckerConfig() {
        this(false, 0.001d, 0.01d);
    }

    public DFIDCheckerConfig(boolean z, double d, double d2) {
        this.app2appEnabled = z;
        this.app2appReportSampleRate = d;
        this.stackSampleRate = d2;
    }
}
