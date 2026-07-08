package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AICreateModelTag {

    @C09CT("icon")
    public final String icon;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICreateModelTag)) {
            return false;
        }
        AICreateModelTag aICreateModelTag = (AICreateModelTag) obj;
        return Intrinsics.LJFF(this.icon, aICreateModelTag.icon) && Intrinsics.LJFF(this.value, aICreateModelTag.value);
    }

    public final int hashCode() {
        return (this.icon.hashCode() * 31) + this.value.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICreateModelTag(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AICreateModelTag() {
        this("", "");
    }

    public AICreateModelTag(String str, String str2) {
        this.icon = str;
        this.value = str2;
    }
}
