package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameInteractionMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public GameInteractionMessageContent content;

    @C09CT("message_type")
    public int messageType;

    public GameInteractionMessage() {
        this.type = C001A.GAME_INTERACTION_MESSAGE;
    }
}
