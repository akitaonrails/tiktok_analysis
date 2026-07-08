package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FaceClientFeature {

    @C09CT("has_face")
    public final Boolean hasFace;

    public FaceClientFeature() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaceClientFeature) && Intrinsics.LJFF(this.hasFace, ((FaceClientFeature) obj).hasFace);
    }

    public final int hashCode() {
        Boolean bool = this.hasFace;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceClientFeature(hasFace=");
        sbLIZ.append(this.hasFace);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FaceClientFeature(Boolean bool) {
        this.hasFace = bool;
    }
}
