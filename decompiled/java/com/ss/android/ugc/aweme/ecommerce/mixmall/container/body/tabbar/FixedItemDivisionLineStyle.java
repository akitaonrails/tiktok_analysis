package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemDivisionLineStyle {

    @C09CT("dark")
    public FixedItemLineModeStyle dark;

    @C09CT("light")
    public FixedItemLineModeStyle light;

    @C09CT("width")
    public Float width;

    public FixedItemDivisionLineStyle() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemDivisionLineStyle)) {
            return false;
        }
        FixedItemDivisionLineStyle fixedItemDivisionLineStyle = (FixedItemDivisionLineStyle) obj;
        return Intrinsics.LJFF(this.width, fixedItemDivisionLineStyle.width) && Intrinsics.LJFF(this.light, fixedItemDivisionLineStyle.light) && Intrinsics.LJFF(this.dark, fixedItemDivisionLineStyle.dark);
    }

    public final int hashCode() {
        Float f = this.width;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        FixedItemLineModeStyle fixedItemLineModeStyle = this.light;
        int iHashCode2 = (iHashCode + (fixedItemLineModeStyle == null ? 0 : fixedItemLineModeStyle.hashCode())) * 31;
        FixedItemLineModeStyle fixedItemLineModeStyle2 = this.dark;
        return iHashCode2 + (fixedItemLineModeStyle2 != null ? fixedItemLineModeStyle2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemDivisionLineStyle(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemDivisionLineStyle(Float f, FixedItemLineModeStyle fixedItemLineModeStyle, FixedItemLineModeStyle fixedItemLineModeStyle2) {
        this.width = f;
        this.light = fixedItemLineModeStyle;
        this.dark = fixedItemLineModeStyle2;
    }
}
