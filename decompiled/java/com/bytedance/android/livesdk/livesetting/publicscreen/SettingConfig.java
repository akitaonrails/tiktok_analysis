package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SettingConfig {
    public static final TypeAdapter ADAPTER = new SettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("public_screen_status_sample")
    public int countSimple = 1;

    @C09CT("public_screen_perf_sample")
    public int perfSimple = 10000;

    @C09CT("public_screen_status_upload")
    public boolean uploadCountAndStatus;

    @C09CT("public_screen_perf_upload")
    public boolean uploadPerf;
}
