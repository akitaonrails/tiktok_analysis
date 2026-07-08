package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressValid {

    @C09CT("address_invalid_type")
    public final Integer addressInvalidType;

    @C09CT("invalid_hint_message")
    public final String invalidHintMessage;

    @C09CT("is_valid")
    public final Boolean isValid;

    public AddressValid() {
        this(null, null, null);
    }

    public AddressValid(Boolean bool, String str, Integer num) {
        this.isValid = bool;
        this.invalidHintMessage = str;
        this.addressInvalidType = num;
    }
}
