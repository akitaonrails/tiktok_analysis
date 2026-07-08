package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class InputInfo {

    @C09CT("extra")
    public final String extra;

    @C09CT("type")
    public final int type;

    @C09CT("value")
    public final String value;

    public InputInfo() {
        this(2, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InputInfo(int i, String str, String str2) {
        this.type = i;
        this.value = str;
        this.extra = str2;
    }
}
