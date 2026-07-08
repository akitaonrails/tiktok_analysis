package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;

/* JADX INFO: loaded from: classes.dex */
public final class SubPinEventMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("card")
    public SubPinCard card;

    @C09CT("operator_user_id")
    public long operatorUserId;

    public SubPinEventMessage() {
        this.type = C001A.SUB_PIN_EVENT_MESSAGE;
    }
}
