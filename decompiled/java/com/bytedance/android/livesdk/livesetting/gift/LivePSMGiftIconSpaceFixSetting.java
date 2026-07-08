package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_psm_gift_icon_space_fix_setting")
public final class LivePSMGiftIconSpaceFixSetting {
    public static final LivePSMGiftIconSpaceFixSetting INSTANCE = new LivePSMGiftIconSpaceFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_psm_gift_icon_space_fix_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
