package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_exchange_migration_config")
public final class LiveGiftExchangeFESchema {
    public static final LiveGiftExchangeFESchema INSTANCE = new LiveGiftExchangeFESchema();
    public static final GiftExchangeSchema DEFAULT = new GiftExchangeSchema();

    public final GiftExchangeSchema getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftExchangeSchema giftExchangeSchema = DEFAULT;
        GiftExchangeSchema giftExchangeSchema2 = (GiftExchangeSchema) settingsManager.getValueSafely("gift_exchange_migration_config", giftExchangeSchema);
        return giftExchangeSchema2 != null ? giftExchangeSchema2 : giftExchangeSchema;
    }

    public final String getAutoExchangeSchema() {
        return getValue().autoExchangePopUpSchema;
    }

    public final String getGiftExchangePopUpSchema() {
        return getValue().giftExchangePopSchema;
    }

    public final String getW9PopUpSchema() {
        return getValue().taxPopUpSchema;
    }

    public final boolean isEnableLynxGiftExchange() {
        return getValue().liveWalletEnableLynxGiftExchangePopup;
    }
}
