package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteSchemaPreloadConfig {
    public static final TypeAdapter ADAPTER = new LivePromoteSchemaPreloadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("release_duration")
    public int releaseDuration;

    public LivePromoteSchemaPreloadConfig() {
        this(false, 0);
    }

    public LivePromoteSchemaPreloadConfig(boolean z, int i) {
        this.enable = z;
        this.releaseDuration = i;
    }
}
