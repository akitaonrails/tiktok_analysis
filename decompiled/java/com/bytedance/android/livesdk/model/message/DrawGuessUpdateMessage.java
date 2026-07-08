package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DrawGuessUpdateMessage extends AbstractC1136060ffY {

    @C09CT("correct_cnt")
    public long correctCount;

    @C09CT("pictionary_id")
    public long roundId;

    public DrawGuessUpdateMessage() {
        this.type = C001A.DRAW_GUESS_UPDATE_MESSAGE;
    }
}
