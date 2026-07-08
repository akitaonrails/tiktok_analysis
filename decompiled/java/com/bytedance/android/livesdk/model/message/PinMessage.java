package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class PinMessage extends AbstractC1136060ffY {
    public transient RoomMessage LL;

    @C09CT("action")
    public int action;

    @C09CT("chat_message")
    public ChatMessage chatMessage;

    @C09CT("display_duration")
    public long displayDuration;

    @C09CT("ec_streamer_key")
    public String ecStreamerKey;

    @C09CT("gift_message")
    public GiftMessage giftMessage;

    @C09CT("method")
    public String method;

    @C09CT("operator")
    public User operator;

    @C09CT("pin_msg_id")
    public long pinId;

    @C09CT("pin_time")
    public long pinTime;

    @C09CT("social_message")
    public SocialMessage socialMessage;

    public PinMessage() {
        this.type = C001A.PIN_MESSAGE;
        this.action = 1;
        this.ecStreamerKey = "";
    }
}
