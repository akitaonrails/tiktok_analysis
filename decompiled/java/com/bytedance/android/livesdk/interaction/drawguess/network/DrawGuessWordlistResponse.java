package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessWordlistResponse {

    @C09CT("duration")
    public final long duration;

    @C09CT("wordlist")
    public final List<DrawGuessWord> wordList;

    public DrawGuessWordlistResponse() {
        this(new ArrayList(), 0L);
    }

    public DrawGuessWordlistResponse(List<DrawGuessWord> list, long j) {
        this.wordList = list;
        this.duration = j;
    }
}
