package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes25.dex */
public final class ReachControlData {

    @C09CT("is_positive")
    public final Boolean isPositive;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public ReachControlData(Integer num, Boolean bool) {
        this.scene = num;
        this.isPositive = bool;
    }
}
