package com.ss.android.ugc.aweme.draft.model;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftDBDeleteResult {
    public final transient long dbDeleteDuration;
    public final DraftDBDeleteException deleteException;

    public DraftDBDeleteResult() {
        this(0L, new DraftDBDeleteException(0, null));
    }

    public final boolean isSuc() {
        return this.deleteException.isSuc();
    }

    public DraftDBDeleteResult(long j, DraftDBDeleteException draftDBDeleteException) {
        this.dbDeleteDuration = j;
        this.deleteException = draftDBDeleteException;
    }
}
