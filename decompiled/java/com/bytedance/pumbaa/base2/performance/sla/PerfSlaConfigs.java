package com.bytedance.pumbaa.base2.performance.sla;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PerfSlaConfigs {

    @C09CT("control_execution")
    public final PerfSlaConfig controlExecution;

    @C09CT("init")
    public final PerfSlaConfig init;

    public PerfSlaConfigs() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfSlaConfigs)) {
            return false;
        }
        PerfSlaConfigs perfSlaConfigs = (PerfSlaConfigs) obj;
        return Intrinsics.LJFF(this.init, perfSlaConfigs.init) && Intrinsics.LJFF(this.controlExecution, perfSlaConfigs.controlExecution);
    }

    public final int hashCode() {
        PerfSlaConfig perfSlaConfig = this.init;
        int iHashCode = (perfSlaConfig == null ? 0 : perfSlaConfig.hashCode()) * 31;
        PerfSlaConfig perfSlaConfig2 = this.controlExecution;
        return iHashCode + (perfSlaConfig2 != null ? perfSlaConfig2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfSlaConfigs(init=");
        sbLIZ.append(this.init);
        sbLIZ.append(", controlExecution=");
        sbLIZ.append(this.controlExecution);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PerfSlaConfigs(PerfSlaConfig perfSlaConfig, PerfSlaConfig perfSlaConfig2) {
        this.init = perfSlaConfig;
        this.controlExecution = perfSlaConfig2;
    }
}
