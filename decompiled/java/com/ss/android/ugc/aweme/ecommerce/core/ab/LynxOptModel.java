package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class LynxOptModel {

    @C09CT("async_create_container")
    public final Integer asyncCreateContainer;

    @C09CT("enable_pre_create_container")
    public final Integer enablePreCreateContainer;

    @C09CT("enable_pre_decode")
    public final Integer enablePreDecode;

    @C09CT("enable_reuse_container")
    public final Integer enableReuseContainer;

    @C09CT("enable_skus")
    public final Integer enableSkus;

    @C09CT("pre_create_count")
    public final Integer preCreateCount;

    public LynxOptModel() {
        this(null, null, null, null, null, 1);
    }

    public final boolean LIZ() {
        Integer num = this.asyncCreateContainer;
        return num != null && num.intValue() > 1;
    }

    public final boolean LIZIZ() {
        Integer num = this.enablePreCreateContainer;
        return num != null && num.intValue() == 1;
    }

    public LynxOptModel(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.enablePreDecode = num;
        this.enablePreCreateContainer = num2;
        this.enableReuseContainer = num3;
        this.asyncCreateContainer = num4;
        this.enableSkus = num5;
        this.preCreateCount = num6;
    }
}
