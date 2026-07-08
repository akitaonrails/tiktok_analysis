package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.minute_game.model.MinuteGameGameplay;

/* JADX INFO: loaded from: classes.dex */
public final class MinuteGameUpdateMessage extends AbstractC1136060ffY {

    @C09CT("gameplay")
    public MinuteGameGameplay gameplay;

    @C09CT("timed_prop_data")
    public TimedPropData timedPropData;

    @C09CT("update_type")
    public int updateType;

    public static final class TimedPropData {

        @C09CT("gift_message")
        public GiftMessage giftMessage;
    }

    public MinuteGameUpdateMessage() {
        this.type = C001A.MINUTE_GAME_UPDATE_MESSAGE;
    }
}
