package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_pcs_clickable_bullet_setting")
public final class LivePcsClickableBulletSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsClickableBulletSetting INSTANCE = new LivePcsClickableBulletSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_clickable_bullet_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
