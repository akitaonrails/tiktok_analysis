package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_card_double_animation_enable")
public final class LiveMatchTop2Top3CardDoubleAnimationEnable {
    public static final boolean DEFAULT = true;
    public static final LiveMatchTop2Top3CardDoubleAnimationEnable INSTANCE = new LiveMatchTop2Top3CardDoubleAnimationEnable();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_card_double_animation_enable", DEFAULT);
    }
}
