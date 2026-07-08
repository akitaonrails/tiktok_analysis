package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckShippingAddressRequest {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public CheckShippingAddressRequest(Address address, Integer num, Integer num2, String str) {
        this.address = address;
        this.scene = num;
        this.addressEntranceScene = num2;
        this.preLogId = str;
    }
}
