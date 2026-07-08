package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class Padding {

    @C09CT("bottom")
    public final int bottom;

    @C09CT("left")
    public final int left;

    @C09CT("right")
    public final int right;

    @C09CT("top")
    public final int top;

    public Padding() {
        this(0, 0, 0, 0);
    }

    public final int hashCode() {
        return (((((this.top * 31) + this.bottom) * 31) + this.left) * 31) + this.right;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Padding(int i, int i2, int i3, int i4) {
        this.top = i;
        this.bottom = i2;
        this.left = i3;
        this.right = i4;
    }
}
