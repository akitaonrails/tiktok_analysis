package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StackSamplingConfig {

    @C09CT("filter")
    public final Filter filter;

    @C09CT("sampling_rate")
    public final double samplingRate;

    @C09CT("stack_frame_filters")
    public final List<String> stackFrameFilters;

    public StackSamplingConfig() {
        this(null, 0.0d, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackSamplingConfig)) {
            return false;
        }
        StackSamplingConfig stackSamplingConfig = (StackSamplingConfig) obj;
        return Intrinsics.LJFF(this.filter, stackSamplingConfig.filter) && Intrinsics.LJFF(Double.valueOf(this.samplingRate), Double.valueOf(stackSamplingConfig.samplingRate)) && Intrinsics.LJFF(this.stackFrameFilters, stackSamplingConfig.stackFrameFilters);
    }

    public int hashCode() {
        Filter filter = this.filter;
        return ((((filter == null ? 0 : filter.hashCode()) * 31) + C786410Ut5.X2(this.samplingRate)) * 31) + this.stackFrameFilters.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackSamplingConfig(filter=");
        sbLIZ.append(this.filter);
        sbLIZ.append(", samplingRate=");
        sbLIZ.append(this.samplingRate);
        sbLIZ.append(", stackFrameFilters=");
        sbLIZ.append(this.stackFrameFilters);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StackSamplingConfig(Filter filter, double d, List<String> list) {
        this.filter = filter;
        this.samplingRate = d;
        this.stackFrameFilters = list;
    }

    public StackSamplingConfig(Filter filter, double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : filter, (i & 2) != 0 ? 0.05d : d, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
