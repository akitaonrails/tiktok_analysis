package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes29.dex */
public final class Coordinate {

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.x);
        sbLIZ.append(", ");
        sbLIZ.append(this.y);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public Coordinate(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
