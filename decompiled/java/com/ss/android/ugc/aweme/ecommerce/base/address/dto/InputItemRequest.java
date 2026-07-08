package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class InputItemRequest {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("address_rights_type")
    public final Integer addressRightType;

    @C09CT("district")
    public final Region district;

    @C09CT("input_item_option")
    public final InputItemOption inputItemOption;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("pudo_address_param")
    public final PudoAddressParam pudoAddressParam;

    @C09CT("template_min_version")
    public final String templateMinVersion;

    @C09CT("template_type")
    public final Integer templateType;

    public InputItemRequest(Region region, Integer num, String str, Integer num2, Integer num3, String str2, Address address, InputItemOption inputItemOption, PudoAddressParam pudoAddressParam) {
        this.district = region;
        this.templateType = num;
        this.templateMinVersion = str;
        this.addressRightType = num2;
        this.addressEntranceScene = num3;
        this.preLogId = str2;
        this.address = address;
        this.inputItemOption = inputItemOption;
        this.pudoAddressParam = pudoAddressParam;
    }
}
