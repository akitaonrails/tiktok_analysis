package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class GetPudoAddressRequest {

    @C09CT("order_data")
    public final OrderData orderData;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public GetPudoAddressRequest() {
        this(null, null, null);
    }

    public GetPudoAddressRequest(Integer num, String str, OrderData orderData) {
        this.scene = num;
        this.preLogId = str;
        this.orderData = orderData;
    }
}
