package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressSelectRequest {

    @C09CT("address_id")
    public final String addressId;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("pudo_address_id")
    public final String pudoAddressId;

    @C09CT("pudo_default")
    public final Boolean pudoDefault;

    @C09CT("pudo_id")
    public final String pudoId;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public ShippingAddressSelectRequest() {
        this(null, 0, null, null, null, null, null);
    }

    public ShippingAddressSelectRequest(String str, int i, String str2, String str3, String str4, Boolean bool, String str5) {
        this.itemId = str;
        this.scene = i;
        this.addressId = str2;
        this.pudoAddressId = str3;
        this.pudoId = str4;
        this.pudoDefault = bool;
        this.preLogId = str5;
    }
}
