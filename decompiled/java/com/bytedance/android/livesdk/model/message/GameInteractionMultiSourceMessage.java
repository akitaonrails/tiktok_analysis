package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameInteractionMultiSourceMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public GameInteractionMultiSourceMessageContent content;

    @C09CT("message_type")
    public int messageType;

    public GameInteractionMultiSourceMessage() {
        this.type = C001A.GAME_INTERACTION_MULTI_SOURCE_MESSAGE;
    }
}
