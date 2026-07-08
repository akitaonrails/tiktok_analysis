package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class TTLHStageNetworkOptV2SettingRequest {
    public static final TypeAdapter ADAPTER;

    @C09CT("group")
    public int group;

    @C09CT("ttnet_network_status_update_interval")
    public int ttNetInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new TTLHStageNetworkOptV2SettingRequest_OptTypeAdapter();
    }

    public TTLHStageNetworkOptV2SettingRequest() {
        this(1, 30);
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getTtNetInterval() {
        return this.ttNetInterval;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public final void setTtNetInterval(int i) {
        this.ttNetInterval = i;
    }

    public TTLHStageNetworkOptV2SettingRequest(int i, int i2) {
        this.group = i;
        this.ttNetInterval = i2;
    }
}
