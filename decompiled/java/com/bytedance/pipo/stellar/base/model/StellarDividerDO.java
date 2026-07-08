package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarDividerDO extends BaseWidgetDO {

    @C09CT("color")
    public final ColorDO color;

    @C09CT("line_width")
    public final Float lineWidth;

    @C09CT("margin")
    public final MarginDO margin;

    public StellarDividerDO() {
        this(null, null, null);
    }

    public final StellarDividerDO copy(ColorDO colorDO, Float f, MarginDO marginDO) {
        return new StellarDividerDO(colorDO, f, marginDO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarDividerDO)) {
            return false;
        }
        StellarDividerDO stellarDividerDO = (StellarDividerDO) obj;
        return Intrinsics.LJFF(this.color, stellarDividerDO.color) && Intrinsics.LJFF(this.lineWidth, stellarDividerDO.lineWidth) && Intrinsics.LJFF(this.margin, stellarDividerDO.margin);
    }

    public int hashCode() {
        ColorDO colorDO = this.color;
        int iHashCode = (colorDO == null ? 0 : colorDO.hashCode()) * 31;
        Float f = this.lineWidth;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        MarginDO marginDO = this.margin;
        return iHashCode2 + (marginDO != null ? marginDO.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StellarDividerDO(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", lineWidth=");
        sbLIZ.append(this.lineWidth);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ColorDO getColor() {
        return this.color;
    }

    public final Float getLineWidth() {
        return this.lineWidth;
    }

    public final MarginDO getMargin() {
        return this.margin;
    }

    public StellarDividerDO(ColorDO colorDO, Float f, MarginDO marginDO) {
        super(null, null, 1, null, null);
        this.color = colorDO;
        this.lineWidth = f;
        this.margin = marginDO;
    }
}
