package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_category_block_list")
public final class LiveInteractionEffectBlockListSetting {
    public static final LiveInteractionEffectBlockListSetting INSTANCE = new LiveInteractionEffectBlockListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_effect_category_block_list", DEFAULT);
    }
}
