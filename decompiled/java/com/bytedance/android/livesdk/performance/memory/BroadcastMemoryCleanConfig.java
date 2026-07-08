package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastMemoryCleanConfig {
    public static final TypeAdapter ADAPTER = new BroadcastMemoryCleanConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("critical_destroy_page_whitelist")
    public List<String> criticalDestroyPageWhitelist;

    public BroadcastMemoryCleanConfig() {
        this(null, 1, null);
    }

    public final List<String> getCriticalDestroyPageWhitelist() {
        return this.criticalDestroyPageWhitelist;
    }

    public BroadcastMemoryCleanConfig(List<String> list) {
        this.criticalDestroyPageWhitelist = list;
    }

    public final void setCriticalDestroyPageWhitelist(List<String> list) {
        this.criticalDestroyPageWhitelist = list;
    }

    public BroadcastMemoryCleanConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
