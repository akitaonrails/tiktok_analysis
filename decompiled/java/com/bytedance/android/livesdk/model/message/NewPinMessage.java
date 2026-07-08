package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class NewPinMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("content")
    public String content;

    @C09CT("display_duration")
    public long displayDuration;

    @C09CT("ec_streamer_key")
    public String ecStreamerKey;

    @C09CT("method")
    public String method;

    @C09CT("operator")
    public User operator;

    @C09CT("pin_msg_id")
    public long pinMsgId;

    @C09CT("pin_time")
    public long pinTime;

    @C09CT("user")
    public User user;

    public NewPinMessage() {
        this.type = C001A.NEW_PIN_MESSAGE;
        this.content = "";
        this.method = "";
        this.ecStreamerKey = "";
    }
}
