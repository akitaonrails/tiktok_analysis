package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Footer {

    @C09CT("extra_actions")
    public final List<Object> extraActions;

    public Footer() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Footer) && Intrinsics.LJFF(this.extraActions, ((Footer) obj).extraActions);
    }

    public final int hashCode() {
        return this.extraActions.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Footer(extraActions=");
        sbLIZ.append(this.extraActions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Footer(List<Object> list) {
        this.extraActions = list;
    }

    public Footer(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
