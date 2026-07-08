package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRoomCheckAliveConfig {
    public static final TypeAdapter ADAPTER = new LiveRoomCheckAliveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("check_nr")
    public boolean checkNR;

    @C09CT("check_pausing")
    public boolean checkPausing;

    public LiveRoomCheckAliveConfig() {
        this(false, false);
    }

    public LiveRoomCheckAliveConfig(boolean z, boolean z2) {
        this.checkNR = z;
        this.checkPausing = z2;
    }
}
