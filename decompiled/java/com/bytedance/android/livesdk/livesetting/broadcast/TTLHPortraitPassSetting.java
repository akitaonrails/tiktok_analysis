package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_portrait_pass_setting")
public final class TTLHPortraitPassSetting {
    public static final boolean DEFAULT = false;
    public static final TTLHPortraitPassSetting INSTANCE = new TTLHPortraitPassSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_portrait_pass_setting", DEFAULT);
    }
}
