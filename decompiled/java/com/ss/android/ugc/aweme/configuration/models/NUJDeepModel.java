package com.ss.android.ugc.aweme.configuration.models;

import X.AbstractC1153390g7V;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NUJDeepModel extends AbstractC1153390g7V {

    @C09CT("deep")
    public final List<NUAbilityNode> deep;

    public NUJDeepModel() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NUJDeepModel) && Intrinsics.LJFF(this.deep, ((NUJDeepModel) obj).deep);
    }

    public final int hashCode() {
        return this.deep.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUJDeepModel(deep=");
        sbLIZ.append(this.deep);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NUJDeepModel(List<NUAbilityNode> list) {
        this.deep = list;
    }

    public NUJDeepModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
