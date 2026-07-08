package com.ss.android.ugc.aweme.outreach.pipeline;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class PipelineStageSampleConfig {

    @C09CT("sample_rate")
    public final double sampleRate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PipelineStageSampleConfig) && Double.compare(this.sampleRate, ((PipelineStageSampleConfig) obj).sampleRate) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.sampleRate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipelineStageSampleConfig(sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipelineStageSampleConfig() {
        this(0.0d);
    }

    public PipelineStageSampleConfig(double d) {
        this.sampleRate = d;
    }
}
