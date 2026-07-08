package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentMethodTips {

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("tips")
    public final String tips;

    public PaymentMethodTips(String str, String str2) {
        this.tips = str;
        this.scene = str2;
    }
}
