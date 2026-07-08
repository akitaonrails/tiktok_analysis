package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class DraftFileSaveException {
    public final int errorCode;
    public final Throwable throwable;

    public DraftFileSaveException() {
        this(0, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileSaveException(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.throwable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.errorCode == 0;
    }

    public DraftFileSaveException(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }
}
