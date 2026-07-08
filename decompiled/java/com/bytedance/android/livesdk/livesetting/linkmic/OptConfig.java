package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class OptConfig {
    public static final TypeAdapter ADAPTER = new OptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("opt_card_cpu")
    public boolean optCardCpu;

    @C09CT("opt_mem")
    public boolean optMem;

    @C09CT("opt_save_room")
    public boolean optSaveRoom;

    public OptConfig() {
        this(false, false, false);
    }

    public OptConfig(boolean z, boolean z2, boolean z3) {
        this.optMem = z;
        this.optSaveRoom = z2;
        this.optCardCpu = z3;
    }
}
