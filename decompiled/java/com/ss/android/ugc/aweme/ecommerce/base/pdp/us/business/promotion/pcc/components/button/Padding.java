package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return this.left == padding.left && this.top == padding.top && this.right == padding.right && this.bottom == padding.bottom;
    }

    public final int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Padding(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }
}
