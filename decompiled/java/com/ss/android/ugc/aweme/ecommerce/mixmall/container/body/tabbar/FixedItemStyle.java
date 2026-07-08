package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemStyle {

    @C09CT("division_line")
    public FixedItemDivisionLineStyle divisionLine;

    @C09CT("height")
    public Float height;

    @C09CT("icon_inset")
    public List<Float> iconInset;

    @C09CT("width")
    public Float width;

    public FixedItemStyle() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemStyle)) {
            return false;
        }
        FixedItemStyle fixedItemStyle = (FixedItemStyle) obj;
        return Intrinsics.LJFF(this.iconInset, fixedItemStyle.iconInset) && Intrinsics.LJFF(this.divisionLine, fixedItemStyle.divisionLine) && Intrinsics.LJFF(this.width, fixedItemStyle.width) && Intrinsics.LJFF(this.height, fixedItemStyle.height);
    }

    public final int hashCode() {
        List<Float> list = this.iconInset;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        FixedItemDivisionLineStyle fixedItemDivisionLineStyle = this.divisionLine;
        int iHashCode2 = (iHashCode + (fixedItemDivisionLineStyle == null ? 0 : fixedItemDivisionLineStyle.hashCode())) * 31;
        Float f = this.width;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        return iHashCode3 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemStyle(iconInset=");
        sbLIZ.append(this.iconInset);
        sbLIZ.append(", divisionLine=");
        sbLIZ.append(this.divisionLine);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemStyle(List<Float> list, FixedItemDivisionLineStyle fixedItemDivisionLineStyle, Float f, Float f2) {
        this.iconInset = list;
        this.divisionLine = fixedItemDivisionLineStyle;
        this.width = f;
        this.height = f2;
    }
}
