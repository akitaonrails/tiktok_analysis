package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LayoutParamDO implements Serializable {

    @C09CT("card_width_type")
    public final String cardWidthType;

    @C09CT("column_count")
    public final Integer columnCount;

    @C09CT("gravity")
    public final String gravity;

    @C09CT("item_space_horizontal")
    public final String itemSpaceHorizontal;

    @C09CT("item_space_vertical")
    public final String itemSpaceVertical;

    @C09CT("orientation")
    public final String orientation;

    @C09CT("padding")
    public final MarginDO padding;

    public LayoutParamDO() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutParamDO)) {
            return false;
        }
        LayoutParamDO layoutParamDO = (LayoutParamDO) obj;
        return Intrinsics.LJFF(this.cardWidthType, layoutParamDO.cardWidthType) && Intrinsics.LJFF(this.itemSpaceHorizontal, layoutParamDO.itemSpaceHorizontal) && Intrinsics.LJFF(this.itemSpaceVertical, layoutParamDO.itemSpaceVertical) && Intrinsics.LJFF(this.columnCount, layoutParamDO.columnCount) && Intrinsics.LJFF(this.padding, layoutParamDO.padding) && Intrinsics.LJFF(this.orientation, layoutParamDO.orientation) && Intrinsics.LJFF(this.gravity, layoutParamDO.gravity);
    }

    public int hashCode() {
        String str = this.cardWidthType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemSpaceHorizontal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemSpaceVertical;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.columnCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        MarginDO marginDO = this.padding;
        int iHashCode5 = (iHashCode4 + (marginDO == null ? 0 : marginDO.hashCode())) * 31;
        String str4 = this.orientation;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gravity;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public LayoutParamDO(String str, String str2, String str3, Integer num, MarginDO marginDO, String str4, String str5) {
        this.cardWidthType = str;
        this.itemSpaceHorizontal = str2;
        this.itemSpaceVertical = str3;
        this.columnCount = num;
        this.padding = marginDO;
        this.orientation = str4;
        this.gravity = str5;
    }
}
