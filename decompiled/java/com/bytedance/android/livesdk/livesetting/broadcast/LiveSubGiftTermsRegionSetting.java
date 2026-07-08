package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("giftsub_region_terms")
public final class LiveSubGiftTermsRegionSetting {
    public static final int DEFAULT = 2;
    public static final LiveSubGiftTermsRegionSetting INSTANCE = new LiveSubGiftTermsRegionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("giftsub_region_terms", DEFAULT);
    }
}
