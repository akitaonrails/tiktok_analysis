package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcommerceStickerTitle implements Serializable {

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_font")
    public final Integer textFont;

    public EcommerceStickerTitle() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceStickerTitle)) {
            return false;
        }
        EcommerceStickerTitle ecommerceStickerTitle = (EcommerceStickerTitle) obj;
        return Intrinsics.LJFF(this.text, ecommerceStickerTitle.text) && Intrinsics.LJFF(this.textColor, ecommerceStickerTitle.textColor) && Intrinsics.LJFF(this.textFont, ecommerceStickerTitle.textFont);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.textFont;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcommerceStickerTitle(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textFont=");
        sbLIZ.append(this.textFont);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcommerceStickerTitle(String str, String str2, Integer num) {
        this.text = str;
        this.textColor = str2;
        this.textFont = num;
    }
}
