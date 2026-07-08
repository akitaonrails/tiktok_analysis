package com.ss.android.ugc.aweme.ecommerce.action.framework;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ECActionNextDto {

    @C09CT("fail")
    public final Object fail;

    @C09CT("success")
    public final Object success;

    @C09CT("trigger")
    public final Object trigger;

    public ECActionNextDto() {
        this(null, null, null);
    }

    public ECActionNextDto(Object obj, Object obj2, Object obj3) {
        this.success = obj;
        this.fail = obj2;
        this.trigger = obj3;
    }
}
