package com.bytedance.ies.cutsame.source.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class Point {
    public final float x;
    public final float y;

    public Point() {
        this(0.0f, 0.0f);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Point(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Point(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
