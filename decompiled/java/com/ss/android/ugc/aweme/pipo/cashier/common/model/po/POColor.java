package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class POColor {

    @C09CT("color")
    public final String color;

    @C09CT("dark_mode_color")
    public final String darkColor;

    public POColor() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POColor)) {
            return false;
        }
        POColor pOColor = (POColor) obj;
        return Intrinsics.LJFF(this.color, pOColor.color) && Intrinsics.LJFF(this.darkColor, pOColor.darkColor);
    }

    public final int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkColor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POColor(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", darkColor=");
        sbLIZ.append(this.darkColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POColor(String str, String str2) {
        this.color = str;
        this.darkColor = str2;
    }
}
