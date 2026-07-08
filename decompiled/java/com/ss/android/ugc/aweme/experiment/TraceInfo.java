package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TraceInfo {

    @C09CT("tab_change_influencing_factors")
    public final TabChangeInfluencingFactors tabChangeInfluencingFactors;

    public TraceInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraceInfo) && Intrinsics.LJFF(this.tabChangeInfluencingFactors, ((TraceInfo) obj).tabChangeInfluencingFactors);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceInfo(tabChangeInfluencingFactors=");
        sbLIZ.append(this.tabChangeInfluencingFactors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TraceInfo(TabChangeInfluencingFactors tabChangeInfluencingFactors) {
        this.tabChangeInfluencingFactors = tabChangeInfluencingFactors;
    }
}
