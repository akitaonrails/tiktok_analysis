package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneEventTrigger {
    public static final TypeAdapter ADAPTER = new PreloadSceneEventTrigger_OptTypeAdapter(NormalGson.singleton());

    @C09CT("event_name")
    public String eventName;

    @C09CT("param_filter")
    public Map<String, String> filterParam;

    @C09CT("strategy_key_list")
    public List<String> strategyKeyList;

    public PreloadSceneEventTrigger() {
        this(null, null, null, 7, null);
    }

    public PreloadSceneEventTrigger(String str, Map<String, String> map, List<String> list) {
        this.eventName = str;
        this.filterParam = map;
        this.strategyKeyList = list;
    }

    public PreloadSceneEventTrigger(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
