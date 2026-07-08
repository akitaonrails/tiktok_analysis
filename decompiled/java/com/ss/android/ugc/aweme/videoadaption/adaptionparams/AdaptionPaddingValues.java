package com.ss.android.ugc.aweme.videoadaption.adaptionparams;

import X.C0RAA;
import X.C2188811AlT;
import X.InterfaceC1604490rr5;

/* JADX INFO: loaded from: classes32.dex */
public final class AdaptionPaddingValues implements C0RAA, InterfaceC1604490rr5 {
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    public final AdaptionPaddingValues copy(int i, int i2, int i3, int i4) {
        return new AdaptionPaddingValues(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptionPaddingValues)) {
            return false;
        }
        AdaptionPaddingValues adaptionPaddingValues = (AdaptionPaddingValues) obj;
        return this.left == adaptionPaddingValues.left && this.top == adaptionPaddingValues.top && this.right == adaptionPaddingValues.right && this.bottom == adaptionPaddingValues.bottom;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdaptionPaddingValues(left=");
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

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public AdaptionPaddingValues(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }
}
