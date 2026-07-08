package com.ss.android.ugc.tiktok.fcpbusiness.funnel;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityAvoidDetail implements Serializable {

    @C09CT("container_avoid")
    public final String containerAvoid;

    @C09CT("global_avoid")
    public final String globalAvoid;

    @C09CT("standard_priority_avoid")
    public final String standard;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriorityAvoidDetail)) {
            return false;
        }
        PriorityAvoidDetail priorityAvoidDetail = (PriorityAvoidDetail) obj;
        return Intrinsics.LJFF(this.globalAvoid, priorityAvoidDetail.globalAvoid) && Intrinsics.LJFF(this.containerAvoid, priorityAvoidDetail.containerAvoid) && Intrinsics.LJFF(this.standard, priorityAvoidDetail.standard);
    }

    public int hashCode() {
        return (((this.globalAvoid.hashCode() * 31) + this.containerAvoid.hashCode()) * 31) + this.standard.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityAvoidDetail(globalAvoid=");
        sbLIZ.append(this.globalAvoid);
        sbLIZ.append(", containerAvoid=");
        sbLIZ.append(this.containerAvoid);
        sbLIZ.append(", standard=");
        sbLIZ.append(this.standard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriorityAvoidDetail() {
        this("", "", "");
    }

    public PriorityAvoidDetail(String str, String str2, String str3) {
        this.globalAvoid = str;
        this.containerAvoid = str2;
        this.standard = str3;
    }
}
