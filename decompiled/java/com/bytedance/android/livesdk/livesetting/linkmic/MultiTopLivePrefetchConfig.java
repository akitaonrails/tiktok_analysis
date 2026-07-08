package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLivePrefetchConfig {
    public static final TypeAdapter ADAPTER = new MultiTopLivePrefetchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("prefetch_room_size")
    public int prefetchRoomSize;

    public MultiTopLivePrefetchConfig() {
        this(false, 1);
    }

    public MultiTopLivePrefetchConfig(boolean z, int i) {
        this.enable = z;
        this.prefetchRoomSize = i;
    }
}
