package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class CancelOrderRequest {
    public String LIZ;

    @C09CT("cancel_reason")
    public final String cancelReason;

    @C09CT("combo_id")
    public final String comboId;

    @C09CT("main_order_id")
    public final String mainOrderId;

    @C09CT("reverse_type")
    public final Integer reverseType;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public CancelOrderRequest() {
        this(null, null, null, null, null);
    }

    public CancelOrderRequest(String str, String str2, String str3, Integer num, Integer num2) {
        this.mainOrderId = str;
        this.comboId = str2;
        this.cancelReason = str3;
        this.reverseType = num;
        this.scene = num2;
    }
}
