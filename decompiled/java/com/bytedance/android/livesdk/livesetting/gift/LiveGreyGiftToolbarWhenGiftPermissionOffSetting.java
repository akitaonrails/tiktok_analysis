package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_grey_gift_toolbar_when_gift_permission_off")
public final class LiveGreyGiftToolbarWhenGiftPermissionOffSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGreyGiftToolbarWhenGiftPermissionOffSetting INSTANCE = new LiveGreyGiftToolbarWhenGiftPermissionOffSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_grey_gift_toolbar_when_gift_permission_off", DEFAULT);
    }
}
