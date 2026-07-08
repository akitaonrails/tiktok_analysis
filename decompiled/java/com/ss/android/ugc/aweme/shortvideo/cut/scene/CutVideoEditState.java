package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import X.C529150Kp7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoEditState implements C004I {
    public static final int $stable = 8;
    public final Boolean editEnable;
    public final Boolean isEditVideoLength;
    public final C529150Kp7 updatePlayBoundaryEvent;

    public CutVideoEditState() {
        this(null, null, null);
    }

    public final CutVideoEditState copy(C529150Kp7 c529150Kp7, Boolean bool, Boolean bool2) {
        return new CutVideoEditState(c529150Kp7, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoEditState)) {
            return false;
        }
        CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
        return Intrinsics.LJFF(this.updatePlayBoundaryEvent, cutVideoEditState.updatePlayBoundaryEvent) && Intrinsics.LJFF(this.editEnable, cutVideoEditState.editEnable) && Intrinsics.LJFF(this.isEditVideoLength, cutVideoEditState.isEditVideoLength);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.updatePlayBoundaryEvent;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        Boolean bool = this.editEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEditVideoLength;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoEditState(updatePlayBoundaryEvent=");
        sbLIZ.append(this.updatePlayBoundaryEvent);
        sbLIZ.append(", editEnable=");
        sbLIZ.append(this.editEnable);
        sbLIZ.append(", isEditVideoLength=");
        sbLIZ.append(this.isEditVideoLength);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getEditEnable() {
        return this.editEnable;
    }

    public final C529150Kp7 getUpdatePlayBoundaryEvent() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean isEditVideoLength() {
        return this.isEditVideoLength;
    }

    public CutVideoEditState(C529150Kp7 c529150Kp7, Boolean bool, Boolean bool2) {
        this.updatePlayBoundaryEvent = c529150Kp7;
        this.editEnable = bool;
        this.isEditVideoLength = bool2;
    }
}
