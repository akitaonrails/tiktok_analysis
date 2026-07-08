package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DrawGuessEndMessage extends AbstractC1136060ffY {

    @C09CT("end_type")
    public int endType;

    @C09CT("pictionary_type")
    public int pictionaryType;

    @C09CT("pictionary_id")
    public long roundId;

    @C09CT("word")
    public String word;

    public DrawGuessEndMessage() {
        this.type = C001A.DRAW_GUESS_END_MESSAGE;
        this.word = "";
    }
}
