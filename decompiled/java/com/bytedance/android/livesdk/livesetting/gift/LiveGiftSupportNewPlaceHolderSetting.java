package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_gift_text_place_holder_opt_setting")
public final class LiveGiftSupportNewPlaceHolderSetting {
    public static final LiveGiftSupportNewPlaceHolderSetting INSTANCE = new LiveGiftSupportNewPlaceHolderSetting();
    public static final boolean DEFAULT = true;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("live_gift_text_place_holder_opt_setting", DEFAULT);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
