package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("smb_one_stop_shop_enable_entrance")
public final class OneStopShopEntranceSetting {
    public static final OneStopShopEntranceSetting INSTANCE = new OneStopShopEntranceSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("smb_one_stop_shop_enable_entrance", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
