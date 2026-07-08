package com.ss.android.ugc.aweme.pipo.probe.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoProbeObserverConfigModel {

    @C09CT("observer_background_flush_enabled")
    public final boolean backgroundFlushEnabled;

    @C09CT("business_names")
    public final List<Map<String, Object>> businessNames;

    @C09CT("observer_leading_edge_enabled")
    public final boolean leadingEdgeEnabled;

    @C09CT("probe_observer_enabled")
    public final boolean probeObserverEnabled;

    @C09CT("observer_report_interval_sec")
    public final double reportIntervalSec;

    public PipoProbeObserverConfigModel() {
        this(false, null, 0.0d, false, false, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoProbeObserverConfigModel)) {
            return false;
        }
        PipoProbeObserverConfigModel pipoProbeObserverConfigModel = (PipoProbeObserverConfigModel) obj;
        return this.probeObserverEnabled == pipoProbeObserverConfigModel.probeObserverEnabled && Intrinsics.LJFF(this.businessNames, pipoProbeObserverConfigModel.businessNames) && Double.compare(this.reportIntervalSec, pipoProbeObserverConfigModel.reportIntervalSec) == 0 && this.leadingEdgeEnabled == pipoProbeObserverConfigModel.leadingEdgeEnabled && this.backgroundFlushEnabled == pipoProbeObserverConfigModel.backgroundFlushEnabled;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.probeObserverEnabled) * 31) + this.businessNames.hashCode()) * 31) + C786410Ut5.X2(this.reportIntervalSec)) * 31) + C786410Ut5.Z2(this.leadingEdgeEnabled)) * 31) + C786410Ut5.Z2(this.backgroundFlushEnabled);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoProbeObserverConfigModel(probeObserverEnabled=");
        sbLIZ.append(this.probeObserverEnabled);
        sbLIZ.append(", businessNames=");
        sbLIZ.append(this.businessNames);
        sbLIZ.append(", reportIntervalSec=");
        sbLIZ.append(this.reportIntervalSec);
        sbLIZ.append(", leadingEdgeEnabled=");
        sbLIZ.append(this.leadingEdgeEnabled);
        sbLIZ.append(", backgroundFlushEnabled=");
        sbLIZ.append(this.backgroundFlushEnabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PipoProbeObserverConfigModel(boolean z, List<? extends Map<String, ? extends Object>> list, double d, boolean z2, boolean z3) {
        this.probeObserverEnabled = z;
        this.businessNames = list;
        this.reportIntervalSec = d;
        this.leadingEdgeEnabled = z2;
        this.backgroundFlushEnabled = z3;
    }

    public PipoProbeObserverConfigModel(boolean z, List list, double d, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 10.0d : d, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
