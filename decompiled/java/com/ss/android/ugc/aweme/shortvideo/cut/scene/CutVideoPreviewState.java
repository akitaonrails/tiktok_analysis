package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C1644450stX;
import X.C2188811AlT;
import X.C529140Kp6;
import X.C529150Kp7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoPreviewState implements C004I {
    public static final int $stable = 8;
    public final C1644450stX<Integer, Integer> resetSurfaceSizeEvent;
    public final C529150Kp7 restartProgress;
    public final Boolean surfaceEnable;
    public final C529140Kp6 updateBottomMarginEvent;
    public final C529140Kp6 updateTopMarginEvent;
    public final C529150Kp7 updateVEDisplayEvent;

    public CutVideoPreviewState() {
        this(null, null, null, null, null, null);
    }

    public final CutVideoPreviewState copy(C529150Kp7 c529150Kp7, Boolean bool, C1644450stX<Integer, Integer> c1644450stX, C529140Kp6 c529140Kp6, C529150Kp7 c529150Kp72, C529140Kp6 c529140Kp62) {
        return new CutVideoPreviewState(c529150Kp7, bool, c1644450stX, c529140Kp6, c529150Kp72, c529140Kp62);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoPreviewState)) {
            return false;
        }
        CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
        return Intrinsics.LJFF(this.restartProgress, cutVideoPreviewState.restartProgress) && Intrinsics.LJFF(this.surfaceEnable, cutVideoPreviewState.surfaceEnable) && Intrinsics.LJFF(this.resetSurfaceSizeEvent, cutVideoPreviewState.resetSurfaceSizeEvent) && Intrinsics.LJFF(this.updateBottomMarginEvent, cutVideoPreviewState.updateBottomMarginEvent) && Intrinsics.LJFF(this.updateVEDisplayEvent, cutVideoPreviewState.updateVEDisplayEvent) && Intrinsics.LJFF(this.updateTopMarginEvent, cutVideoPreviewState.updateTopMarginEvent);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.restartProgress;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        Boolean bool = this.surfaceEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX = this.resetSurfaceSizeEvent;
        int iHashCode3 = (iHashCode2 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C529140Kp6 c529140Kp6 = this.updateBottomMarginEvent;
        int iHashCode4 = (iHashCode3 + (c529140Kp6 == null ? 0 : c529140Kp6.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.updateVEDisplayEvent;
        int iHashCode5 = (iHashCode4 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529140Kp6 c529140Kp62 = this.updateTopMarginEvent;
        return iHashCode5 + (c529140Kp62 != null ? c529140Kp62.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoPreviewState(restartProgress=");
        sbLIZ.append(this.restartProgress);
        sbLIZ.append(", surfaceEnable=");
        sbLIZ.append(this.surfaceEnable);
        sbLIZ.append(", resetSurfaceSizeEvent=");
        sbLIZ.append(this.resetSurfaceSizeEvent);
        sbLIZ.append(", updateBottomMarginEvent=");
        sbLIZ.append(this.updateBottomMarginEvent);
        sbLIZ.append(", updateVEDisplayEvent=");
        sbLIZ.append(this.updateVEDisplayEvent);
        sbLIZ.append(", updateTopMarginEvent=");
        sbLIZ.append(this.updateTopMarginEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1644450stX<Integer, Integer> getResetSurfaceSizeEvent() {
        return this.resetSurfaceSizeEvent;
    }

    public final C529150Kp7 getRestartProgress() {
        return this.restartProgress;
    }

    public final Boolean getSurfaceEnable() {
        return this.surfaceEnable;
    }

    public final C529140Kp6 getUpdateBottomMarginEvent() {
        return this.updateBottomMarginEvent;
    }

    public final C529140Kp6 getUpdateTopMarginEvent() {
        return this.updateTopMarginEvent;
    }

    public final C529150Kp7 getUpdateVEDisplayEvent() {
        return this.updateVEDisplayEvent;
    }

    public CutVideoPreviewState(C529150Kp7 c529150Kp7, Boolean bool, C1644450stX<Integer, Integer> c1644450stX, C529140Kp6 c529140Kp6, C529150Kp7 c529150Kp72, C529140Kp6 c529140Kp62) {
        this.restartProgress = c529150Kp7;
        this.surfaceEnable = bool;
        this.resetSurfaceSizeEvent = c1644450stX;
        this.updateBottomMarginEvent = c529140Kp6;
        this.updateVEDisplayEvent = c529150Kp72;
        this.updateTopMarginEvent = c529140Kp62;
    }
}
