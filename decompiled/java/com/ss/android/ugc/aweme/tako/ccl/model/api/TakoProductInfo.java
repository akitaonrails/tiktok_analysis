package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProductInfo {

    @C09CT("have_more")
    public final boolean hasMore;

    @C09CT("goods")
    public List<TakoProductItem> items;

    public TakoProductInfo() {
        this(null, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoProductInfo)) {
            return false;
        }
        TakoProductInfo takoProductInfo = (TakoProductInfo) obj;
        return Intrinsics.LJFF(this.items, takoProductInfo.items) && this.hasMore == takoProductInfo.hasMore;
    }

    public TakoProductInfo(List<TakoProductItem> list, boolean z) {
        this.items = list;
        this.hasMore = z;
    }

    public TakoProductInfo(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
