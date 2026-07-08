package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import X.C529150Kp7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoState implements C004I {
    public static final int $stable = 8;
    public final C529150Kp7 nextEvent;
    public final C529150Kp7 quitEvent;

    public CutVideoState() {
        this(null, null);
    }

    public final CutVideoState copy(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72) {
        return new CutVideoState(c529150Kp7, c529150Kp72);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoState)) {
            return false;
        }
        CutVideoState cutVideoState = (CutVideoState) obj;
        return Intrinsics.LJFF(this.quitEvent, cutVideoState.quitEvent) && Intrinsics.LJFF(this.nextEvent, cutVideoState.nextEvent);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.quitEvent;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        C529150Kp7 c529150Kp72 = this.nextEvent;
        return iHashCode + (c529150Kp72 != null ? c529150Kp72.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoState(quitEvent=");
        sbLIZ.append(this.quitEvent);
        sbLIZ.append(", nextEvent=");
        sbLIZ.append(this.nextEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getNextEvent() {
        return this.nextEvent;
    }

    public final C529150Kp7 getQuitEvent() {
        return this.quitEvent;
    }

    public CutVideoState(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72) {
        this.quitEvent = c529150Kp7;
        this.nextEvent = c529150Kp72;
    }
}
