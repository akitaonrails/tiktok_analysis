package com.ss.android.ugc.aweme.tools.mvtemplate;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecordMVState implements C004I {
    public static final int $stable = 0;
    public final Boolean relayout;
    public final Boolean topMargin;

    public RecordMVState() {
        this(null, null);
    }

    public final RecordMVState copy(Boolean bool, Boolean bool2) {
        return new RecordMVState(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordMVState)) {
            return false;
        }
        RecordMVState recordMVState = (RecordMVState) obj;
        return Intrinsics.LJFF(this.relayout, recordMVState.relayout) && Intrinsics.LJFF(this.topMargin, recordMVState.topMargin);
    }

    public int hashCode() {
        Boolean bool = this.relayout;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.topMargin;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordMVState(relayout=");
        sbLIZ.append(this.relayout);
        sbLIZ.append(", topMargin=");
        sbLIZ.append(this.topMargin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getRelayout() {
        return this.relayout;
    }

    public final Boolean getTopMargin() {
        return this.topMargin;
    }

    public RecordMVState(Boolean bool, Boolean bool2) {
        this.relayout = bool;
        this.topMargin = bool2;
    }
}
