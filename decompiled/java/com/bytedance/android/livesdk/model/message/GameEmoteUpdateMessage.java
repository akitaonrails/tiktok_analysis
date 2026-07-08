package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;

/* JADX INFO: loaded from: classes.dex */
public final class GameEmoteUpdateMessage extends AbstractC1136060ffY {

    @C09CT("game_emotes_tab")
    public GameEmotesTab gameEmotesTab;

    public GameEmoteUpdateMessage() {
        this.type = C001A.GAME_EMOTE_UPDATE_MESSAGE;
    }
}
