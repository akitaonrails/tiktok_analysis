package com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2337209Du;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchMixFeedList extends SearchApiResult implements InterfaceC2337209Du {
    public String LL;

    @C09CT("backtrace")
    public final String backTrace;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("data")
    public final List<EcomSearchMixFeed> mItems;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomSearchMixFeedList)) {
            return false;
        }
        EcomSearchMixFeedList ecomSearchMixFeedList = (EcomSearchMixFeedList) obj;
        return Intrinsics.LJFF(this.backTrace, ecomSearchMixFeedList.backTrace) && this.hasMore == ecomSearchMixFeedList.hasMore && this.cursor == ecomSearchMixFeedList.cursor && Intrinsics.LJFF(this.mItems, ecomSearchMixFeedList.mItems);
    }

    public final int hashCode() {
        return (((((this.backTrace.hashCode() * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.cursor) * 31) + this.mItems.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomSearchMixFeedList(backTrace=");
        sbLIZ.append(this.backTrace);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", mItems=");
        sbLIZ.append(this.mItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomSearchMixFeedList() {
        this("", false, 0, new ArrayList());
    }

    @Override // X.InterfaceC2337209Du
    public final void setJsonData(String str) {
        this.LL = str;
    }

    public EcomSearchMixFeedList(String str, boolean z, int i, List<EcomSearchMixFeed> list) {
        this.backTrace = str;
        this.hasMore = z;
        this.cursor = i;
        this.mItems = list;
    }
}
