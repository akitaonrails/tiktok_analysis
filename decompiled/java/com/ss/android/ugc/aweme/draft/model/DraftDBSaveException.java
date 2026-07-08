package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftDBSaveException {
    public final int errorCode;
    public final Throwable throwable;

    public DraftDBSaveException() {
        this(0, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDBSaveException(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.throwable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.errorCode == 0;
    }

    public DraftDBSaveException(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }
}
