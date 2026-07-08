package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import X.C529130Kp5;
import X.C529150Kp7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoListState implements C004I {
    public static final int $stable = 8;
    public final Boolean cancelEnable;
    public final C529150Kp7 deleteSegEvent;
    public final Boolean saveEnable;
    public final C529130Kp5 updateSpeedCheckEvent;

    public CutVideoListState() {
        this(null, null, null, null);
    }

    public final CutVideoListState copy(C529150Kp7 c529150Kp7, C529130Kp5 c529130Kp5, Boolean bool, Boolean bool2) {
        return new CutVideoListState(c529150Kp7, c529130Kp5, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoListState)) {
            return false;
        }
        CutVideoListState cutVideoListState = (CutVideoListState) obj;
        return Intrinsics.LJFF(this.deleteSegEvent, cutVideoListState.deleteSegEvent) && Intrinsics.LJFF(this.updateSpeedCheckEvent, cutVideoListState.updateSpeedCheckEvent) && Intrinsics.LJFF(this.saveEnable, cutVideoListState.saveEnable) && Intrinsics.LJFF(this.cancelEnable, cutVideoListState.cancelEnable);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.deleteSegEvent;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        C529130Kp5 c529130Kp5 = this.updateSpeedCheckEvent;
        int iHashCode2 = (iHashCode + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31;
        Boolean bool = this.saveEnable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cancelEnable;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoListState(deleteSegEvent=");
        sbLIZ.append(this.deleteSegEvent);
        sbLIZ.append(", updateSpeedCheckEvent=");
        sbLIZ.append(this.updateSpeedCheckEvent);
        sbLIZ.append(", saveEnable=");
        sbLIZ.append(this.saveEnable);
        sbLIZ.append(", cancelEnable=");
        sbLIZ.append(this.cancelEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getCancelEnable() {
        return this.cancelEnable;
    }

    public final C529150Kp7 getDeleteSegEvent() {
        return this.deleteSegEvent;
    }

    public final Boolean getSaveEnable() {
        return this.saveEnable;
    }

    public final C529130Kp5 getUpdateSpeedCheckEvent() {
        return this.updateSpeedCheckEvent;
    }

    public CutVideoListState(C529150Kp7 c529150Kp7, C529130Kp5 c529130Kp5, Boolean bool, Boolean bool2) {
        this.deleteSegEvent = c529150Kp7;
        this.updateSpeedCheckEvent = c529130Kp5;
        this.saveEnable = bool;
        this.cancelEnable = bool2;
    }
}
