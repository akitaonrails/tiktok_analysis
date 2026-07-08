package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LiveProduct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("product_status")
    public final int productStatus;

    public static final class Companion {
    }

    public LiveProduct() {
        this(0);
    }

    public LiveProduct(int i) {
        this.productStatus = i;
    }
}
