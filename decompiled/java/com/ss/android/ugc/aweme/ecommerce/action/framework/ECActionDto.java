package com.ss.android.ugc.aweme.ecommerce.action.framework;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ECActionDto {

    @C09CT("enable")
    public final String enable;

    @C09CT("name")
    public final String name;

    @C09CT("next")
    public final ECActionNextDto next;

    @C09CT("params")
    public final String params;

    @C09CT("return_key")
    public final String returnKey;

    public ECActionDto() {
        this(null, null, null, null, null);
    }

    public ECActionDto(String str, String str2, String str3, String str4, ECActionNextDto eCActionNextDto) {
        this.name = str;
        this.enable = str2;
        this.params = str3;
        this.returnKey = str4;
        this.next = eCActionNextDto;
    }
}
