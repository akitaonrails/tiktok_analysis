package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiGuestAnchorQuickConnectConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("time")
    public long time;

    @C09CT("type")
    public int type;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestAnchorQuickConnectConfig_OptTypeAdapter();
    }

    public MultiGuestAnchorQuickConnectConfig() {
        this(0, 120L);
    }

    public MultiGuestAnchorQuickConnectConfig(int i, long j) {
        this.type = i;
        this.time = j;
    }
}
