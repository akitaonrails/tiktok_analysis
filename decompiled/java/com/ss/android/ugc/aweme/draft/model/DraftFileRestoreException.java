package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileRestoreException {
    public final int errorCode;
    public final String resourceType;
    public final Throwable throwable;

    public DraftFileRestoreException() {
        this(0, null, "Unknown");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileRestoreException(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.throwable);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(this.resourceType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.errorCode == 0;
    }

    public DraftFileRestoreException(int i, Throwable th, String str) {
        this.errorCode = i;
        this.throwable = th;
        this.resourceType = str;
    }
}
