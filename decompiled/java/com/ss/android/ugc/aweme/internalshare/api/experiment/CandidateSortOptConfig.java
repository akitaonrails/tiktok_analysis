package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes22.dex */
public final class CandidateSortOptConfig {

    @C09CT("candidate_promote_length")
    public final int candidatePromoteLength;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("filter_direct")
    public final boolean filterDirect;

    @C09CT("first_screen_threshold")
    public final int firstScreenThreshold;

    @C09CT("promote_to_back")
    public final boolean promoteToBack;

    @C09CT("resort_outside_first_screen")
    public final boolean resortOutsideFirstScreen;

    public CandidateSortOptConfig() {
        this(false, false, 3, false, false, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandidateSortOptConfig)) {
            return false;
        }
        CandidateSortOptConfig candidateSortOptConfig = (CandidateSortOptConfig) obj;
        return this.enable == candidateSortOptConfig.enable && this.promoteToBack == candidateSortOptConfig.promoteToBack && this.candidatePromoteLength == candidateSortOptConfig.candidatePromoteLength && this.resortOutsideFirstScreen == candidateSortOptConfig.resortOutsideFirstScreen && this.filterDirect == candidateSortOptConfig.filterDirect && this.firstScreenThreshold == candidateSortOptConfig.firstScreenThreshold;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.promoteToBack)) * 31) + this.candidatePromoteLength) * 31) + C786410Ut5.Z2(this.resortOutsideFirstScreen)) * 31) + C786410Ut5.Z2(this.filterDirect)) * 31) + this.firstScreenThreshold;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CandidateSortOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", promoteToBack=");
        sbLIZ.append(this.promoteToBack);
        sbLIZ.append(", candidatePromoteLength=");
        sbLIZ.append(this.candidatePromoteLength);
        sbLIZ.append(", resortOutsideFirstScreen=");
        sbLIZ.append(this.resortOutsideFirstScreen);
        sbLIZ.append(", filterDirect=");
        sbLIZ.append(this.filterDirect);
        sbLIZ.append(", firstScreenThreshold=");
        sbLIZ.append(this.firstScreenThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CandidateSortOptConfig(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2) {
        this.enable = z;
        this.promoteToBack = z2;
        this.candidatePromoteLength = i;
        this.resortOutsideFirstScreen = z3;
        this.filterDirect = z4;
        this.firstScreenThreshold = i2;
    }
}
