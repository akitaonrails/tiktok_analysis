package com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LabelPopup implements Serializable {

    @C09CT("jump_schema")
    public String jumpSchema;

    public LabelPopup() {
        this(null);
    }

    public LabelPopup(String str) {
        this.jumpSchema = str;
    }
}
