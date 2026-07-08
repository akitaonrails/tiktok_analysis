package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemLineModeStyle {

    @C09CT("line_color")
    public String lineColor;

    public FixedItemLineModeStyle() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedItemLineModeStyle) && Intrinsics.LJFF(this.lineColor, ((FixedItemLineModeStyle) obj).lineColor);
    }

    public final int hashCode() {
        String str = this.lineColor;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemLineModeStyle(lineColor=");
        sbLIZ.append(this.lineColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemLineModeStyle(String str) {
        this.lineColor = str;
    }
}
