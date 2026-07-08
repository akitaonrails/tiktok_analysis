package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class StartDrawGuessResponse {

    @C09CT("pictionary_id")
    public final long pictionaryId;

    @C09CT("session_id")
    public final long sessionId;

    public StartDrawGuessResponse() {
        this(0L, 0L);
    }

    public StartDrawGuessResponse(long j, long j2) {
        this.pictionaryId = j;
        this.sessionId = j2;
    }
}
