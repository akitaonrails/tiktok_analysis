package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import X.C308310C6r;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicOptionModel {

    @C09CT("reversal")
    public int enableReversal;

    @C09CT("key")
    public int key;

    @C09CT("libra_key")
    public String libraKey;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("type")
    public int type;

    public DynamicOptionModel() {
        this(null, 0, 0, 0, 1);
    }

    public final C308310C6r LIZ() {
        C308310C6r c308310C6r = new C308310C6r();
        c308310C6r.LIZ = this.key;
        c308310C6r.LIZJ = this.type;
        c308310C6r.LIZLLL = this.scene;
        return c308310C6r;
    }

    public DynamicOptionModel(String str, int i, int i2, int i3, int i4) {
        this.libraKey = str;
        this.key = i;
        this.type = i2;
        this.scene = i3;
        this.enableReversal = i4;
    }
}
