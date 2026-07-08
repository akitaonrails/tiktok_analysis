package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Transform {

    @C09CT("x")
    public final Float x;

    @C09CT("y")
    public final Float y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return Intrinsics.LJFF(this.x, transform.x) && Intrinsics.LJFF(this.y, transform.y);
    }

    public final int hashCode() {
        Float f = this.x;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.y;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Transform(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Transform(Float f, Float f2) {
        this.x = f;
        this.y = f2;
    }
}
