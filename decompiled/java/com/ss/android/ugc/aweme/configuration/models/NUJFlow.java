package com.ss.android.ugc.aweme.configuration.models;

import X.AbstractC1153390g7V;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NUJFlow extends AbstractC1153390g7V {

    @C09CT("flow")
    public final List<NUAbilityNode> flow;

    @C09CT("forced_cover")
    public final boolean forcedCover;

    public NUJFlow() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NUJFlow)) {
            return false;
        }
        NUJFlow nUJFlow = (NUJFlow) obj;
        return this.forcedCover == nUJFlow.forcedCover && Intrinsics.LJFF(this.flow, nUJFlow.flow);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.forcedCover) * 31) + this.flow.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUJFlow(forcedCover=");
        sbLIZ.append(this.forcedCover);
        sbLIZ.append(", flow=");
        sbLIZ.append(this.flow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NUJFlow(boolean z, List<NUAbilityNode> list) {
        this.forcedCover = z;
        this.flow = list;
    }

    public NUJFlow(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
