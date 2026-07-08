package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PassParamsChannel {

    @C09CT("params")
    public final List<String> params;

    public PassParamsChannel() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassParamsChannel) && Intrinsics.LJFF(this.params, ((PassParamsChannel) obj).params);
    }

    public final int hashCode() {
        return this.params.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PassParamsChannel(params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PassParamsChannel(List<String> list) {
        this.params = list;
    }

    public PassParamsChannel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
