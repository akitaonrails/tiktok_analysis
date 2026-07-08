package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputInfo)) {
            return false;
        }
        InputInfo inputInfo = (InputInfo) obj;
        return this.type == inputInfo.type && Intrinsics.LJFF(this.value, inputInfo.value) && Intrinsics.LJFF(this.extra, inputInfo.extra);
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.value;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extra;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
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
