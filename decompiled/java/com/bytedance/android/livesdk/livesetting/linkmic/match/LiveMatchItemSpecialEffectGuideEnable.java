package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_item_hammer_rule_guide")
public final class LiveMatchItemSpecialEffectGuideEnable {
    public static final int DEFAULT = 0;
    public static final LiveMatchItemSpecialEffectGuideEnable INSTANCE = new LiveMatchItemSpecialEffectGuideEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_match_item_hammer_rule_guide", DEFAULT) == 1;
    }
}
