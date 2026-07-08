package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LabelPosition implements Serializable {
    public static final int $stable = 8;

    @C09CT("bottom")
    public int bottom;

    @C09CT("left")
    public int left;

    public LabelPosition() {
        this(0, 50);
    }

    public final LabelPosition copy(int i, int i2) {
        return new LabelPosition(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelPosition)) {
            return false;
        }
        LabelPosition labelPosition = (LabelPosition) obj;
        return this.bottom == labelPosition.bottom && this.left == labelPosition.left;
    }

    public int hashCode() {
        return (this.bottom * 31) + this.left;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelPosition(bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBottom(int i) {
        this.bottom = i;
    }

    public final void setLeft(int i) {
        this.left = i;
    }

    public LabelPosition(int i, int i2) {
        this.bottom = i;
        this.left = i2;
    }
}
