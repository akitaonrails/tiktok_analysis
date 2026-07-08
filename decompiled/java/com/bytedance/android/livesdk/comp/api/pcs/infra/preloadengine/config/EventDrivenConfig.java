package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class EventDrivenConfig {
    public static final TypeAdapter ADAPTER = new EventDrivenConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("condition")
    public Map<String, String> condition;

    @C09CT("config")
    public PreloadActionConfig config;

    @C09CT("event")
    public String event;

    @C09CT("is_custom_event")
    public boolean isCustomEvent;

    @C09CT("preload_params")
    public Map<String, String> preloadParams;

    @C09CT("preload_type")
    public int preloadType;

    @C09CT("strategy")
    public String strategy;

    public EventDrivenConfig() {
        this("", false, "", 0, null, C2097608Jq.LJ(), new LinkedHashMap());
    }

    public EventDrivenConfig(String str, boolean z, String str2, int i, PreloadActionConfig preloadActionConfig, Map<String, String> map, Map<String, String> map2) {
        this.event = str;
        this.isCustomEvent = z;
        this.strategy = str2;
        this.preloadType = i;
        this.config = preloadActionConfig;
        this.condition = map;
        this.preloadParams = map2;
    }
}
