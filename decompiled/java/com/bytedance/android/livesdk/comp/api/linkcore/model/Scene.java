package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class Scene {

    @C09CT("desc")
    public final String desc;

    @C09CT("layout_id")
    public Map<String, String> layoutId;

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("version")
    public final int version;

    public final void setLayoutId(Map<String, String> map) {
        this.layoutId = map;
    }

    public Scene(int i, int i2, String str, Map<String, String> map) {
        this.scene = i;
        this.version = i2;
        this.desc = str;
        this.layoutId = map;
    }
}
