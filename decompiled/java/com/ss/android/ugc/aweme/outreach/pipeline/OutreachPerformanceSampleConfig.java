package com.ss.android.ugc.aweme.outreach.pipeline;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class OutreachPerformanceSampleConfig {

    @C09CT("outreach_processor_cost")
    public final double outreachProcessorCost;

    @C09CT("outreach_processor_cost_threshold")
    public final long outreachProcessorCostThreshold;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutreachPerformanceSampleConfig)) {
            return false;
        }
        OutreachPerformanceSampleConfig outreachPerformanceSampleConfig = (OutreachPerformanceSampleConfig) obj;
        return Double.compare(this.outreachProcessorCost, outreachPerformanceSampleConfig.outreachProcessorCost) == 0 && this.outreachProcessorCostThreshold == outreachPerformanceSampleConfig.outreachProcessorCostThreshold;
    }

    public final int hashCode() {
        return (C786410Ut5.X2(this.outreachProcessorCost) * 31) + C786410Ut5.Y2(this.outreachProcessorCostThreshold);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachPerformanceSampleConfig(outreachProcessorCost=");
        sbLIZ.append(this.outreachProcessorCost);
        sbLIZ.append(", outreachProcessorCostThreshold=");
        sbLIZ.append(this.outreachProcessorCostThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachPerformanceSampleConfig() {
        this(0.0d, Long.MAX_VALUE);
    }

    public OutreachPerformanceSampleConfig(double d, long j) {
        this.outreachProcessorCost = d;
        this.outreachProcessorCostThreshold = j;
    }
}
