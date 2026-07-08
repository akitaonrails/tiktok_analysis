package com.ss.android.ugc.aweme.services.draft.model;

/* JADX INFO: loaded from: classes9.dex */
public class MigrateDraftCommonResult {
    public final String creationId;
    public final int errorCode;
    public final String errorMsg;

    public String getCreationId() {
        return this.creationId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public MigrateDraftCommonResult(String str, int i, String str2) {
        this.creationId = str;
        this.errorCode = i;
        this.errorMsg = str2;
    }
}
