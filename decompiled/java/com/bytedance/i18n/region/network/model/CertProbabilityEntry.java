package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CertProbabilityEntry {

    @C09CT("token")
    public final String token;

    @C09CT("value")
    public final double value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertProbabilityEntry)) {
            return false;
        }
        CertProbabilityEntry certProbabilityEntry = (CertProbabilityEntry) obj;
        return Intrinsics.LJFF(this.token, certProbabilityEntry.token) && Double.compare(this.value, certProbabilityEntry.value) == 0;
    }

    public final int hashCode() {
        return (this.token.hashCode() * 31) + C786410Ut5.X2(this.value);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertProbabilityEntry(token=");
        sbLIZ.append(this.token);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CertProbabilityEntry(String str, double d) {
        this.token = str;
        this.value = d;
    }
}
