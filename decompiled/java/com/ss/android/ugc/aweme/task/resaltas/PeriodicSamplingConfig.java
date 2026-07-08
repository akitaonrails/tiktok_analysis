package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PeriodicSamplingConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("excluded_collectors")
    public final List<String> excludedCollectors;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("max_samples_per_window")
    public final int maxSamplesPerWindow;

    @C09CT("periodic_state")
    public final String periodicState;

    @C09CT("windows")
    public final List<WindowConfig> windows;

    public PeriodicSamplingConfig() {
        this(false, 0L, 0, null, null, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicSamplingConfig)) {
            return false;
        }
        PeriodicSamplingConfig periodicSamplingConfig = (PeriodicSamplingConfig) obj;
        return this.enable == periodicSamplingConfig.enable && this.intervalMs == periodicSamplingConfig.intervalMs && this.maxSamplesPerWindow == periodicSamplingConfig.maxSamplesPerWindow && Intrinsics.LJFF(this.periodicState, periodicSamplingConfig.periodicState) && Intrinsics.LJFF(this.excludedCollectors, periodicSamplingConfig.excludedCollectors) && Intrinsics.LJFF(this.windows, periodicSamplingConfig.windows);
    }

    public int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.intervalMs)) * 31) + this.maxSamplesPerWindow) * 31) + this.periodicState.hashCode()) * 31;
        List<String> list = this.excludedCollectors;
        return ((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + this.windows.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PeriodicSamplingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", intervalMs=");
        sbLIZ.append(this.intervalMs);
        sbLIZ.append(", maxSamplesPerWindow=");
        sbLIZ.append(this.maxSamplesPerWindow);
        sbLIZ.append(", periodicState=");
        sbLIZ.append(this.periodicState);
        sbLIZ.append(", excludedCollectors=");
        sbLIZ.append(this.excludedCollectors);
        sbLIZ.append(", windows=");
        sbLIZ.append(this.windows);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PeriodicSamplingConfig(boolean z, long j, int i, String str, List<String> list, List<WindowConfig> list2) {
        this.enable = z;
        this.intervalMs = j;
        this.maxSamplesPerWindow = i;
        this.periodicState = str;
        this.excludedCollectors = list;
        this.windows = list2;
    }

    public PeriodicSamplingConfig(boolean z, long j, int i, String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2000L : j, (i2 & 4) != 0 ? 30 : i, (i2 & 8) != 0 ? "periodic" : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? C13BV.INSTANCE : list2);
    }
}
