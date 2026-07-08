package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class GCParameterConfig {

    @C09CT("max_free")
    public long maxFree;

    @C09CT("min_free")
    public long minFree;

    @C09CT("target_util")
    public float targetUtilization;

    public GCParameterConfig() {
        this(0L, 0L, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GCParameterConfig)) {
            return false;
        }
        GCParameterConfig gCParameterConfig = (GCParameterConfig) obj;
        return this.minFree == gCParameterConfig.minFree && this.maxFree == gCParameterConfig.maxFree && Float.compare(this.targetUtilization, gCParameterConfig.targetUtilization) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GCParameterConfig(minFree=");
        sbLIZ.append(this.minFree);
        sbLIZ.append(", maxFree=");
        sbLIZ.append(this.maxFree);
        sbLIZ.append(", targetUtilization=");
        sbLIZ.append(this.targetUtilization);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((C786410Ut5.Y2(this.minFree) * 31) + C786410Ut5.Y2(this.maxFree)) * 31) + Float.floatToIntBits(this.targetUtilization);
    }

    public final void setMaxFree(long j) {
        this.maxFree = j;
    }

    public final void setMinFree(long j) {
        this.minFree = j;
    }

    public final void setTargetUtilization(float f) {
        this.targetUtilization = f;
    }

    public GCParameterConfig(long j, long j2, float f) {
        this.minFree = j;
        this.maxFree = j2;
        this.targetUtilization = f;
    }
}
