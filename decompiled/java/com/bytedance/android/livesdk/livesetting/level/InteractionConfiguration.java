package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class InteractionConfiguration {
    public static final TypeAdapter ADAPTER = new InteractionConfiguration_OptTypeAdapter(NormalGson.singleton());

    @C09CT("effective_delay_time")
    public int effectiveDelayTime;

    @C09CT("event_params")
    public Map<String, String> eventParams;

    @C09CT("params")
    public Map<String, String> params;

    @C09CT("schema")
    public String schema;

    public InteractionConfiguration() {
        this(new LinkedHashMap(), "", 0, new LinkedHashMap());
    }

    public InteractionConfiguration(Map<String, String> map, String str, int i, Map<String, String> map2) {
        this.eventParams = map;
        this.schema = str;
        this.effectiveDelayTime = i;
        this.params = map2;
    }
}
