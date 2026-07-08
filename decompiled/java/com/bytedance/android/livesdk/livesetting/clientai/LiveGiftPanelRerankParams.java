package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPanelRerankParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("algo_package_name")
    public String algoPkgName;

    @C09CT("default_for_timer")
    public long defaultTimer;

    @C09CT("enable")
    public int enable;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveGiftPanelRerankParams_OptTypeAdapter();
    }

    public LiveGiftPanelRerankParams() {
        this(0, 300L, "");
    }

    public LiveGiftPanelRerankParams(int i, long j, String str) {
        this.enable = i;
        this.defaultTimer = j;
        this.algoPkgName = str;
    }
}
