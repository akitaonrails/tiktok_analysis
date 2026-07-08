package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessWidgets;

/* JADX INFO: loaded from: classes.dex */
public final class GameGuessWidgetsMessage extends AbstractC1136060ffY {

    @C09CT("guess_widgets")
    public GuessWidgets guessWidgets;

    public GameGuessWidgetsMessage() {
        this.type = C001A.GAME_GUESS_WIDGETS_MESSAGE;
    }
}
