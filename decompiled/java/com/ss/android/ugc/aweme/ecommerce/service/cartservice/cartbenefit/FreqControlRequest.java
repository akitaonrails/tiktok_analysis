package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.FreqControlScene;

/* JADX INFO: loaded from: classes27.dex */
public final class FreqControlRequest {

    @C09CT("biz_extra")
    public final FreqControlExtra bizExtra;

    @C09CT(Scene.SCENE_SERVICE)
    public final FreqControlScene scene;

    public FreqControlRequest(FreqControlExtra freqControlExtra, FreqControlScene freqControlScene) {
        this.bizExtra = freqControlExtra;
        this.scene = freqControlScene;
    }
}
