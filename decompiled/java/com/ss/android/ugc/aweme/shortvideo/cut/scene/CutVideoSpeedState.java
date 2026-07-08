package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoSpeedState implements C004I {
    public static final int $stable = 0;
    public final Boolean enable;
    public final Boolean visible;

    public CutVideoSpeedState() {
        this(null, null);
    }

    public final CutVideoSpeedState copy(Boolean bool, Boolean bool2) {
        return new CutVideoSpeedState(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoSpeedState)) {
            return false;
        }
        CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
        return Intrinsics.LJFF(this.enable, cutVideoSpeedState.enable) && Intrinsics.LJFF(this.visible, cutVideoSpeedState.visible);
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.visible;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoSpeedState(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoSpeedState(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.visible = bool2;
    }
}
