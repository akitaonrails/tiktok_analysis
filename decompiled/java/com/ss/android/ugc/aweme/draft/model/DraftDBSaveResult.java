package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftDBSaveResult {
    public final transient long dbSaveDuration;
    public final DraftDBSaveException saveException;

    public DraftDBSaveResult() {
        this(0L, new DraftDBSaveException(0, null));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDBSaveResult(dbSaveDuration=");
        sbLIZ.append(this.dbSaveDuration);
        sbLIZ.append(", saveException=");
        sbLIZ.append(this.saveException);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public DraftDBSaveResult(long j, DraftDBSaveException draftDBSaveException) {
        this.dbSaveDuration = j;
        this.saveException = draftDBSaveException;
    }
}
