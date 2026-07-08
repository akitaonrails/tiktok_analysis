package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class DraftFileRestoreResult {
    public final boolean blockCreative;
    public final int fileType;
    public final int priority;
    public final DraftFileRestoreException restoreException;
    public final Integer toastStringRes;

    public DraftFileRestoreResult() {
        this(0, 0, null, false, new DraftFileRestoreException(0, null, "Unknown"));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileRestoreResult(fileType=");
        sbLIZ.append(this.fileType);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", toastStringRes=");
        sbLIZ.append(this.toastStringRes);
        sbLIZ.append(", blockCreative=");
        sbLIZ.append(this.blockCreative);
        sbLIZ.append(", restoreException=");
        sbLIZ.append(this.restoreException);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.restoreException.isSuc();
    }

    public DraftFileRestoreResult(int i, int i2, Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        this.fileType = i;
        this.priority = i2;
        this.toastStringRes = num;
        this.blockCreative = z;
        this.restoreException = draftFileRestoreException;
    }
}
