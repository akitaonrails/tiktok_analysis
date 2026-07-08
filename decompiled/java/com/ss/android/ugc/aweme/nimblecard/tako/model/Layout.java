package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class Layout {

    @C09CT("alignContent")
    public String alignContent;

    @C09CT("alignItems")
    public String alignItems;

    @C09CT("alignSelf")
    public String alignSelf;

    @C09CT("aspectRatio")
    public String aspectRatio;

    @C09CT("borderWidth")
    public String border;

    @C09CT("borderBottomWidth")
    public String borderBottomWidth;

    @C09CT("borderLeftWidth")
    public String borderLeftWidth;

    @C09CT("borderRightWidth")
    public String borderRightWidth;

    @C09CT("borderTopWidth")
    public String borderTopWidth;

    @C09CT("bottom")
    public String bottom;

    @C09CT("boxSizing")
    public String boxSizing;

    @C09CT("columnGap")
    public String columnGap;

    @C09CT("direction")
    public String direction;

    @C09CT("display")
    public String display;

    @C09CT("flex")
    public String flex;

    @C09CT("flexBasis")
    public String flexBasis;

    @C09CT("flexDirection")
    public String flexDirection;

    @C09CT("flexGrow")
    public String flexGrow;

    @C09CT("flexShrink")
    public String flexShrink;

    @C09CT("flexWrap")
    public String flexWrap;

    @C09CT("gap")
    public String gap;

    @C09CT("height")
    public String height;

    @C09CT("justifyContent")
    public String justifyContent;

    @C09CT("left")
    public String left;

    @C09CT("margin")
    public String margin;

    @C09CT("marginBottom")
    public String marginBottom;

    @C09CT("marginEnd")
    public String marginEnd;

    @C09CT("marginLeft")
    public String marginLeft;

    @C09CT("marginRight")
    public String marginRight;

    @C09CT("marginStart")
    public String marginStart;

    @C09CT("marginTop")
    public String marginTop;

    @C09CT("maxHeight")
    public String maxHeight;

    @C09CT("maxWidth")
    public String maxWidth;

    @C09CT("minHeight")
    public String minHeight;

    @C09CT("minWidth")
    public String minWidth;

    @C09CT("overflow")
    public String overflow;

    @C09CT("padding")
    public String padding;

    @C09CT("paddingBottom")
    public String paddingBottom;

    @C09CT("paddingEnd")
    public String paddingEnd;

    @C09CT("paddingLeft")
    public String paddingLeft;

    @C09CT("paddingRight")
    public String paddingRight;

    @C09CT("paddingStart")
    public String paddingStart;

    @C09CT("paddingTop")
    public String paddingTop;

    @C09CT("position")
    public String positionType;

    @C09CT("right")
    public String right;

    @C09CT("rowGap")
    public String rowGap;

    @C09CT("top")
    public String top;

    @C09CT("width")
    public String width;

    public Layout() {
        this(null, null, null, null, null, null, null, null, null, "auto", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return Intrinsics.LJFF(this.flexDirection, layout.flexDirection) && Intrinsics.LJFF(this.justifyContent, layout.justifyContent) && Intrinsics.LJFF(this.alignItems, layout.alignItems) && Intrinsics.LJFF(this.alignContent, layout.alignContent) && Intrinsics.LJFF(this.flexWrap, layout.flexWrap) && Intrinsics.LJFF(this.flexBasis, layout.flexBasis) && Intrinsics.LJFF(this.flexGrow, layout.flexGrow) && Intrinsics.LJFF(this.flex, layout.flex) && Intrinsics.LJFF(this.flexShrink, layout.flexShrink) && Intrinsics.LJFF(this.alignSelf, layout.alignSelf) && Intrinsics.LJFF(this.width, layout.width) && Intrinsics.LJFF(this.height, layout.height) && Intrinsics.LJFF(this.minHeight, layout.minHeight) && Intrinsics.LJFF(this.maxHeight, layout.maxHeight) && Intrinsics.LJFF(this.minWidth, layout.minWidth) && Intrinsics.LJFF(this.maxWidth, layout.maxWidth) && Intrinsics.LJFF(this.margin, layout.margin) && Intrinsics.LJFF(this.marginBottom, layout.marginBottom) && Intrinsics.LJFF(this.marginEnd, layout.marginEnd) && Intrinsics.LJFF(this.marginLeft, layout.marginLeft) && Intrinsics.LJFF(this.marginRight, layout.marginRight) && Intrinsics.LJFF(this.marginStart, layout.marginStart) && Intrinsics.LJFF(this.marginTop, layout.marginTop) && Intrinsics.LJFF(this.overflow, layout.overflow) && Intrinsics.LJFF(this.padding, layout.padding) && Intrinsics.LJFF(this.paddingBottom, layout.paddingBottom) && Intrinsics.LJFF(this.paddingEnd, layout.paddingEnd) && Intrinsics.LJFF(this.paddingLeft, layout.paddingLeft) && Intrinsics.LJFF(this.paddingRight, layout.paddingRight) && Intrinsics.LJFF(this.paddingStart, layout.paddingStart) && Intrinsics.LJFF(this.paddingTop, layout.paddingTop) && Intrinsics.LJFF(this.gap, layout.gap) && Intrinsics.LJFF(this.rowGap, layout.rowGap) && Intrinsics.LJFF(this.columnGap, layout.columnGap) && Intrinsics.LJFF(this.positionType, layout.positionType) && Intrinsics.LJFF(this.left, layout.left) && Intrinsics.LJFF(this.right, layout.right) && Intrinsics.LJFF(this.top, layout.top) && Intrinsics.LJFF(this.bottom, layout.bottom) && Intrinsics.LJFF(this.boxSizing, layout.boxSizing) && Intrinsics.LJFF(this.border, layout.border) && Intrinsics.LJFF(this.borderBottomWidth, layout.borderBottomWidth) && Intrinsics.LJFF(this.borderRightWidth, layout.borderRightWidth) && Intrinsics.LJFF(this.borderLeftWidth, layout.borderLeftWidth) && Intrinsics.LJFF(this.borderTopWidth, layout.borderTopWidth) && Intrinsics.LJFF(this.aspectRatio, layout.aspectRatio) && Intrinsics.LJFF(this.direction, layout.direction) && Intrinsics.LJFF(this.display, layout.display);
    }

    public final int hashCode() {
        String str = this.flexDirection;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.justifyContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alignItems;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.alignContent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flexWrap;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flexBasis;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.flexGrow;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.flex;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flexShrink;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.alignSelf.hashCode()) * 31;
        String str10 = this.width;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.height;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.minHeight;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.maxHeight;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.minWidth;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.maxWidth;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.margin;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.marginBottom;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.marginEnd;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.marginLeft;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.marginRight;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.marginStart;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.marginTop;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.overflow;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.padding;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.paddingBottom;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.paddingEnd;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.paddingLeft;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.paddingRight;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.paddingStart;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.paddingTop;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.gap;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.rowGap;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.columnGap;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.positionType;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.left;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.right;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.top;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.bottom;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.boxSizing;
        int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.border;
        int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.borderBottomWidth;
        int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.borderRightWidth;
        int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.borderLeftWidth;
        int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.borderTopWidth;
        int iHashCode44 = (iHashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.aspectRatio;
        int iHashCode45 = (iHashCode44 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.direction;
        int iHashCode46 = (iHashCode45 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.display;
        return iHashCode46 + (str47 != null ? str47.hashCode() : 0);
    }

    public final String toString() {
        return "Layout(flexDirection=" + this.flexDirection + ", justifyContent=" + this.justifyContent + ", alignItems=" + this.alignItems + ", alignContent=" + this.alignContent + ", flexWrap=" + this.flexWrap + ", flexBasis=" + this.flexBasis + ", flexGrow=" + this.flexGrow + ", flex=" + this.flex + ", flexShrink=" + this.flexShrink + ", alignSelf=" + this.alignSelf + ", width=" + this.width + ", height=" + this.height + ", minHeight=" + this.minHeight + ", maxHeight=" + this.maxHeight + ", minWidth=" + this.minWidth + ", maxWidth=" + this.maxWidth + ", margin=" + this.margin + ", marginBottom=" + this.marginBottom + ", marginEnd=" + this.marginEnd + ", marginLeft=" + this.marginLeft + ", marginRight=" + this.marginRight + ", marginStart=" + this.marginStart + ", marginTop=" + this.marginTop + ", overflow=" + this.overflow + ", padding=" + this.padding + ", paddingBottom=" + this.paddingBottom + ", paddingEnd=" + this.paddingEnd + ", paddingLeft=" + this.paddingLeft + ", paddingRight=" + this.paddingRight + ", paddingStart=" + this.paddingStart + ", paddingTop=" + this.paddingTop + ", gap=" + this.gap + ", rowGap=" + this.rowGap + ", columnGap=" + this.columnGap + ", positionType=" + this.positionType + ", left=" + this.left + ", right=" + this.right + ", top=" + this.top + ", bottom=" + this.bottom + ", boxSizing=" + this.boxSizing + ", border=" + this.border + ", borderBottomWidth=" + this.borderBottomWidth + ", borderRightWidth=" + this.borderRightWidth + ", borderLeftWidth=" + this.borderLeftWidth + ", borderTopWidth=" + this.borderTopWidth + ", aspectRatio=" + this.aspectRatio + ", direction=" + this.direction + ", display=" + this.display + ')';
    }

    public Layout(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48) {
        this.flexDirection = str;
        this.justifyContent = str2;
        this.alignItems = str3;
        this.alignContent = str4;
        this.flexWrap = str5;
        this.flexBasis = str6;
        this.flexGrow = str7;
        this.flex = str8;
        this.flexShrink = str9;
        this.alignSelf = str10;
        this.width = str11;
        this.height = str12;
        this.minHeight = str13;
        this.maxHeight = str14;
        this.minWidth = str15;
        this.maxWidth = str16;
        this.margin = str17;
        this.marginBottom = str18;
        this.marginEnd = str19;
        this.marginLeft = str20;
        this.marginRight = str21;
        this.marginStart = str22;
        this.marginTop = str23;
        this.overflow = str24;
        this.padding = str25;
        this.paddingBottom = str26;
        this.paddingEnd = str27;
        this.paddingLeft = str28;
        this.paddingRight = str29;
        this.paddingStart = str30;
        this.paddingTop = str31;
        this.gap = str32;
        this.rowGap = str33;
        this.columnGap = str34;
        this.positionType = str35;
        this.left = str36;
        this.right = str37;
        this.top = str38;
        this.bottom = str39;
        this.boxSizing = str40;
        this.border = str41;
        this.borderBottomWidth = str42;
        this.borderRightWidth = str43;
        this.borderLeftWidth = str44;
        this.borderTopWidth = str45;
        this.aspectRatio = str46;
        this.direction = str47;
        this.display = str48;
    }
}
