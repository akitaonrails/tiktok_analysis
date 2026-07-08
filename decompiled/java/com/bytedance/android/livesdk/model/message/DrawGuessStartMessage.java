package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DrawGuessStartMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public PictionaryInfo data;

    public DrawGuessStartMessage() {
        this.type = C001A.DRAW_GUESS_START_MESSAGE;
        this.data = new PictionaryInfo();
    }
}
