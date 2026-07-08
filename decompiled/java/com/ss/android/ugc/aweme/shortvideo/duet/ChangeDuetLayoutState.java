package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C004I;
import X.C0LCS;
import X.C2188811AlT;
import X.C529150Kp7;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class ChangeDuetLayoutState implements C004I {
    public static final int $stable = 8;
    public final C0LCS<Effect> effect;
    public final C529150Kp7 exitDuetMode;
    public final C0LCS<Integer> layoutDirection;

    public ChangeDuetLayoutState() {
        this(null, null, null);
    }

    public final ChangeDuetLayoutState copy(C0LCS<? extends Effect> c0lcs, C0LCS<Integer> c0lcs2, C529150Kp7 c529150Kp7) {
        return new ChangeDuetLayoutState(c0lcs, c0lcs2, c529150Kp7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDuetLayoutState)) {
            return false;
        }
        ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
        return Intrinsics.LJFF(this.effect, changeDuetLayoutState.effect) && Intrinsics.LJFF(this.layoutDirection, changeDuetLayoutState.layoutDirection) && Intrinsics.LJFF(this.exitDuetMode, changeDuetLayoutState.exitDuetMode);
    }

    public int hashCode() {
        C0LCS<Effect> c0lcs = this.effect;
        int iHashCode = (c0lcs == null ? 0 : c0lcs.hashCode()) * 31;
        C0LCS<Integer> c0lcs2 = this.layoutDirection;
        int iHashCode2 = (iHashCode + (c0lcs2 == null ? 0 : c0lcs2.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.exitDuetMode;
        return iHashCode2 + (c529150Kp7 != null ? c529150Kp7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeDuetLayoutState(effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", layoutDirection=");
        sbLIZ.append(this.layoutDirection);
        sbLIZ.append(", exitDuetMode=");
        sbLIZ.append(this.exitDuetMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0LCS<Effect> getEffect() {
        return this.effect;
    }

    public final C529150Kp7 getExitDuetMode() {
        return this.exitDuetMode;
    }

    public final C0LCS<Integer> getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeDuetLayoutState(C0LCS<? extends Effect> c0lcs, C0LCS<Integer> c0lcs2, C529150Kp7 c529150Kp7) {
        this.effect = c0lcs;
        this.layoutDirection = c0lcs2;
        this.exitDuetMode = c529150Kp7;
    }
}
