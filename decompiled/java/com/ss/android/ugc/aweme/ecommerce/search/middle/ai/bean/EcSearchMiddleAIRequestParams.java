package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddleAIRequestParams {

    @C09CT("ecom_user_actions")
    public final String ecomUserActions;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public EcSearchMiddleAIRequestParams() {
        this(null, null);
    }

    public EcSearchMiddleAIRequestParams(String str, Integer num) {
        this.ecomUserActions = str;
        this.scene = num;
    }
}
