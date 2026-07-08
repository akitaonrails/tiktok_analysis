package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LabelCommonData {

    @C09CT("ab_params")
    public final String abParams;

    public LabelCommonData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LabelCommonData) && Intrinsics.LJFF(this.abParams, ((LabelCommonData) obj).abParams);
    }

    public final int hashCode() {
        String str = this.abParams;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelCommonData(abParams=");
        sbLIZ.append(this.abParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LabelCommonData(String str) {
        this.abParams = str;
    }
}
