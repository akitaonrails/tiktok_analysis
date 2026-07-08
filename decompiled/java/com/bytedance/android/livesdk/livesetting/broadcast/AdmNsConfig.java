package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AdmNsConfig {
    public static final TypeAdapter ADAPTER = new AdmNsConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_ns_on_headset")
    public boolean enable;

    @C09CT("enable_sami_enginecommon_debug")
    public boolean enableDebug;

    @C09CT("live_adm_ns_type")
    public int nsType;

    @C09CT("live_adm_ns_url")
    public String nsUrl;

    public AdmNsConfig() {
        this(0, false, "", false);
    }

    public AdmNsConfig(int i, boolean z, String str, boolean z2) {
        this.nsType = i;
        this.enable = z;
        this.nsUrl = str;
        this.enableDebug = z2;
    }
}
