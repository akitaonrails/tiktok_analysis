package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("effect_gender_algo_resource_id")
public final class LiveEffectGenderAlgoResourceId {
    public static final LiveEffectGenderAlgoResourceId INSTANCE = new LiveEffectGenderAlgoResourceId();
    public static final String DEFAULT = "7509690480926396945";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("effect_gender_algo_resource_id", DEFAULT);
    }
}
