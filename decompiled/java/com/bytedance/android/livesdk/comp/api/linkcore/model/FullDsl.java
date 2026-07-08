package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class FullDsl {

    @C09CT("layouts")
    public final List<Layout> layouts;

    @C09CT("patches")
    public final Map<String, Map<String, PatchLayout>> patches;

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public List<Scene> scene;

    public final List<Layout> getLayouts() {
        return this.layouts;
    }

    public final Map<String, Map<String, PatchLayout>> getPatches() {
        return this.patches;
    }

    public final List<Scene> getScene() {
        return this.scene;
    }

    public final void setScene(List<Scene> list) {
        this.scene = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullDsl(List<Scene> list, List<Layout> list2, Map<String, ? extends Map<String, PatchLayout>> map) {
        this.scene = list;
        this.layouts = list2;
        this.patches = map;
    }
}
