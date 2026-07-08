package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigPreload {

    @C09CT("preload_name")
    public final String preloadName;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public EcomLoadRetreatConfigPreload() {
        this(null, null);
    }

    public EcomLoadRetreatConfigPreload(String str, String str2) {
        this.scene = str;
        this.preloadName = str2;
    }
}
