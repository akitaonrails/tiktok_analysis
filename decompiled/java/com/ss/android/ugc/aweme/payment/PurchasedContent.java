package com.ss.android.ugc.aweme.payment;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasedContent implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_infos")
    public final List<Object> awemeInfos;

    public PurchasedContent(List<Object> list) {
        this.awemeInfos = list;
    }
}
