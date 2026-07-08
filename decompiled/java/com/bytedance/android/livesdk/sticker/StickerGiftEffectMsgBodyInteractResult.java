package com.bytedance.android.livesdk.sticker;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerGiftEffectMsgBodyInteractResult {

    @C09CT("effect_id")
    public long effectId;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("payload")
    public String payload;

    public StickerGiftEffectMsgBodyInteractResult() {
        this(0L, 0L, "");
    }

    public StickerGiftEffectMsgBodyInteractResult(long j, long j2, String str) {
        this.giftId = j;
        this.effectId = j2;
        this.payload = str;
    }
}
