package com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel;

import X.C004I;
import X.C1666530tT9;
import X.C1666540tTA;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditUILayerViewState implements C004I {
    public static final int $stable = 0;
    public final C1666540tTA bottomViewState;
    public final C1666530tT9 topViewState;

    public EditUILayerViewState() {
        this(new C1666530tT9(0, 63), new C1666540tTA(false, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 524287));
    }

    public final EditUILayerViewState copy(C1666530tT9 c1666530tT9, C1666540tTA c1666540tTA) {
        return new EditUILayerViewState(c1666530tT9, c1666540tTA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditUILayerViewState)) {
            return false;
        }
        EditUILayerViewState editUILayerViewState = (EditUILayerViewState) obj;
        return Intrinsics.LJFF(this.topViewState, editUILayerViewState.topViewState) && Intrinsics.LJFF(this.bottomViewState, editUILayerViewState.bottomViewState);
    }

    public int hashCode() {
        return (this.topViewState.hashCode() * 31) + this.bottomViewState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditUILayerViewState(topViewState=");
        sbLIZ.append(this.topViewState);
        sbLIZ.append(", bottomViewState=");
        sbLIZ.append(this.bottomViewState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1666540tTA getBottomViewState() {
        return this.bottomViewState;
    }

    public final C1666530tT9 getTopViewState() {
        return this.topViewState;
    }

    public EditUILayerViewState(C1666530tT9 c1666530tT9, C1666540tTA c1666540tTA) {
        this.topViewState = c1666530tT9;
        this.bottomViewState = c1666540tTA;
    }
}
