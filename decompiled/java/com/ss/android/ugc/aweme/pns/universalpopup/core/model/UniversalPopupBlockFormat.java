package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBlockFormat implements Serializable {

    @C09CT("corner_positions")
    public String cornerPosition;

    @C09CT("corner_radius")
    public int cornerRadius;

    @C09CT("margin_bottom")
    public int marginBottom;

    @C09CT("margin_left")
    public int marginLeft;

    @C09CT("margin_right")
    public int marginRight;

    @C09CT("margin_top")
    public int marginTop;

    @C09CT("padding_bottom")
    public int paddingBottom;

    @C09CT("padding_left")
    public int paddingLeft;

    @C09CT("padding_right")
    public int paddingRight;

    @C09CT("padding_top")
    public int paddingTop;

    public final UniversalPopupBlockFormat copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str) {
        return new UniversalPopupBlockFormat(i, i2, i3, i4, i5, i6, i7, i8, i9, str);
    }

    public UniversalPopupBlockFormat() {
        this(32, 32, 0, 0, 0, 0, 0, 0, -1, "all");
    }

    public final void setCornerPosition(String str) {
        this.cornerPosition = str;
    }

    public final void setCornerRadius(int i) {
        this.cornerRadius = i;
    }

    public final void setMarginBottom(int i) {
        this.marginBottom = i;
    }

    public final void setMarginLeft(int i) {
        this.marginLeft = i;
    }

    public final void setMarginRight(int i) {
        this.marginRight = i;
    }

    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    public final void setPaddingBottom(int i) {
        this.paddingBottom = i;
    }

    public final void setPaddingLeft(int i) {
        this.paddingLeft = i;
    }

    public final void setPaddingRight(int i) {
        this.paddingRight = i;
    }

    public final void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public UniversalPopupBlockFormat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str) {
        this.marginLeft = i;
        this.marginRight = i2;
        this.marginTop = i3;
        this.marginBottom = i4;
        this.paddingLeft = i5;
        this.paddingRight = i6;
        this.paddingTop = i7;
        this.paddingBottom = i8;
        this.cornerRadius = i9;
        this.cornerPosition = str;
    }
}
