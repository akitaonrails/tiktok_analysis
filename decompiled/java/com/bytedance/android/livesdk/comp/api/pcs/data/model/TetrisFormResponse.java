package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisFormResponse {

    @C09CT("code")
    public final long code;

    @C09CT("data")
    public final TetrisFormResponseData data;

    @C09CT("message")
    public final String message;

    public TetrisFormResponse() {
        this(-1L, "", null);
    }

    public TetrisFormResponse(long j, String str, TetrisFormResponseData tetrisFormResponseData) {
        this.code = j;
        this.message = str;
        this.data = tetrisFormResponseData;
    }
}
