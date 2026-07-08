package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_takestage_gift_tray_margin_fix")
public final class LiveCoHostTakeStageGiftTrayMarginFixSetting {
    public static final LiveCoHostTakeStageGiftTrayMarginFixSetting INSTANCE = new LiveCoHostTakeStageGiftTrayMarginFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_takestage_gift_tray_margin_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
