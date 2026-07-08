package com.bytedance.pumbaa.hybrid.entry;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PnsHybridPerformanceSampleModel {

    @C09CT("sample_rate")
    public Map<String, Double> sampleRate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PnsHybridPerformanceSampleModel) && Intrinsics.LJFF(this.sampleRate, ((PnsHybridPerformanceSampleModel) obj).sampleRate);
    }

    public final int hashCode() {
        return this.sampleRate.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsHybridPerformanceSampleModel(sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsHybridPerformanceSampleModel() {
        this(C2097608Jq.LJ());
    }

    public PnsHybridPerformanceSampleModel(Map<String, Double> map) {
        this.sampleRate = map;
    }
}
