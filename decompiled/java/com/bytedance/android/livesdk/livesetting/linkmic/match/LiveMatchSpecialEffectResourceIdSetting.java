package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_special_effect_resource_id_setting")
public final class LiveMatchSpecialEffectResourceIdSetting {
    public static final String DEFAULT = "7319740256519983617";
    public static final LiveMatchSpecialEffectResourceIdSetting INSTANCE = new LiveMatchSpecialEffectResourceIdSetting();

    public final String getResourceId() {
        return SettingsManager.INSTANCE.getStringValue("live_match_special_effect_resource_id_setting", DEFAULT);
    }
}
