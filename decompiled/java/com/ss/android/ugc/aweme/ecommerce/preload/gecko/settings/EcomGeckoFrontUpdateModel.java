package com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomGeckoFrontUpdateModel {

    @C09CT("delay")
    public final long delay;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("update")
    public final String update;

    public EcomGeckoFrontUpdateModel() {
        this("", "", 3000L);
    }

    public EcomGeckoFrontUpdateModel(String str, String str2, long j) {
        this.scene = str;
        this.update = str2;
        this.delay = j;
    }
}
