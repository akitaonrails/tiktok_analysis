package com.ss.android.ugc.aweme.ecommerce.action;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class EcommerceActionNextDto {

    @C09CT("fail")
    public final Object fail;

    @C09CT("success")
    public final Object success;

    public EcommerceActionNextDto() {
        this(null, null);
    }

    public EcommerceActionNextDto(Object obj, Object obj2) {
        this.success = obj;
        this.fail = obj2;
    }
}
