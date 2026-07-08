package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DrawGuessExitMessage extends AbstractC1136060ffY {

    @C09CT("pictionary_type")
    public int pictionaryType;

    @C09CT("session_id")
    public long sessionId;

    @C09CT("show_statistics")
    public boolean showStats;

    public DrawGuessExitMessage() {
        this.type = C001A.DRAW_GUESS_EXIT_MESSAGE;
    }
}
