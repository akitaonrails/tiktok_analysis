package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductEnterContext implements Serializable {

    @C09CT("enter_source_id")
    public final String enterSourceId;

    @C09CT("enter_source_type")
    public final Integer enterSourceType;

    public ProductEnterContext() {
        this(2, null);
    }

    public ProductEnterContext(Integer num, String str) {
        this.enterSourceType = num;
        this.enterSourceId = str;
    }
}
