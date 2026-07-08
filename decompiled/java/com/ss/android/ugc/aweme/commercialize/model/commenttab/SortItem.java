package com.ss.android.ugc.aweme.commercialize.model.commenttab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class SortItem implements Serializable {

    @C09CT("name")
    public final String name;

    @C09CT("order_type")
    public final int orderType;

    public SortItem() {
        this("relevant", 0);
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public SortItem(String str, int i) {
        this.name = str;
        this.orderType = i;
    }
}
