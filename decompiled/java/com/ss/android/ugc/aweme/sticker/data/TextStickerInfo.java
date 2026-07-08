package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TextStickerInfo implements Serializable {

    @C09CT("alignment")
    public int alignment;

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("source_height")
    public float srcHeight;

    @C09CT("text_language")
    public String srcLanguage;

    @C09CT("source_width")
    public float srcWidth;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_size")
    public int textSize;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerInfo)) {
            return false;
        }
        TextStickerInfo textStickerInfo = (TextStickerInfo) obj;
        return Intrinsics.LJFF(this.bgColor, textStickerInfo.bgColor) && Intrinsics.LJFF(this.textColor, textStickerInfo.textColor) && Intrinsics.LJFF(this.srcLanguage, textStickerInfo.srcLanguage) && Float.compare(this.srcWidth, textStickerInfo.srcWidth) == 0 && Float.compare(this.srcHeight, textStickerInfo.srcHeight) == 0 && this.textSize == textStickerInfo.textSize && this.alignment == textStickerInfo.alignment;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStickerInfo(bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", srcLanguage=");
        sbLIZ.append(this.srcLanguage);
        sbLIZ.append(", srcWidth=");
        sbLIZ.append(this.srcWidth);
        sbLIZ.append(", srcHeight=");
        sbLIZ.append(this.srcHeight);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.textSize);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.alignment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextStickerInfo() {
        this("#00000000", "#00FFFFFF", "", 0.0f, 0.0f, 28, 0);
    }

    public TextStickerInfo(String str, String str2, String str3, float f, float f2, int i, int i2) {
        this.bgColor = str;
        this.textColor = str2;
        this.srcLanguage = str3;
        this.srcWidth = f;
        this.srcHeight = f2;
        this.textSize = i;
        this.alignment = i2;
    }
}
