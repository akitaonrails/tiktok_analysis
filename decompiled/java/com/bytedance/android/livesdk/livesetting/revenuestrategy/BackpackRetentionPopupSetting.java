package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("need_recharge_retention_popup")
public final class BackpackRetentionPopupSetting {
    public static final boolean DEFAULT = false;
    public static final BackpackRetentionPopupSetting INSTANCE = new BackpackRetentionPopupSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("need_recharge_retention_popup", DEFAULT);
    }
}
