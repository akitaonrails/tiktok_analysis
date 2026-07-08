package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_e_commerce_rank_enabled")
public final class ECRankSupportSetting {
    public static final boolean DEFAULT = false;
    public static final ECRankSupportSetting INSTANCE = new ECRankSupportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_e_commerce_rank_enabled", DEFAULT);
    }
}
