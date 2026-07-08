package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCoHostMonitorConfig {
    public static final TypeAdapter ADAPTER = new LiveCoHostMonitorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("is_enable")
    public boolean isEnable;

    @C09CT("offline_event_config")
    public Map<String, ? extends List<String>> offlineEventConfig;

    @C09CT("offline_service_config")
    public List<String> offlineServiceConfig;

    @C09CT("online_event_config")
    public Map<String, ? extends Map<String, Integer>> onlineEventConfig;

    public LiveCoHostMonitorConfig() {
        this(false, null, null, null, 15, null);
    }

    public LiveCoHostMonitorConfig(boolean z, Map<String, ? extends Map<String, Integer>> map, Map<String, ? extends List<String>> map2, List<String> list) {
        this.isEnable = z;
        this.onlineEventConfig = map;
        this.offlineEventConfig = map2;
        this.offlineServiceConfig = list;
    }

    public LiveCoHostMonitorConfig(boolean z, Map map, Map map2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C2097608Jq.LJ() : map2, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
