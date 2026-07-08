package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_quick_gift")
public final class OptimizeQuickGiftSetting {
    public static final int DEFAULT = 0;
    public static final OptimizeQuickGiftSetting INSTANCE = new OptimizeQuickGiftSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("optimize_quick_gift", DEFAULT);
    }

    public final boolean shouldUpdateOnEnter() {
        return getValue() == 2;
    }

    public final boolean shouldUseCache() {
        return getValue() == 0;
    }
}
