package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class GameRewardsEnhanceSetting {
    public static final TypeAdapter ADAPTER = new GameRewardsEnhanceSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("drops_sticker_id")
    public String dropsStickerId;

    @C09CT("drops_sticker_local_text_closed")
    public boolean dropsStickerLocalTextClosed;

    @C09CT("enable_pin_card")
    public boolean enablePinCard;

    @C09CT("enable_sticker")
    public boolean enableSticker;

    public GameRewardsEnhanceSetting() {
        this(false, false, "", false);
    }

    public final String getDropsStickerId() {
        return this.dropsStickerId;
    }

    public final boolean getDropsStickerLocalTextClosed() {
        return this.dropsStickerLocalTextClosed;
    }

    public final boolean getEnablePinCard() {
        return this.enablePinCard;
    }

    public final boolean getEnableSticker() {
        return this.enableSticker;
    }

    public final void setDropsStickerId(String str) {
        this.dropsStickerId = str;
    }

    public final void setDropsStickerLocalTextClosed(boolean z) {
        this.dropsStickerLocalTextClosed = z;
    }

    public final void setEnablePinCard(boolean z) {
        this.enablePinCard = z;
    }

    public final void setEnableSticker(boolean z) {
        this.enableSticker = z;
    }

    public GameRewardsEnhanceSetting(boolean z, boolean z2, String str, boolean z3) {
        this.enableSticker = z;
        this.enablePinCard = z2;
        this.dropsStickerId = str;
        this.dropsStickerLocalTextClosed = z3;
    }
}
