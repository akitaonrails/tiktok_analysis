package com.ss.android.ugc.aweme.draft.model;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileDeleteException {
    public final int errorCode;
    public final Throwable throwable;

    public DraftFileDeleteException() {
        this(0, null);
    }

    public final boolean isSuc() {
        return this.errorCode == 0;
    }

    public DraftFileDeleteException(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }
}
