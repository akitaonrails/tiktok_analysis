package com.shopify.checkout.models.errors;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum DefaultsErrorCode {
    EmptyDefaults("empty_defaults"),
    NonUniqueAddressReferenceIds("non_unique_address_reference_ids"),
    AddressMissingCountry("partial_address_missing_country_code");

    public final String LL;

    public static DefaultsErrorCode valueOf(String str) {
        return (DefaultsErrorCode) C08FF.LIZ(DefaultsErrorCode.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    DefaultsErrorCode(String str) {
        this.LL = str;
    }
}
