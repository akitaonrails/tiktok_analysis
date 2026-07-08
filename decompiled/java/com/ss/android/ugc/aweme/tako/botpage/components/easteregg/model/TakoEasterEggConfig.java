package com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model;

import com.bytedance.scene.Scene;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class TakoEasterEggConfig {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    public static final class TakoEasterEggConfigDeserializer implements j<TakoEasterEggConfig> {
        @Override // com.google.gson.j
        public final TakoEasterEggConfig deserialize(k kVar, Type type, i iVar) {
            TakoEasterEggConfig takoEasterEggConfig = new TakoEasterEggConfig();
            n nVarLJIILIIL = kVar.LJIILIIL();
            takoEasterEggConfig.LIZ = nVarLJIILIIL.LJJIIZ(Scene.SCENE_SERVICE).LJIL();
            takoEasterEggConfig.LIZIZ = nVarLJIILIIL.LJJIIZ("scene_value").LJIL();
            takoEasterEggConfig.LIZJ = nVarLJIILIIL.LJJIIZ("default_emoji").LJIL();
            nVarLJIILIIL.LJJIJL(Scene.SCENE_SERVICE);
            nVarLJIILIIL.LJJIJL("scene_value");
            nVarLJIILIIL.LJJIJL("default_emoji");
            Map<String, String> map = takoEasterEggConfig.LIZLLL;
            for (Map.Entry<String, k> entry : nVarLJIILIIL.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                if (map != null) {
                    map.put(key, value.LJIL());
                }
            }
            return takoEasterEggConfig;
        }
    }

    public static final class TakoEasterEggConfigSerializer implements r<TakoEasterEggConfig> {
        @Override // com.google.gson.r
        public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
            TakoEasterEggConfig takoEasterEggConfig = (TakoEasterEggConfig) obj;
            n nVar = new n();
            nVar.LJJIIJ(Scene.SCENE_SERVICE, takoEasterEggConfig.LIZ);
            nVar.LJJIIJ("scene_value", takoEasterEggConfig.LIZIZ);
            nVar.LJJIIJ("default_emoji", takoEasterEggConfig.LIZJ);
            for (Map.Entry entry : ((LinkedHashMap) takoEasterEggConfig.LIZLLL).entrySet()) {
                nVar.LJJIFFI((String) entry.getKey(), aVar.LIZIZ(entry.getValue()));
            }
            return nVar;
        }
    }
}
