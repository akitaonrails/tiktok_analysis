package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSheetDemoLynxUrlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("spark_navigate")
    public String sparkNavigate;

    @C09CT("spark_offline_navigate")
    public String sparkOfflineNavigate;

    @C09CT("spark_offline_overlay")
    public String sparkOfflineOverlay;

    @C09CT("spark_overlay")
    public String sparkOverlay;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveSheetDemoLynxUrlConfig_OptTypeAdapter();
    }

    public LiveSheetDemoLynxUrlConfig() {
        this("", "", "", "");
    }

    public LiveSheetDemoLynxUrlConfig(String str, String str2, String str3, String str4) {
        this.sparkOverlay = str;
        this.sparkNavigate = str2;
        this.sparkOfflineOverlay = str3;
        this.sparkOfflineNavigate = str4;
    }
}
