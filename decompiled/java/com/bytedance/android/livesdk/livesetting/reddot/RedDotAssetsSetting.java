package com.bytedance.android.livesdk.livesetting.reddot;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("red_dot_assets_setting")
public final class RedDotAssetsSetting {
    public static final boolean DEFAULT = false;
    public static final RedDotAssetsSetting INSTANCE = new RedDotAssetsSetting();

    public final boolean enableAssetsRedDot() {
        return SettingsManager.INSTANCE.getBooleanValue("red_dot_assets_setting", DEFAULT);
    }
}
