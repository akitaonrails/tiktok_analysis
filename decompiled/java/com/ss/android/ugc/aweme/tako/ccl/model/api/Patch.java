package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class Patch {

    @C09CT("field")
    public final String field;

    @C09CT("op")
    public final String op;

    @C09CT("value")
    public final String value;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Patch(op=");
        sbLIZ.append(this.op);
        sbLIZ.append(", field=");
        sbLIZ.append(this.field);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Patch() {
        this("", "", "");
    }

    public Patch(String str, String str2, String str3) {
        this.op = str;
        this.field = str2;
        this.value = str3;
    }
}
