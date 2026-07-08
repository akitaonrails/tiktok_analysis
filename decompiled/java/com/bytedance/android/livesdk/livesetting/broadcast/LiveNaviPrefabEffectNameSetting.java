package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_navi_prefab_effect_name")
public final class LiveNaviPrefabEffectNameSetting {
    public static final String DEFAULT = "navi_head_prefab_live";
    public static final LiveNaviPrefabEffectNameSetting INSTANCE = new LiveNaviPrefabEffectNameSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_navi_prefab_effect_name", DEFAULT);
    }
}
