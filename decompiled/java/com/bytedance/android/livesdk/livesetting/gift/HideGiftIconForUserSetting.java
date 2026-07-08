package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("hide_gift_icon_for_user")
public final class HideGiftIconForUserSetting {
    public static final boolean DEFAULT = false;
    public static final HideGiftIconForUserSetting INSTANCE = new HideGiftIconForUserSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hide_gift_icon_for_user", DEFAULT);
    }
}
