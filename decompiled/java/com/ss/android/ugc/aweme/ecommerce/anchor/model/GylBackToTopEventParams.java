package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes33.dex */
public final class GylBackToTopEventParams {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("back_type")
    public final Integer backType;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public GylBackToTopEventParams() {
        this(null, null, null);
    }

    public GylBackToTopEventParams(String str, Integer num, String str2) {
        this.actionType = str;
        this.backType = num;
        this.scene = str2;
    }
}
