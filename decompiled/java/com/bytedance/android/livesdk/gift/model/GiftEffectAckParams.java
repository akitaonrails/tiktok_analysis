package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftEffectAckParams {

    @C09CT("ack_type")
    public int ackType;

    @C09CT("effect_extra")
    public GiftEffectAckEffectExtra effectExtra;

    @C09CT("effect_id")
    public long effectId;

    @C09CT("effect_payload")
    public String effectPayload = "";

    @C09CT("gift_id")
    public long giftId;

    @C09CT("room_id")
    public long roomId;
}
