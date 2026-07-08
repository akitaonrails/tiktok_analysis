package com.bytedance.android.livesdk.livesetting.gift;

import X.C1CC2;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_msg_config_strategy")
public final class LiveGiftConfigParams {
    public static final LiveGiftConfigParams INSTANCE = new LiveGiftConfigParams();
    public static final GiftConfigParams DEFAULT = new GiftConfigParams();

    public final GiftConfigParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftConfigParams giftConfigParams = DEFAULT;
        GiftConfigParams giftConfigParams2 = (GiftConfigParams) settingsManager.getValueSafely("gift_msg_config_strategy", giftConfigParams);
        if (giftConfigParams2 != null) {
            return giftConfigParams2;
        }
        C1CC2.LIZ("Invalid JSON Config for gift_msg_config_strategy", new Throwable("Invalid JSON Config for gift_msg_config_strategy"));
        return giftConfigParams;
    }
}
