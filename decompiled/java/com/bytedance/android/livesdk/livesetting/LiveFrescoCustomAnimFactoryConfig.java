package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveFrescoCustomAnimFactoryConfig {
    public static final TypeAdapter ADAPTER = new LiveFrescoCustomAnimFactoryConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("memory_size")
    public int memorySize = 75;

    @C09CT("path_configs")
    public Map<String, AnimFactoryConfig> pathConfigs;

    @C09CT("scene_configs")
    public Map<String, AnimFactoryConfig> sceneConfigs;

    @C09CT("share_anim_key")
    public boolean shareAnimKey;

    public final int getMemorySize() {
        return this.memorySize;
    }

    public final Map<String, AnimFactoryConfig> getPathConfigs() {
        return this.pathConfigs;
    }

    public final Map<String, AnimFactoryConfig> getSceneConfigs() {
        return this.sceneConfigs;
    }

    public final boolean getShareAnimKey() {
        return this.shareAnimKey;
    }

    public final void setMemorySize(int i) {
        this.memorySize = i;
    }

    public final void setPathConfigs(Map<String, AnimFactoryConfig> map) {
        this.pathConfigs = map;
    }

    public final void setSceneConfigs(Map<String, AnimFactoryConfig> map) {
        this.sceneConfigs = map;
    }

    public final void setShareAnimKey(boolean z) {
        this.shareAnimKey = z;
    }
}
