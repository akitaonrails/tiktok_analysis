package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class MinuteGameRespondInviteParams {

    @C09CT("gameplay_id")
    public long gameplayId;

    @C09CT("reject_reason")
    public int rejectReason;

    @C09CT("response")
    public int response;

    @C09CT("room_id")
    public long roomId;

    @C09CT("trigger_gift_record")
    public GiftRecord triggerGiftRecord;

    public static final class GiftRecord {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("msg_id")
        public long msgId;

        @C09CT("sender_id")
        public long senderId;
    }
}
