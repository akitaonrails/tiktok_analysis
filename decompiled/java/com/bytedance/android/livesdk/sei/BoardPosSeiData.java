package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BoardPosSeiData {

    @C09CT("x")
    public final float x;

    @C09CT("y")
    public final float y;

    public BoardPosSeiData() {
        this(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardPosSeiData)) {
            return false;
        }
        BoardPosSeiData boardPosSeiData = (BoardPosSeiData) obj;
        return Float.compare(this.x, boardPosSeiData.x) == 0 && Float.compare(this.y, boardPosSeiData.y) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardPosSeiData(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
    }

    public BoardPosSeiData(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
