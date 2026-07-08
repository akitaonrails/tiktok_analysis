package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePcsAutoExpandBioConfig {
    public static final TypeAdapter ADAPTER = new LivePcsAutoExpandBioConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("height_threshold")
    public float heightThreshold;

    public LivePcsAutoExpandBioConfig() {
        this(true, 0.5f);
    }

    public LivePcsAutoExpandBioConfig(boolean z, float f) {
        this.enabled = z;
        this.heightThreshold = f;
    }
}
