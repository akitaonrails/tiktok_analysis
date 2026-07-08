package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationContainerPerformanceData {

    @C09CT("coalesce_trigger_post")
    public final boolean coalesceTriggerPost;

    @C09CT("fcp_winner_time")
    public final boolean fcpWinnerTime;

    @C09CT("logic")
    public final boolean logicOpt;

    @C09CT("measure_optimise")
    public final boolean measureOptimise;

    @C09CT("render_coalesce")
    public final boolean renderCoalesce;

    public AnnotationContainerPerformanceData() {
        this(false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationContainerPerformanceData)) {
            return false;
        }
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) obj;
        return this.logicOpt == annotationContainerPerformanceData.logicOpt && this.renderCoalesce == annotationContainerPerformanceData.renderCoalesce && this.measureOptimise == annotationContainerPerformanceData.measureOptimise && this.fcpWinnerTime == annotationContainerPerformanceData.fcpWinnerTime && this.coalesceTriggerPost == annotationContainerPerformanceData.coalesceTriggerPost;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.logicOpt) * 31) + C786410Ut5.Z2(this.renderCoalesce)) * 31) + C786410Ut5.Z2(this.measureOptimise)) * 31) + C786410Ut5.Z2(this.fcpWinnerTime)) * 31) + C786410Ut5.Z2(this.coalesceTriggerPost);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnnotationContainerPerformanceData(logicOpt=");
        sbLIZ.append(this.logicOpt);
        sbLIZ.append(", renderCoalesce=");
        sbLIZ.append(this.renderCoalesce);
        sbLIZ.append(", measureOptimise=");
        sbLIZ.append(this.measureOptimise);
        sbLIZ.append(", fcpWinnerTime=");
        sbLIZ.append(this.fcpWinnerTime);
        sbLIZ.append(", coalesceTriggerPost=");
        sbLIZ.append(this.coalesceTriggerPost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnnotationContainerPerformanceData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.logicOpt = z;
        this.renderCoalesce = z2;
        this.measureOptimise = z3;
        this.fcpWinnerTime = z4;
        this.coalesceTriggerPost = z5;
    }
}
