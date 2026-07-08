package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_local_currency_gift_setting")
public final class LiveGiftLocalCurrencyGiftSetting {
    public static final LiveGiftLocalCurrencyGiftSetting INSTANCE = new LiveGiftLocalCurrencyGiftSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_local_currency_gift_setting", DEFAULT);
    }
}
