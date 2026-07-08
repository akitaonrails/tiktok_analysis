package com.larus.business.markdown.api.model;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes33.dex */
public final class TableConfig {
    public final Integer cellHorizontalPadding;
    public final Integer cellMaxWidth;
    public final Integer cellVerticalPadding;
    public final Integer copyButtonDrawableTintColor;
    public final boolean enableCopyButton;
    public final boolean enableFullScreenButton;
    public final boolean enableTableTitle;
    public final boolean enableTableWidthMatchParent;
    public final boolean needVerticalDivider;
    public final Float roundCornerRadius;
    public final Integer tableBorderColor;
    public final Integer tableBorderWidth;
    public final Integer tableHeaderRowBackgroundColor;
    public final Integer tableOddRowBackgroundColor;
    public final Float tableTextSize;
    public final String tableTitle;
    public final Integer tableTitleBgColor;
    public final Integer tableTitleBorderColor;
    public final Integer tableTitleBottomBorderColor;
    public final Float tableTitleBottomBorderWidth;
    public final Integer tableTitleSize;
    public final Integer tableTitleTextColor;
    public final Integer tableWidth;
    public final TitleStyle titleStyle;

    public TableConfig() {
        this(false, null, null, null, null, null, null, null, null, "", null, null, null, null, null, null, false, null, false, true, TitleStyle.LARGE, null, null, true);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enableTableTitle) * 31;
        Float f = this.tableTextSize;
        int iHashCode = (iZ2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.tableBorderWidth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tableBorderColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f2 = this.roundCornerRadius;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num3 = this.tableWidth;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.cellMaxWidth;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.cellVerticalPadding;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.cellHorizontalPadding;
        int iHashCode8 = (((iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31) + this.tableTitle.hashCode()) * 31;
        Integer num7 = this.tableTitleSize;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.tableTitleTextColor;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.tableTitleBgColor;
        int iHashCode11 = (iHashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.tableTitleBorderColor;
        int iHashCode12 = (iHashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.tableTitleBottomBorderColor;
        int iHashCode13 = (iHashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Float f3 = this.tableTitleBottomBorderWidth;
        int iHashCode14 = (((iHashCode13 + (f3 == null ? 0 : f3.hashCode())) * 31) + C786410Ut5.Z2(this.enableCopyButton)) * 31;
        Integer num12 = this.copyButtonDrawableTintColor;
        int iHashCode15 = (((((((iHashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31) + C786410Ut5.Z2(this.enableFullScreenButton)) * 31) + C786410Ut5.Z2(this.enableTableWidthMatchParent)) * 31) + this.titleStyle.hashCode()) * 31;
        Integer num13 = this.tableOddRowBackgroundColor;
        int iHashCode16 = (iHashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.tableHeaderRowBackgroundColor;
        return ((iHashCode16 + (num14 != null ? num14.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needVerticalDivider);
    }

    public TableConfig(boolean z, Float f, Integer num, Integer num2, Float f2, Integer num3, Integer num4, Integer num5, Integer num6, String str, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Float f3, boolean z2, Integer num12, boolean z3, boolean z4, TitleStyle titleStyle, Integer num13, Integer num14, boolean z5) {
        this.enableTableTitle = z;
        this.tableTextSize = f;
        this.tableBorderWidth = num;
        this.tableBorderColor = num2;
        this.roundCornerRadius = f2;
        this.tableWidth = num3;
        this.cellMaxWidth = num4;
        this.cellVerticalPadding = num5;
        this.cellHorizontalPadding = num6;
        this.tableTitle = str;
        this.tableTitleSize = num7;
        this.tableTitleTextColor = num8;
        this.tableTitleBgColor = num9;
        this.tableTitleBorderColor = num10;
        this.tableTitleBottomBorderColor = num11;
        this.tableTitleBottomBorderWidth = f3;
        this.enableCopyButton = z2;
        this.copyButtonDrawableTintColor = num12;
        this.enableFullScreenButton = z3;
        this.enableTableWidthMatchParent = z4;
        this.titleStyle = titleStyle;
        this.tableOddRowBackgroundColor = num13;
        this.tableHeaderRowBackgroundColor = num14;
        this.needVerticalDivider = z5;
    }
}
