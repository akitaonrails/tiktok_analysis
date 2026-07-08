package com.ss.android.ugc.aweme.persistence.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowLinkPersistence {

    @C09CT("from")
    public final String from;

    @C09CT("to")
    public final String to;

    public AIGCWorkflowLinkPersistence() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowLinkPersistence)) {
            return false;
        }
        AIGCWorkflowLinkPersistence aIGCWorkflowLinkPersistence = (AIGCWorkflowLinkPersistence) obj;
        return Intrinsics.LJFF(this.from, aIGCWorkflowLinkPersistence.from) && Intrinsics.LJFF(this.to, aIGCWorkflowLinkPersistence.to);
    }

    public final int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowLinkPersistence(from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", to=");
        sbLIZ.append(this.to);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowLinkPersistence(String str, String str2) {
        this.from = str;
        this.to = str2;
    }
}
