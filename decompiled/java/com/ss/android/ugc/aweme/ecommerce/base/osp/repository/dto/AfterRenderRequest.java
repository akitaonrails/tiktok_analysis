package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class AfterRenderRequest {

    @C09CT("freq_control_key")
    public final String key;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public AfterRenderRequest(Integer num, String str) {
        this.scene = num;
        this.key = str;
    }
}
