package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Resolution {

    @C09CT("height")
    public final Integer height;

    @C09CT("width")
    public final Integer width;

    public Resolution() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return Intrinsics.LJFF(this.width, resolution.width) && Intrinsics.LJFF(this.height, resolution.height);
    }

    public final int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resolution(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Resolution(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }
}
