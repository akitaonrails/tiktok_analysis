package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Filter {

    @C09CT("group_type_pattern")
    public final String groupTypePattern;

    @C09CT("name_pattern")
    public final String namePattern;

    public Filter() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) obj;
        return Intrinsics.LJFF(this.namePattern, filter.namePattern) && Intrinsics.LJFF(this.groupTypePattern, filter.groupTypePattern);
    }

    public int hashCode() {
        String str = this.namePattern;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupTypePattern;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Filter(namePattern=");
        sbLIZ.append((Object) this.namePattern);
        sbLIZ.append(", groupTypePattern=");
        sbLIZ.append((Object) this.groupTypePattern);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Filter(String str, String str2) {
        this.namePattern = str;
        this.groupTypePattern = str2;
    }
}
