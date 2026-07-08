package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CandInputRequest {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("autocomplete_address_id")
    public final String autocompleteAddressId;

    @C09CT("container_id")
    public final String containerId;

    @C09CT("encrypted_latitude")
    public final String encryptedLatitude;

    @C09CT("encrypted_longitude")
    public final String encryptedLongitude;

    @C09CT("gps_accuracy_level")
    public final Integer gpsAccuracyLevel;

    @C09CT("target_item_key")
    public final String itemKey;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("session_key")
    public final String sessionKey;

    @C09CT("trigger_item_key")
    public final String triggerItemKey;

    public CandInputRequest(String str, Address address, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2) {
        this.itemKey = str;
        this.address = address;
        this.addressEntranceScene = num;
        this.sessionKey = str2;
        this.triggerItemKey = str3;
        this.preLogId = str4;
        this.autocompleteAddressId = str5;
        this.containerId = str6;
        this.keyword = str7;
        this.encryptedLongitude = str8;
        this.encryptedLatitude = str9;
        this.gpsAccuracyLevel = num2;
    }
}
