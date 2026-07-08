package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessWord {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("word")
    public final String word;

    public DrawGuessWord() {
        this(0L, "");
    }

    public DrawGuessWord(long j, String str) {
        this.id = j;
        this.word = str;
    }
}
