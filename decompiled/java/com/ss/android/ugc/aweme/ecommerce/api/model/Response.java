package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C978503s7;

/* JADX INFO: loaded from: classes2.dex */
public class Response<T> {
    public static final C978503s7 Companion = new Object() { // from class: X.03s7
    };

    @C09CT("chunk_index")
    public final Integer chunkIndex;

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final T data;

    @C09CT("log_id")
    public String logId;

    @C09CT("message")
    public final String message;

    public Response() {
        this(-1, null, null, null, null);
    }

    public final boolean isAlreadyPaid() {
        return this.code == 10007302;
    }

    public final boolean isClaimOverdue() {
        return this.code == 23005101;
    }

    public final boolean isCodeOK() {
        return this.code == 0;
    }

    public final Integer getChunkIndex() {
        return this.chunkIndex;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public Response(int i, String str, T t, Integer num, String str2) {
        this.code = i;
        this.message = str;
        this.data = t;
        this.chunkIndex = num;
        this.logId = str2;
    }
}
