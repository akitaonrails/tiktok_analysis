package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class OptLiveDownloadResourceConfig {
    public static final TypeAdapter ADAPTER = new OptLiveDownloadResourceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_ep_cache_size")
    public long cacheSize = 200;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_live_ep")
    public boolean enableLiveEp;

    @C09CT("opt_filter_download")
    public boolean enableOptFilterDownload;

    @C09CT("enable_opt_sound_download")
    public boolean enableOptSoundDownload;

    @C09CT("forbid_voice_preload")
    public boolean forbidVoicePreload;

    @C09CT("live_preload_size")
    public int preloadSize;

    @C09CT("used_effect_expired_time")
    public long usedEffectExpiredTime;
}
