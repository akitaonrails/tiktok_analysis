package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoPerfImageMobModel {

    @C09CT("full")
    public final boolean full;

    @C09CT("level")
    public final int level;

    @C09CT("sample")
    public final int sample;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public TakoPerfImageMobModel() {
        this("", 0, false, 0);
    }

    public TakoPerfImageMobModel(String str, int i, boolean z, int i2) {
        this.scene = str;
        this.level = i;
        this.full = z;
        this.sample = i2;
    }
}
