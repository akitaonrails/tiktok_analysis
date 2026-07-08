package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LopBanner {
    public static final TypeAdapter ADAPTER;

    @C09CT("go_live_schema")
    public String goLiveSchema;

    static {
        NormalGson.singleton();
        ADAPTER = new LopBanner_OptTypeAdapter();
    }

    public LopBanner() {
        this("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:profile_lop_banner}");
    }

    public final String getGoLiveSchema() {
        return this.goLiveSchema;
    }

    public LopBanner(String str) {
        this.goLiveSchema = str;
    }

    public final void setGoLiveSchema(String str) {
        this.goLiveSchema = str;
    }
}
