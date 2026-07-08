package com.larus.business.markdown.api.model;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes31.dex */
public final class ListItemConfig {
    public final int blockLeadingMargin;
    public final int blockLeadingMarginInQuote;
    public final int bulletBlockLeadingMargin;
    public final int bulletBlockLeadingMarginInQuote;
    public final boolean bulletStyleUnify;
    public final int bulletTextMargin;
    public final int bulletTextMarginInQuote;
    public final int bulletWidth;
    public final int bulletWidthInQuote;
    public final int listItemColor;
    public final int listItemColorInQuote;
    public final int marginPace;
    public final int orderedBlockLeadingMargin;
    public final int orderedBlockLeadingMarginInQuote;
    public final int orderedTextMargin;
    public final int orderedTextMarginInQuote;
    public final int startMargin;
    public final int textMargin;
    public final int textMarginInQuote;
    public final boolean useCustomIndent;

    public ListItemConfig() {
        this(false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0);
    }

    public final ListItemConfig copy(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z2, int i17, int i18) {
        return new ListItemConfig(z, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, z2, i17, i18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListItemConfig)) {
            return false;
        }
        ListItemConfig listItemConfig = (ListItemConfig) obj;
        return this.bulletStyleUnify == listItemConfig.bulletStyleUnify && this.bulletTextMargin == listItemConfig.bulletTextMargin && this.orderedTextMargin == listItemConfig.orderedTextMargin && this.textMargin == listItemConfig.textMargin && this.bulletBlockLeadingMargin == listItemConfig.bulletBlockLeadingMargin && this.orderedBlockLeadingMargin == listItemConfig.orderedBlockLeadingMargin && this.blockLeadingMargin == listItemConfig.blockLeadingMargin && this.bulletWidth == listItemConfig.bulletWidth && this.listItemColor == listItemConfig.listItemColor && this.bulletTextMarginInQuote == listItemConfig.bulletTextMarginInQuote && this.orderedTextMarginInQuote == listItemConfig.orderedTextMarginInQuote && this.textMarginInQuote == listItemConfig.textMarginInQuote && this.bulletBlockLeadingMarginInQuote == listItemConfig.bulletBlockLeadingMarginInQuote && this.orderedBlockLeadingMarginInQuote == listItemConfig.orderedBlockLeadingMarginInQuote && this.blockLeadingMarginInQuote == listItemConfig.blockLeadingMarginInQuote && this.bulletWidthInQuote == listItemConfig.bulletWidthInQuote && this.listItemColorInQuote == listItemConfig.listItemColorInQuote && this.useCustomIndent == listItemConfig.useCustomIndent && this.startMargin == listItemConfig.startMargin && this.marginPace == listItemConfig.marginPace;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((C786410Ut5.Z2(this.bulletStyleUnify) * 31) + this.bulletTextMargin) * 31) + this.orderedTextMargin) * 31) + this.textMargin) * 31) + this.bulletBlockLeadingMargin) * 31) + this.orderedBlockLeadingMargin) * 31) + this.blockLeadingMargin) * 31) + this.bulletWidth) * 31) + this.listItemColor) * 31) + this.bulletTextMarginInQuote) * 31) + this.orderedTextMarginInQuote) * 31) + this.textMarginInQuote) * 31) + this.bulletBlockLeadingMarginInQuote) * 31) + this.orderedBlockLeadingMarginInQuote) * 31) + this.blockLeadingMarginInQuote) * 31) + this.bulletWidthInQuote) * 31) + this.listItemColorInQuote) * 31) + C786410Ut5.Z2(this.useCustomIndent)) * 31) + this.startMargin) * 31) + this.marginPace;
    }

    public String toString() {
        return "ListItemConfig(bulletStyleUnify=" + this.bulletStyleUnify + ", bulletTextMargin=" + this.bulletTextMargin + ", orderedTextMargin=" + this.orderedTextMargin + ", textMargin=" + this.textMargin + ", bulletBlockLeadingMargin=" + this.bulletBlockLeadingMargin + ", orderedBlockLeadingMargin=" + this.orderedBlockLeadingMargin + ", blockLeadingMargin=" + this.blockLeadingMargin + ", bulletWidth=" + this.bulletWidth + ", listItemColor=" + this.listItemColor + ", bulletTextMarginInQuote=" + this.bulletTextMarginInQuote + ", orderedTextMarginInQuote=" + this.orderedTextMarginInQuote + ", textMarginInQuote=" + this.textMarginInQuote + ", bulletBlockLeadingMarginInQuote=" + this.bulletBlockLeadingMarginInQuote + ", orderedBlockLeadingMarginInQuote=" + this.orderedBlockLeadingMarginInQuote + ", blockLeadingMarginInQuote=" + this.blockLeadingMarginInQuote + ", bulletWidthInQuote=" + this.bulletWidthInQuote + ", listItemColorInQuote=" + this.listItemColorInQuote + ", useCustomIndent=" + this.useCustomIndent + ", startMargin=" + this.startMargin + ", marginPace=" + this.marginPace + ')';
    }

    public ListItemConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z2, int i17, int i18) {
        this.bulletStyleUnify = z;
        this.bulletTextMargin = i;
        this.orderedTextMargin = i2;
        this.textMargin = i3;
        this.bulletBlockLeadingMargin = i4;
        this.orderedBlockLeadingMargin = i5;
        this.blockLeadingMargin = i6;
        this.bulletWidth = i7;
        this.listItemColor = i8;
        this.bulletTextMarginInQuote = i9;
        this.orderedTextMarginInQuote = i10;
        this.textMarginInQuote = i11;
        this.bulletBlockLeadingMarginInQuote = i12;
        this.orderedBlockLeadingMarginInQuote = i13;
        this.blockLeadingMarginInQuote = i14;
        this.bulletWidthInQuote = i15;
        this.listItemColorInQuote = i16;
        this.useCustomIndent = z2;
        this.startMargin = i17;
        this.marginPace = i18;
    }
}
