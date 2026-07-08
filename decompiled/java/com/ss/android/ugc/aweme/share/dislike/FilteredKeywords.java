package com.ss.android.ugc.aweme.share.dislike;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FilteredKeywords extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("word_count")
    public final int counts;

    @C09CT("word_list")
    public final List<Keyword> list;

    public FilteredKeywords() {
        this(0, null, 3, null);
    }

    public final FilteredKeywords copy(int i, List<Keyword> list) {
        return new FilteredKeywords(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilteredKeywords)) {
            return false;
        }
        FilteredKeywords filteredKeywords = (FilteredKeywords) obj;
        return this.counts == filteredKeywords.counts && Intrinsics.LJFF(this.list, filteredKeywords.list);
    }

    public int hashCode() {
        return (this.counts * 31) + this.list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilteredKeywords(counts=");
        sbLIZ.append(this.counts);
        sbLIZ.append(", list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCounts() {
        return this.counts;
    }

    public final List<Keyword> getList() {
        return this.list;
    }

    public FilteredKeywords(int i, List<Keyword> list) {
        this.counts = i;
        this.list = list;
    }

    public FilteredKeywords(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
