package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoBottomBarState implements C004I {
    public static final int $stable = 0;
    public final Boolean deleteEnable;
    public final Boolean deleteVisible;
    public final Boolean rotateEnable;
    public final Boolean rotateVisible;
    public final Float selectTime;
    public final Boolean speedChecked;
    public final Boolean speedEnable;
    public final Boolean speedVisible;

    public CutVideoBottomBarState() {
        this(null, null, null, null, null, null, null, null);
    }

    public final CutVideoBottomBarState copy(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        return new CutVideoBottomBarState(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoBottomBarState)) {
            return false;
        }
        CutVideoBottomBarState cutVideoBottomBarState = (CutVideoBottomBarState) obj;
        return Intrinsics.LJFF(this.selectTime, cutVideoBottomBarState.selectTime) && Intrinsics.LJFF(this.speedVisible, cutVideoBottomBarState.speedVisible) && Intrinsics.LJFF(this.speedChecked, cutVideoBottomBarState.speedChecked) && Intrinsics.LJFF(this.rotateVisible, cutVideoBottomBarState.rotateVisible) && Intrinsics.LJFF(this.deleteVisible, cutVideoBottomBarState.deleteVisible) && Intrinsics.LJFF(this.rotateEnable, cutVideoBottomBarState.rotateEnable) && Intrinsics.LJFF(this.speedEnable, cutVideoBottomBarState.speedEnable) && Intrinsics.LJFF(this.deleteEnable, cutVideoBottomBarState.deleteEnable);
    }

    public int hashCode() {
        Float f = this.selectTime;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.speedVisible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.speedChecked;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.rotateVisible;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.deleteVisible;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.rotateEnable;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.speedEnable;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.deleteEnable;
        return iHashCode7 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoBottomBarState(selectTime=");
        sbLIZ.append(this.selectTime);
        sbLIZ.append(", speedVisible=");
        sbLIZ.append(this.speedVisible);
        sbLIZ.append(", speedChecked=");
        sbLIZ.append(this.speedChecked);
        sbLIZ.append(", rotateVisible=");
        sbLIZ.append(this.rotateVisible);
        sbLIZ.append(", deleteVisible=");
        sbLIZ.append(this.deleteVisible);
        sbLIZ.append(", rotateEnable=");
        sbLIZ.append(this.rotateEnable);
        sbLIZ.append(", speedEnable=");
        sbLIZ.append(this.speedEnable);
        sbLIZ.append(", deleteEnable=");
        sbLIZ.append(this.deleteEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public final Boolean getDeleteVisible() {
        return this.deleteVisible;
    }

    public final Boolean getRotateEnable() {
        return this.rotateEnable;
    }

    public final Boolean getRotateVisible() {
        return this.rotateVisible;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final Boolean getSpeedChecked() {
        return this.speedChecked;
    }

    public final Boolean getSpeedEnable() {
        return this.speedEnable;
    }

    public final Boolean getSpeedVisible() {
        return this.speedVisible;
    }

    public CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.selectTime = f;
        this.speedVisible = bool;
        this.speedChecked = bool2;
        this.rotateVisible = bool3;
        this.deleteVisible = bool4;
        this.rotateEnable = bool5;
        this.speedEnable = bool6;
        this.deleteEnable = bool7;
    }
}
