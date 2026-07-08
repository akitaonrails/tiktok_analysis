package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftHintInfo {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("has_gift_history")
    public boolean hasGiftHistory;

    @C09CT("hint_icon")
    public ImageModel hintIcon;

    @C09CT("hint_id")
    public int hintId;

    @C09CT("hint_show_delay_ms")
    public long hintShowDelayMs;

    @C09CT("hint_text")
    public String hintText = "";
}
