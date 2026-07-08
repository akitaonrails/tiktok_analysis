package com.ss.android.ugc.aweme.badge;

import X.C004I;
import X.C20579215fq;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EditProfileBadgeState implements C004I {
    public static final int $stable = 8;
    public final C20579215fq result;

    public EditProfileBadgeState() {
        this(null);
    }

    public final EditProfileBadgeState copy(C20579215fq c20579215fq) {
        return new EditProfileBadgeState(c20579215fq);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditProfileBadgeState) && Intrinsics.LJFF(this.result, ((EditProfileBadgeState) obj).result);
    }

    public int hashCode() {
        C20579215fq c20579215fq = this.result;
        if (c20579215fq == null) {
            return 0;
        }
        return c20579215fq.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileBadgeState(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C20579215fq getResult() {
        return this.result;
    }

    public EditProfileBadgeState(C20579215fq c20579215fq) {
        this.result = c20579215fq;
    }
}
