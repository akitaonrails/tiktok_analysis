package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gift_combo_number_opt")
public final class LiveGiftComboNumberOptSetting {
    public static final LiveGiftComboNumberOptConfig DEFAULT;
    public static final LiveGiftComboNumberOptSetting INSTANCE = new LiveGiftComboNumberOptSetting();

    static {
        LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig = new LiveGiftComboNumberOptConfig();
        liveGiftComboNumberOptConfig.exp = 2;
        liveGiftComboNumberOptConfig.smallGiftThreshold = 10;
        liveGiftComboNumberOptConfig.bigGiftThreshold = 3;
        DEFAULT = liveGiftComboNumberOptConfig;
    }

    public static final int bigGiftThreshold() {
        return INSTANCE.value().smallGiftThreshold;
    }

    public static final int smallGiftThreshold() {
        return INSTANCE.value().smallGiftThreshold;
    }

    private final LiveGiftComboNumberOptConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig = DEFAULT;
        LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig2 = (LiveGiftComboNumberOptConfig) settingsManager.getValueSafely("live_gift_combo_number_opt", liveGiftComboNumberOptConfig);
        return liveGiftComboNumberOptConfig2 != null ? liveGiftComboNumberOptConfig2 : liveGiftComboNumberOptConfig;
    }
}
