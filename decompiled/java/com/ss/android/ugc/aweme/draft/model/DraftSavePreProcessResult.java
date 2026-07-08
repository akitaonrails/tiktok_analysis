package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSavePreProcessResult {
    public final DraftSavePreProcessException preProcessException;
    public final int preProcessType;

    public DraftSavePreProcessResult() {
        this(0, new DraftSavePreProcessException(0, null));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSavePreProcessResult(preProcessType=");
        sbLIZ.append(this.preProcessType);
        sbLIZ.append(", preProcessException=");
        sbLIZ.append(this.preProcessException);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.preProcessException.isSuc();
    }

    public DraftSavePreProcessResult(int i, DraftSavePreProcessException draftSavePreProcessException) {
        this.preProcessType = i;
        this.preProcessException = draftSavePreProcessException;
    }
}
