package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_commerce_life_make_way")
public final class AnchorCommerceLifeMakeWaySetting {
    public static final int DEFAULT = 0;
    public static final AnchorCommerceLifeMakeWaySetting INSTANCE = new AnchorCommerceLifeMakeWaySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_commerce_life_make_way", DEFAULT) == 1;
    }
}
