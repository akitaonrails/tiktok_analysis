package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("common_sku_skip_check")
public final class LiveSubCommonSkuTestSkipCheckSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveSubCommonSkuTestSkipCheckSetting INSTANCE = new LiveSubCommonSkuTestSkipCheckSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("common_sku_skip_check", DEFAULT);
    }
}
