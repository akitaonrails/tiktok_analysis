package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class WarnConfig {

    @C09CT("business_threshold")
    public final List<WarnThresholdConfig> businessThreshold;

    @C09CT("default_threshold")
    public final WarnThresholdConfig defaultThreshold;

    public WarnConfig() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarnConfig)) {
            return false;
        }
        WarnConfig warnConfig = (WarnConfig) obj;
        return Intrinsics.LJFF(this.defaultThreshold, warnConfig.defaultThreshold) && Intrinsics.LJFF(this.businessThreshold, warnConfig.businessThreshold);
    }

    public int hashCode() {
        WarnThresholdConfig warnThresholdConfig = this.defaultThreshold;
        return ((warnThresholdConfig == null ? 0 : warnThresholdConfig.hashCode()) * 31) + this.businessThreshold.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WarnConfig(defaultThreshold=");
        sbLIZ.append(this.defaultThreshold);
        sbLIZ.append(", businessThreshold=");
        sbLIZ.append(this.businessThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WarnConfig(WarnThresholdConfig warnThresholdConfig, List<WarnThresholdConfig> list) {
        this.defaultThreshold = warnThresholdConfig;
        this.businessThreshold = list;
    }

    public WarnConfig(WarnThresholdConfig warnThresholdConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : warnThresholdConfig, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
