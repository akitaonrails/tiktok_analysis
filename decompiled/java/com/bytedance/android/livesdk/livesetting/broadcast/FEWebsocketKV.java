package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FEWebsocketKV {
    public static final TypeAdapter ADAPTER;

    @C09CT("method_id")
    public int methodId;

    @C09CT("service_id")
    public int serviceId;

    static {
        NormalGson.singleton();
        ADAPTER = new FEWebsocketKV_OptTypeAdapter();
    }

    public FEWebsocketKV() {
        this(-1, -1);
    }

    public FEWebsocketKV(int i, int i2) {
        this.serviceId = i;
        this.methodId = i2;
    }
}
