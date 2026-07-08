package com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TextStyle implements Serializable {

    @C09CT("color")
    public final CommonColor color;

    @C09CT("font")
    public final Integer font;

    public TextStyle() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.LJFF(this.color, textStyle.color) && Intrinsics.LJFF(this.font, textStyle.font);
    }

    public int hashCode() {
        CommonColor commonColor = this.color;
        int iHashCode = (commonColor == null ? 0 : commonColor.hashCode()) * 31;
        Integer num = this.font;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStyle(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextStyle(CommonColor commonColor, Integer num) {
        this.color = commonColor;
        this.font = num;
    }
}
