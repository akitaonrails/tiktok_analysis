package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_special_gift_combo_pin_on_input")
public final class LiveSpecialGiftComboPinOnInputSetting {
    public static final LiveSpecialGiftComboPinOnInputSetting INSTANCE = new LiveSpecialGiftComboPinOnInputSetting();
    public static final boolean DEFAULT = true;

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_special_gift_combo_pin_on_input", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
