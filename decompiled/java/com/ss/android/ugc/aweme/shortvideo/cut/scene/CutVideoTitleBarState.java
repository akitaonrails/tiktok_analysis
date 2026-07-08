package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoTitleBarState implements C004I {
    public static final int $stable = 0;
    public final Boolean backEnable;
    public final Boolean backVisible;
    public final Boolean isV2VEffect;
    public final Boolean nextEnable;
    public final Boolean nextVisible;
    public final Integer topBarSpacing;

    public CutVideoTitleBarState() {
        this(null, null, null, null, null, null);
    }

    public final CutVideoTitleBarState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        return new CutVideoTitleBarState(bool, bool2, bool3, bool4, num, bool5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoTitleBarState)) {
            return false;
        }
        CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
        return Intrinsics.LJFF(this.backVisible, cutVideoTitleBarState.backVisible) && Intrinsics.LJFF(this.nextVisible, cutVideoTitleBarState.nextVisible) && Intrinsics.LJFF(this.backEnable, cutVideoTitleBarState.backEnable) && Intrinsics.LJFF(this.nextEnable, cutVideoTitleBarState.nextEnable) && Intrinsics.LJFF(this.topBarSpacing, cutVideoTitleBarState.topBarSpacing) && Intrinsics.LJFF(this.isV2VEffect, cutVideoTitleBarState.isV2VEffect);
    }

    public int hashCode() {
        Boolean bool = this.backVisible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.nextVisible;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.backEnable;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.nextEnable;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.topBarSpacing;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool5 = this.isV2VEffect;
        return iHashCode5 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutVideoTitleBarState(backVisible=");
        sbLIZ.append(this.backVisible);
        sbLIZ.append(", nextVisible=");
        sbLIZ.append(this.nextVisible);
        sbLIZ.append(", backEnable=");
        sbLIZ.append(this.backEnable);
        sbLIZ.append(", nextEnable=");
        sbLIZ.append(this.nextEnable);
        sbLIZ.append(", topBarSpacing=");
        sbLIZ.append(this.topBarSpacing);
        sbLIZ.append(", isV2VEffect=");
        sbLIZ.append(this.isV2VEffect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getBackEnable() {
        return this.backEnable;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Boolean getNextEnable() {
        return this.nextEnable;
    }

    public final Boolean getNextVisible() {
        return this.nextVisible;
    }

    public final Integer getTopBarSpacing() {
        return this.topBarSpacing;
    }

    public final Boolean isV2VEffect() {
        return this.isV2VEffect;
    }

    public CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        this.backVisible = bool;
        this.nextVisible = bool2;
        this.backEnable = bool3;
        this.nextEnable = bool4;
        this.topBarSpacing = num;
        this.isV2VEffect = bool5;
    }
}
