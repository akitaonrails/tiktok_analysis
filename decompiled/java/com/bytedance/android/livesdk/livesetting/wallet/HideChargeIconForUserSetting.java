package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("hide_charge_icon_for_user")
public final class HideChargeIconForUserSetting {
    public static final boolean DEFAULT = false;
    public static final HideChargeIconForUserSetting INSTANCE = new HideChargeIconForUserSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hide_charge_icon_for_user", DEFAULT);
    }
}
