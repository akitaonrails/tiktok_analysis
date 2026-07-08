package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class FEWebsocketConfig {
    public static final TypeAdapter ADAPTER = new FEWebsocketConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("kv_list")
    public List<FEWebsocketKV> kvList;

    public FEWebsocketConfig() {
        this(null, 1, null);
    }

    public FEWebsocketConfig(List<FEWebsocketKV> list) {
        this.kvList = list;
    }

    public FEWebsocketConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
