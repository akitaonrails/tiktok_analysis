package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CutVideoMultiBottomState implements C004I {
    public static final int $stable = 0;
    public final Boolean visible;

    public CutVideoMultiBottomState() {
        this(null);
    }

    public final CutVideoMultiBottomState copy(Boolean bool) {
        return new CutVideoMultiBottomState(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CutVideoMultiBottomState) && Intrinsics.LJFF(this.visible, ((CutVideoMultiBottomState) obj).visible);
    }

    public int hashCode() {
        Boolean bool = this.visible;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoMultiBottomState(visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoMultiBottomState(Boolean bool) {
        this.visible = bool;
    }
}
