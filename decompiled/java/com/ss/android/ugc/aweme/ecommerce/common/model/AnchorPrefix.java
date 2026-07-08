package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class AnchorPrefix implements Serializable {

    @C09CT("prefix_type")
    public final Integer prefixType;

    public AnchorPrefix() {
        this(null);
    }

    public AnchorPrefix(Integer num) {
        this.prefixType = num;
    }
}
