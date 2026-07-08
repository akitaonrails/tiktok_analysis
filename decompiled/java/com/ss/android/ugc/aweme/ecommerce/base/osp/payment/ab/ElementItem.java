package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ElementItem {

    @C09CT("element")
    public final String element;

    @C09CT("tip")
    public final String tip;

    public ElementItem() {
        this(null, null);
    }

    public ElementItem(String str, String str2) {
        this.element = str;
        this.tip = str2;
    }
}
