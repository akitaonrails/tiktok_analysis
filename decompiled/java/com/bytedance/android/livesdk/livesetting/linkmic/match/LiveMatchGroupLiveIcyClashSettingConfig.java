package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchGroupLiveIcyClashSettingConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchGroupLiveIcyClashSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("education_url")
    public String education_url;

    @C09CT("effect_screen_height_percentage")
    public float effect_screen_height_percentage;

    @C09CT("effect_url")
    public String effect_url;

    @C09CT("enable")
    public boolean enable;

    public LiveMatchGroupLiveIcyClashSettingConfig() {
        this(true, 0.75f, "aweme://roma_redirect/?spark_page=match_icy_clash_educate", "sslocal://webcast_lynxview?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_match_icy_effect%2Fmain%2Ftemplate.js&enable_canvas=1&use_v8=1&enable_dynamic_v8=1");
    }

    public LiveMatchGroupLiveIcyClashSettingConfig(boolean z, float f, String str, String str2) {
        this.enable = z;
        this.effect_screen_height_percentage = f;
        this.education_url = str;
        this.effect_url = str2;
    }
}
