package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class GuessResponse {

    @C09CT("correct")
    public final boolean correct;

    @C09CT("word")
    public final String word;

    public GuessResponse() {
        this(false, "");
    }

    public GuessResponse(boolean z, String str) {
        this.correct = z;
        this.word = str;
    }
}
