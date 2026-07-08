package com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIGCWorkflowBusinessConfig {

    @C09CT("businessExtraEtConfig")
    public final String businessExtraEtConfig;

    public AIGCWorkflowBusinessConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGCWorkflowBusinessConfig) && Intrinsics.LJFF(this.businessExtraEtConfig, ((AIGCWorkflowBusinessConfig) obj).businessExtraEtConfig);
    }

    public final int hashCode() {
        String str = this.businessExtraEtConfig;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowBusinessConfig(businessExtraEtConfig=");
        sbLIZ.append(this.businessExtraEtConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowBusinessConfig(String str) {
        this.businessExtraEtConfig = str;
    }
}
