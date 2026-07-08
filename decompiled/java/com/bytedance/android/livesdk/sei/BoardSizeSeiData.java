package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BoardSizeSeiData {

    @C09CT("h")
    public final float h;

    @C09CT("w")
    public final float w;

    public BoardSizeSeiData() {
        this(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardSizeSeiData)) {
            return false;
        }
        BoardSizeSeiData boardSizeSeiData = (BoardSizeSeiData) obj;
        return Float.compare(this.w, boardSizeSeiData.w) == 0 && Float.compare(this.h, boardSizeSeiData.h) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardSizeSeiData(w=");
        sbLIZ.append(this.w);
        sbLIZ.append(", h=");
        sbLIZ.append(this.h);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.w) * 31) + Float.floatToIntBits(this.h);
    }

    public BoardSizeSeiData(float f, float f2) {
        this.w = f;
        this.h = f2;
    }
}
