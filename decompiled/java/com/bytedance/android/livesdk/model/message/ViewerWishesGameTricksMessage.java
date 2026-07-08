package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerWishesGameTricksMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public GameTricksMessageContent content;

    @C09CT("message_type")
    public int messageType;

    public ViewerWishesGameTricksMessage() {
        this.type = C001A.VIEWER_WISHES_GAME_TRICKS_MESSAGE;
    }
}
