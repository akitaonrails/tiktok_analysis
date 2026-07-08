package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.PinCardView;

/* JADX INFO: loaded from: classes.dex */
public final class GameGuessPinCardMessage extends AbstractC1136060ffY {

    @C09CT("view")
    public PinCardView view;

    public GameGuessPinCardMessage() {
        this.type = C001A.GAME_GUESS_PIN_CARD_MESSAGE;
    }
}
