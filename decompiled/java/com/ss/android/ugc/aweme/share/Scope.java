package com.ss.android.ugc.aweme.share;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class Scope {

    @C09CT("desc")
    public final String desc;

    @C09CT("name")
    public final String name;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scope(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Scope(String str, String str2) {
        this.name = str;
        this.desc = str2;
    }
}
