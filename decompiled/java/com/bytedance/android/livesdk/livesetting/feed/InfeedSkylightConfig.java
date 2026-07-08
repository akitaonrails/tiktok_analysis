package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class InfeedSkylightConfig {
    public static final TypeAdapter ADAPTER = new InfeedSkylightConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_anim")
    public boolean disableAnim;

    @C09CT("refresh_interval")
    public long refreshInterval = 5;
}
