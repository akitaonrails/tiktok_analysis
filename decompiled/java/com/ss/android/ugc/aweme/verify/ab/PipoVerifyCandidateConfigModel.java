package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoVerifyCandidateConfigModel {

    @C09CT("candidate_switch_show_retry_count")
    public final Map<String, Integer> candidateSwitchShowRetryCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PipoVerifyCandidateConfigModel) && Intrinsics.LJFF(this.candidateSwitchShowRetryCount, ((PipoVerifyCandidateConfigModel) obj).candidateSwitchShowRetryCount);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.candidateSwitchShowRetryCount;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoVerifyCandidateConfigModel(candidateSwitchShowRetryCount=");
        sbLIZ.append(this.candidateSwitchShowRetryCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoVerifyCandidateConfigModel() {
        this(C2097608Jq.LJ());
    }

    public PipoVerifyCandidateConfigModel(Map<String, Integer> map) {
        this.candidateSwitchShowRetryCount = map;
    }
}
