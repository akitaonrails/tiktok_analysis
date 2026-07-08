package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider;

import X.C04DW;
import X.C09CT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DividerVO implements InterfaceC746802vq, C04DW {
    public final Integer LL;
    public String LLILLJJLI;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("bottom_margin")
    public final Integer bottomMargin;

    @C09CT("dark_color")
    public final String darkColor;

    @C09CT("height")
    public final float height;

    @C09CT("is_line_style")
    public final Boolean isLineStyle;

    @C09CT("left_margin")
    public final Integer leftMargin;

    @C09CT("light_color")
    public final String lightColor;

    @C09CT("radius_config")
    public final RadiusConfig radiusConfig;

    @C09CT("right_margin")
    public final Integer rightMargin;

    @C09CT("top_margin")
    public final Integer topMargin;

    public DividerVO() {
        this(0.0f, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerVO)) {
            return false;
        }
        DividerVO dividerVO = (DividerVO) obj;
        return Float.compare(this.height, dividerVO.height) == 0 && Intrinsics.LJFF(this.backgroundColor, dividerVO.backgroundColor) && Intrinsics.LJFF(this.lightColor, dividerVO.lightColor) && Intrinsics.LJFF(this.darkColor, dividerVO.darkColor) && Intrinsics.LJFF(this.topMargin, dividerVO.topMargin) && Intrinsics.LJFF(this.leftMargin, dividerVO.leftMargin) && Intrinsics.LJFF(this.rightMargin, dividerVO.rightMargin) && Intrinsics.LJFF(this.bottomMargin, dividerVO.bottomMargin) && Intrinsics.LJFF(this.isLineStyle, dividerVO.isLineStyle) && Intrinsics.LJFF(this.LL, dividerVO.LL) && Intrinsics.LJFF(this.radiusConfig, dividerVO.radiusConfig);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        return "DividerVO(height=" + this.height + ", backgroundColor=" + this.backgroundColor + ", lightColor=" + this.lightColor + ", darkColor=" + this.darkColor + ", topMargin=" + this.topMargin + ", leftMargin=" + this.leftMargin + ", rightMargin=" + this.rightMargin + ", bottomMargin=" + this.bottomMargin + ", isLineStyle=" + this.isLineStyle + ", localLineColor=" + this.LL + ", radiusConfig=" + this.radiusConfig + ')';
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.height) * 31;
        String str = this.backgroundColor;
        int iHashCode = (iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lightColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.topMargin;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.leftMargin;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightMargin;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottomMargin;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isLineStyle;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.LL;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        RadiusConfig radiusConfig = this.radiusConfig;
        return iHashCode9 + (radiusConfig != null ? radiusConfig.hashCode() : 0);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILLJJLI = str;
    }

    public DividerVO(float f, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, RadiusConfig radiusConfig) {
        this.height = f;
        this.backgroundColor = str;
        this.lightColor = str2;
        this.darkColor = str3;
        this.topMargin = num;
        this.leftMargin = num2;
        this.rightMargin = num3;
        this.bottomMargin = num4;
        this.isLineStyle = bool;
        this.LL = num5;
        this.radiusConfig = radiusConfig;
        this.LLILLJJLI = "undefined";
    }
}
