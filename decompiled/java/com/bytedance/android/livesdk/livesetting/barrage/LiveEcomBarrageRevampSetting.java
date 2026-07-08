package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ecom_barrage_revamp_setting")
public final class LiveEcomBarrageRevampSetting {
    public static final LiveEcomBarrageRevampSetting INSTANCE = new LiveEcomBarrageRevampSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ecom_barrage_revamp_setting", DEFAULT);
    }
}
