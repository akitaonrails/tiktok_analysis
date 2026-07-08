package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreloadImageConfig {
    public static final TypeAdapter ADAPTER = new LivePreloadImageConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_image_state")
    public int defaultImageState;

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("pre_load_avatar")
    public boolean preloadAvatar;

    @C09CT("pre_load_live_bg")
    public boolean preloadLiveBG;

    public LivePreloadImageConfig() {
        this(false, false, -1L, 0);
    }

    public LivePreloadImageConfig(boolean z, boolean z2, long j, int i) {
        this.preloadLiveBG = z;
        this.preloadAvatar = z2;
        this.delayTime = j;
        this.defaultImageState = i;
    }
}
