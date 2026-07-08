package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CandDetailPlaceRequest {

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("autocomplete_address_id")
    public final String autocompleteAddressId;

    @C09CT("place_detail_source")
    public final String placeDetailSource;

    @C09CT("place_type")
    public final Integer placeType;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("session_key")
    public final String sessionKey;

    @C09CT("shipping_address")
    public final Address shippingAddress;

    @C09CT("target_item_key")
    public final String targetItemKey;

    public CandDetailPlaceRequest(Address address, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5) {
        this.shippingAddress = address;
        this.sessionKey = str;
        this.autocompleteAddressId = str2;
        this.placeType = num;
        this.addressEntranceScene = num2;
        this.preLogId = str3;
        this.targetItemKey = str4;
        this.placeDetailSource = str5;
    }
}
