package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.bean;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes10.dex */
public final class TtsDecisionGetReqParamsMixMall {

    @C09CT("algorithm_params")
    public final String algorithmParams;

    @C09CT("event_type")
    public final String eventType;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public TtsDecisionGetReqParamsMixMall(Integer num, String str, String str2) {
        this.scene = num;
        this.eventType = str;
        this.algorithmParams = str2;
    }
}
