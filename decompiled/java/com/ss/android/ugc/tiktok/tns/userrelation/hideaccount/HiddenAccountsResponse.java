package com.ss.android.ugc.tiktok.tns.userrelation.hideaccount;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HiddenAccountsResponse extends BaseResponse implements Serializable {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("hide_items")
    public final List<HiddenItem> hiddenItems;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public HiddenAccountsResponse() {
        this(false, null, "");
    }

    public final HiddenAccountsResponse copy(boolean z, List<HiddenItem> list, String str) {
        return new HiddenAccountsResponse(z, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenAccountsResponse)) {
            return false;
        }
        HiddenAccountsResponse hiddenAccountsResponse = (HiddenAccountsResponse) obj;
        return this.hasMore == hiddenAccountsResponse.hasMore && Intrinsics.LJFF(this.hiddenItems, hiddenAccountsResponse.hiddenItems) && Intrinsics.LJFF(this.nextPageToken, hiddenAccountsResponse.nextPageToken);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.hasMore) * 31;
        List<HiddenItem> list = this.hiddenItems;
        return ((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + this.nextPageToken.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HiddenAccountsResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", hiddenItems=");
        sbLIZ.append(this.hiddenItems);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<HiddenItem> getHiddenItems() {
        return this.hiddenItems;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public HiddenAccountsResponse(boolean z, List<HiddenItem> list, String str) {
        this.hasMore = z;
        this.hiddenItems = list;
        this.nextPageToken = str;
    }
}
