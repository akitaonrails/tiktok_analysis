package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class StyleInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("disable_label")
    public boolean disableLabel;

    @C09CT("is_bigger_style")
    public boolean isBiggerStyle;

    @C09CT("is_show_three_lines")
    public boolean isShowThreeLines;

    @C09CT("max_width")
    public int maxWidth;

    @C09CT("show_icon")
    public boolean showIcon;

    public final StyleInfo copy(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        return new StyleInfo(z, z2, z3, z4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleInfo)) {
            return false;
        }
        StyleInfo styleInfo = (StyleInfo) obj;
        return this.disableLabel == styleInfo.disableLabel && this.showIcon == styleInfo.showIcon && this.isBiggerStyle == styleInfo.isBiggerStyle && this.isShowThreeLines == styleInfo.isShowThreeLines && this.maxWidth == styleInfo.maxWidth;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.disableLabel) * 31) + C786410Ut5.Z2(this.showIcon)) * 31) + C786410Ut5.Z2(this.isBiggerStyle)) * 31) + C786410Ut5.Z2(this.isShowThreeLines)) * 31) + this.maxWidth;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StyleInfo(disableLabel=");
        sbLIZ.append(this.disableLabel);
        sbLIZ.append(", showIcon=");
        sbLIZ.append(this.showIcon);
        sbLIZ.append(", isBiggerStyle=");
        sbLIZ.append(this.isBiggerStyle);
        sbLIZ.append(", isShowThreeLines=");
        sbLIZ.append(this.isShowThreeLines);
        sbLIZ.append(", maxWidth=");
        sbLIZ.append(this.maxWidth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StyleInfo() {
        this(false, true, false, false, 156);
    }

    public final boolean isBiggerStyle() {
        return this.isBiggerStyle;
    }

    public final boolean isShowThreeLines() {
        return this.isShowThreeLines;
    }

    public final void setBiggerStyle(boolean z) {
        this.isBiggerStyle = z;
    }

    public final void setDisableLabel(boolean z) {
        this.disableLabel = z;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setShowIcon(boolean z) {
        this.showIcon = z;
    }

    public final void setShowThreeLines(boolean z) {
        this.isShowThreeLines = z;
    }

    public StyleInfo(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.disableLabel = z;
        this.showIcon = z2;
        this.isBiggerStyle = z3;
        this.isShowThreeLines = z4;
        this.maxWidth = i;
    }
}
