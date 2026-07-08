package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_currency_code_opt_config")
public final class LiveCurrencyCodeTimeoutSettings {
    public static final LiveCurrencyCodeTimeoutSettings INSTANCE = new LiveCurrencyCodeTimeoutSettings();
    public static final CurrencyCodeTimeoutConfig DEFAULT = new CurrencyCodeTimeoutConfig(0, 1000);

    private final CurrencyCodeTimeoutConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CurrencyCodeTimeoutConfig currencyCodeTimeoutConfig = DEFAULT;
        CurrencyCodeTimeoutConfig currencyCodeTimeoutConfig2 = (CurrencyCodeTimeoutConfig) settingsManager.getValueSafely("live_currency_code_opt_config", currencyCodeTimeoutConfig);
        return currencyCodeTimeoutConfig2 != null ? currencyCodeTimeoutConfig2 : currencyCodeTimeoutConfig;
    }

    public final boolean isCacheCurrency() {
        return getConfig().group == 1;
    }

    public final boolean isTimeoutCurrency() {
        return getConfig().group == 2;
    }

    public final long timeoutMs() {
        return getConfig().timeoutMs;
    }
}
