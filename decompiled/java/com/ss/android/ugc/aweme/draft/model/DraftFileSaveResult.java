package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class DraftFileSaveResult {
    public final DraftFileSaveException saveException;
    public final int saveType;

    public DraftFileSaveResult() {
        this(0, new DraftFileSaveException(0, null));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileSaveResult(saveType=");
        sbLIZ.append(this.saveType);
        sbLIZ.append(", saveException=");
        sbLIZ.append(this.saveException);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public DraftFileSaveResult(int i, DraftFileSaveException draftFileSaveException) {
        this.saveType = i;
        this.saveException = draftFileSaveException;
    }
}
