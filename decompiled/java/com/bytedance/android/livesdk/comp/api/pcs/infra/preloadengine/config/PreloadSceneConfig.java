package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneConfig {
    public static final TypeAdapter ADAPTER = new PreloadSceneConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("event_trigger_config_list")
    public List<PreloadSceneEventTrigger> configList;

    @C09CT("report_sampling_rate")
    public int reportSamplingRate;

    @C09CT("scene_key")
    public String sceneKey;

    @C09CT("strategy_map")
    public Map<String, PreloadStrategyConfig> strategyMap;

    public PreloadSceneConfig() {
        this(null, null, null, 0, 15, null);
    }

    public final List<PreloadStrategyConfig> LIZ() {
        Collection<PreloadStrategyConfig> collectionValues;
        Map<String, PreloadStrategyConfig> map = this.strategyMap;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return C13LP.LLIIII(collectionValues);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_key=");
        sbLIZ.append(this.sceneKey);
        sbLIZ.append(" strategyKeys=");
        Map<String, PreloadStrategyConfig> map = this.strategyMap;
        sbLIZ.append(map != null ? map.keySet() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadSceneConfig(String str, Map<String, PreloadStrategyConfig> map, List<PreloadSceneEventTrigger> list, int i) {
        this.sceneKey = str;
        this.strategyMap = map;
        this.configList = list;
        this.reportSamplingRate = i;
    }

    public PreloadSceneConfig(String str, Map map, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C2097608Jq.LJ() : map, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? 100 : i);
    }
}
