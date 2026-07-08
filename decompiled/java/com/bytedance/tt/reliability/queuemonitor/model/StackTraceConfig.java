package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StackTraceConfig {

    @C09CT("business_sampling")
    public final List<StackSamplingConfig> businessSampling;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final StackSamplingConfig f48default;

    @C09CT("enable")
    public final boolean enable;

    public StackTraceConfig() {
        this(false, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackTraceConfig)) {
            return false;
        }
        StackTraceConfig stackTraceConfig = (StackTraceConfig) obj;
        return this.enable == stackTraceConfig.enable && Intrinsics.LJFF(this.f48default, stackTraceConfig.f48default) && Intrinsics.LJFF(this.businessSampling, stackTraceConfig.businessSampling);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        StackSamplingConfig stackSamplingConfig = this.f48default;
        return ((i + (stackSamplingConfig == null ? 0 : stackSamplingConfig.hashCode())) * 31) + this.businessSampling.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackTraceConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", default=");
        sbLIZ.append(this.f48default);
        sbLIZ.append(", businessSampling=");
        sbLIZ.append(this.businessSampling);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StackTraceConfig(boolean z, StackSamplingConfig stackSamplingConfig, List<StackSamplingConfig> list) {
        this.enable = z;
        this.f48default = stackSamplingConfig;
        this.businessSampling = list;
    }

    public StackTraceConfig(boolean z, StackSamplingConfig stackSamplingConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : stackSamplingConfig, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
