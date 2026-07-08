package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CompensateConfig {
    public static final TypeAdapter ADAPTER = new CompensateConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_client")
    public boolean enableClient;

    @C09CT("enable_server")
    public boolean enableServer;

    @C09CT("feed_request_opt")
    public boolean feedRequestOpt;

    public CompensateConfig() {
        this(false, false, false);
    }

    public CompensateConfig(boolean z, boolean z2, boolean z3) {
        this.enableClient = z;
        this.enableServer = z2;
        this.feedRequestOpt = z3;
    }
}
