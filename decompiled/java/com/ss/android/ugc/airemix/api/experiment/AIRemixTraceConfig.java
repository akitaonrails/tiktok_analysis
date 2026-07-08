package com.ss.android.ugc.airemix.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIRemixTraceConfig {

    @C09CT("enable")
    public final boolean enabled;

    @C09CT("min_level")
    public final String minLevel;

    public AIRemixTraceConfig() {
        this(false, "debug");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixTraceConfig)) {
            return false;
        }
        AIRemixTraceConfig aIRemixTraceConfig = (AIRemixTraceConfig) obj;
        return this.enabled == aIRemixTraceConfig.enabled && Intrinsics.LJFF(this.minLevel, aIRemixTraceConfig.minLevel);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + this.minLevel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixTraceConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", minLevel=");
        sbLIZ.append(this.minLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIRemixTraceConfig(boolean z, String str) {
        this.enabled = z;
        this.minLevel = str;
    }
}
