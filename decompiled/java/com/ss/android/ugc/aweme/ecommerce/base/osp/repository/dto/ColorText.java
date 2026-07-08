package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorText {

    @C09CT("background_color")
    public Integer backgroundColor;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public Integer textColor;

    @C09CT("text_font")
    public Integer textFont;

    public ColorText() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorText)) {
            return false;
        }
        ColorText colorText = (ColorText) obj;
        return Intrinsics.LJFF(this.text, colorText.text) && Intrinsics.LJFF(this.textColor, colorText.textColor) && Intrinsics.LJFF(this.textFont, colorText.textFont) && Intrinsics.LJFF(this.backgroundColor, colorText.backgroundColor);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.textColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textFont;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.backgroundColor;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorText(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textFont=");
        sbLIZ.append(this.textFont);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ColorText(String str, Integer num, Integer num2, Integer num3) {
        this.text = str;
        this.textColor = num;
        this.textFont = num2;
        this.backgroundColor = num3;
    }
}
