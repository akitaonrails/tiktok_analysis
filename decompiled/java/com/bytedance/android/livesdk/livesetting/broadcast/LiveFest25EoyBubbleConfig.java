package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fest25_anchor_effect_bubble_config")
public final class LiveFest25EoyBubbleConfig {
    public static final LiveFest25EoyBubbleConfig INSTANCE = new LiveFest25EoyBubbleConfig();
    public static final EffectBubbleConfig DEFAULT = new EffectBubbleConfig(false, 5, 900, null, "");

    public final EffectBubbleConfig getBubbleConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        EffectBubbleConfig effectBubbleConfig = DEFAULT;
        EffectBubbleConfig effectBubbleConfig2 = (EffectBubbleConfig) settingsManager.getValueSafely("live_fest25_anchor_effect_bubble_config", effectBubbleConfig);
        return effectBubbleConfig2 != null ? effectBubbleConfig2 : effectBubbleConfig;
    }

    public final EffectBubbleConfig getDEFAULT() {
        return DEFAULT;
    }
}
