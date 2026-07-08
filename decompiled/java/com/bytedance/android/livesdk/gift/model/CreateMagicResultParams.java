package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CreateMagicResultParams {

    @C09CT("magic_gift_id")
    public long magicGiftId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("ug_exchange")
    public int ugExchange;

    @C09CT("idempotency_key")
    public String idempotencyKey = "";

    @C09CT("sec_specific_magic_result_id")
    public String secSpecificMagicResultId = "";

    @C09CT("request_extra")
    public String requestExtra = "";
}
