package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class StreamDRMConfig {
    public static final TypeAdapter ADAPTER = new StreamDRMConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_standard_drm")
    public boolean enableStandardDRM = true;

    @C09CT("disable_pre_pull_stream")
    public boolean disablePrePullStream = true;
}
