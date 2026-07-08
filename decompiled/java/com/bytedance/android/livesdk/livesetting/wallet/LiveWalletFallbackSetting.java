package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_wallet_fallback")
public final class LiveWalletFallbackSetting {
    public static final LiveWalletFallbackSetting INSTANCE = new LiveWalletFallbackSetting();
    public static final HashMap<String, Boolean> DEFAULT = C2097608Jq.LJI(new Pair("exchange_kyc", Boolean.FALSE));

    private final Map<String, Boolean> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, Boolean> map = DEFAULT;
        Map<String, Boolean> map2 = (Map) settingsManager.getValueSafely("live_wallet_fallback", map);
        return map2 != null ? map2 : map;
    }

    public final boolean getExchangeKycFallback() {
        Boolean bool = getValue().get("exchange_kyc");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
