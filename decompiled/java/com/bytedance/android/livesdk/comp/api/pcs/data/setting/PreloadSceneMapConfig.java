package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadSceneConfig;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneMapConfig {
    public static final TypeAdapter ADAPTER = new PreloadSceneMapConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("scene_map")
    public Map<String, PreloadSceneConfig> sceneMap;

    public PreloadSceneMapConfig() {
        this(C2097608Jq.LJ());
    }

    public PreloadSceneMapConfig(Map<String, PreloadSceneConfig> map) {
        this.sceneMap = map;
    }
}
