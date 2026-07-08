package com.ss.android.ugc.aweme.draft.model;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileDeleteResult {
    public final DraftFileDeleteException deleteException;
    public final long deleteFileDuration;

    public DraftFileDeleteResult() {
        this(0L, new DraftFileDeleteException(0, null));
    }

    public final boolean isSuc() {
        return this.deleteException.isSuc();
    }

    public DraftFileDeleteResult(long j, DraftFileDeleteException draftFileDeleteException) {
        this.deleteFileDuration = j;
        this.deleteException = draftFileDeleteException;
    }
}
