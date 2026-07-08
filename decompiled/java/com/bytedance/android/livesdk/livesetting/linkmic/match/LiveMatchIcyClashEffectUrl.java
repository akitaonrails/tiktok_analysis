package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_icy_clash_effect_url")
public final class LiveMatchIcyClashEffectUrl {
    public static final String DEFAULT = "sslocal://webcast_lynxview?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_match_icy_effect%2Fmain%2Ftemplate.js&enable_canvas=1&use_v8=1&enable_dynamic_v8=1";
    public static final LiveMatchIcyClashEffectUrl INSTANCE = new LiveMatchIcyClashEffectUrl();

    public final String link() {
        return SettingsManager.INSTANCE.getStringValue("live_match_icy_clash_effect_url", DEFAULT);
    }
}
