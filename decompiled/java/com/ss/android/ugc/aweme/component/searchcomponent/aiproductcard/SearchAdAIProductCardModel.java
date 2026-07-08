package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SearchAdAIProductCardModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("items")
    public final List<AIProductItem> items;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAdAIProductCardModel) && Intrinsics.LJFF(this.items, ((SearchAdAIProductCardModel) obj).items);
    }

    public int hashCode() {
        List<AIProductItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdAIProductCardModel(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchAdAIProductCardModel(List<AIProductItem> list) {
        this.items = list;
    }
}
