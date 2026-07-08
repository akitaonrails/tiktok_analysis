package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubTimerSticker;

/* JADX INFO: loaded from: classes.dex */
public final class SubTimerStickerMessage extends AbstractC1136060ffY {

    @C09CT("sticker")
    public SubTimerSticker sticker;

    public SubTimerStickerMessage() {
        this.type = C001A.SUB_TIMER_STICKER_MESSAGE;
    }
}
