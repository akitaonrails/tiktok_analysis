package com.ss.android.ugc.aweme.ecommerce.action;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class EcommerceActionDto {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("enable")
    public final String enable;

    @C09CT("name")
    public final String name;

    @C09CT("next")
    public final EcommerceActionNextDto next;

    @C09CT("params")
    public final String params;

    @C09CT("return_key")
    public final String returnKey;

    public EcommerceActionDto() {
        this(null, null, null, null, null);
    }

    public EcommerceActionDto(String str, String str2, String str3, String str4, EcommerceActionNextDto ecommerceActionNextDto) {
        this.name = str;
        this.enable = str2;
        this.params = str3;
        this.returnKey = str4;
        this.next = ecommerceActionNextDto;
    }
}
