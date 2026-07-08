package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GetShippingAddressRequest {

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("change_addr_order_id")
    public final String changeAddrOrderId;

    @C09CT("change_addr_order_type")
    public final Integer changeAddrOrderType;

    @C09CT("client_template")
    public final Integer clientTemplate;

    @C09CT("from_incentive")
    public final Boolean fromIncentive;

    @C09CT("incentive_record_id")
    public final String incentiveRecordId;

    @C09CT("order_skus")
    public final List<AddressSku> orderSkus;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("scene_params_str")
    public final String sceneParamsStr;

    public GetShippingAddressRequest(Integer num, String str, Boolean bool, String str2, List<AddressSku> list, Integer num2, String str3, Integer num3, Integer num4, String str4) {
        this.changeAddrOrderType = num;
        this.changeAddrOrderId = str;
        this.fromIncentive = bool;
        this.incentiveRecordId = str2;
        this.orderSkus = list;
        this.scene = num2;
        this.sceneParamsStr = str3;
        this.addressEntranceScene = num3;
        this.clientTemplate = num4;
        this.preLogId = str4;
    }
}
