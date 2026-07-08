package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CrowdUid {

    @C09CT("show_tako_onboarding")
    public final Integer showTakoOnboarding;

    public CrowdUid() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CrowdUid) && Intrinsics.LJFF(this.showTakoOnboarding, ((CrowdUid) obj).showTakoOnboarding);
    }

    public final int hashCode() {
        Integer num = this.showTakoOnboarding;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CrowdUid(showTakoOnboarding=");
        sbLIZ.append(this.showTakoOnboarding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CrowdUid(Integer num) {
        this.showTakoOnboarding = num;
    }
}
