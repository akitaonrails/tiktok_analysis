package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveRequest {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_association")
    public final AddressAssociation addressAssociation;

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("save_address_mode")
    public final Integer mode;

    @C09CT("order_skus")
    public final AddressSku orderSkus;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("save_address_option")
    public final SaveAddressOption saveAddressOption;

    public SaveRequest() {
        this(null, null, 0, null, null, null, null);
    }

    public SaveRequest(Address address, Integer num, Integer num2, SaveAddressOption saveAddressOption, String str, AddressSku addressSku, AddressAssociation addressAssociation) {
        this.address = address;
        this.mode = num;
        this.addressEntranceScene = num2;
        this.saveAddressOption = saveAddressOption;
        this.preLogId = str;
        this.orderSkus = addressSku;
        this.addressAssociation = addressAssociation;
    }
}
