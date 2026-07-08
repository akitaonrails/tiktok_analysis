package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_boost_margin_factor")
public final class LiveMatchFlashAnimationMarginFactor {
    public static final float DEFAULT = 0.85f;
    public static final LiveMatchFlashAnimationMarginFactor INSTANCE = new LiveMatchFlashAnimationMarginFactor();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_match_boost_margin_factor", DEFAULT);
    }
}
