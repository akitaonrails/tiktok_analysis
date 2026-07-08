package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class IconBackgroundDO extends BaseWidgetDO {

    @C09CT("color")
    public final ColorDO color;

    @C09CT("corner")
    public final CornerDO corner;

    @C09CT("has_red_point")
    public final Integer hasRedPoint;

    @C09CT("height")
    public final String height;

    @C09CT("width")
    public final String width;

    public IconBackgroundDO() {
        this(null, null, null, null, null);
    }

    public final IconBackgroundDO copy(String str, String str2, ColorDO colorDO, CornerDO cornerDO, Integer num) {
        return new IconBackgroundDO(str, str2, colorDO, cornerDO, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconBackgroundDO)) {
            return false;
        }
        IconBackgroundDO iconBackgroundDO = (IconBackgroundDO) obj;
        return Intrinsics.LJFF(this.width, iconBackgroundDO.width) && Intrinsics.LJFF(this.height, iconBackgroundDO.height) && Intrinsics.LJFF(this.color, iconBackgroundDO.color) && Intrinsics.LJFF(this.corner, iconBackgroundDO.corner) && Intrinsics.LJFF(this.hasRedPoint, iconBackgroundDO.hasRedPoint);
    }

    public int hashCode() {
        String str = this.width;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.height;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ColorDO colorDO = this.color;
        int iHashCode3 = (iHashCode2 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        CornerDO cornerDO = this.corner;
        int iHashCode4 = (iHashCode3 + (cornerDO == null ? 0 : cornerDO.hashCode())) * 31;
        Integer num = this.hasRedPoint;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconBackgroundDO(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", corner=");
        sbLIZ.append(this.corner);
        sbLIZ.append(", hasRedPoint=");
        sbLIZ.append(this.hasRedPoint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ColorDO getColor() {
        return this.color;
    }

    public final CornerDO getCorner() {
        return this.corner;
    }

    public final Integer getHasRedPoint() {
        return this.hasRedPoint;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getWidth() {
        return this.width;
    }

    public IconBackgroundDO(String str, String str2, ColorDO colorDO, CornerDO cornerDO, Integer num) {
        super(null, null, 1, null, null);
        this.width = str;
        this.height = str2;
        this.color = colorDO;
        this.corner = cornerDO;
        this.hasRedPoint = num;
    }
}
