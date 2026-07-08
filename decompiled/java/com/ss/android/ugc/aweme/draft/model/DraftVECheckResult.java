package com.ss.android.ugc.aweme.draft.model;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftVECheckResult {
    public final int errorCode;
    public final String path;

    public DraftVECheckResult() {
        this(0, null);
    }

    public DraftVECheckResult(int i, String str) {
        this.errorCode = i;
        this.path = str;
    }
}
