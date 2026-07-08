package com.ss.android.ugc.aweme.search.entry.searchbox.repo;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBoxTimeData {

    @C09CT("last_clicked_time")
    public final long clickedTime;

    @C09CT("showed_time")
    public final List<Long> showedTime;

    public SearchBoxTimeData() {
        this(null, 0L, 3, null);
    }

    public SearchBoxTimeData(List<Long> list, long j) {
        this.showedTime = list;
        this.clickedTime = j;
    }

    public SearchBoxTimeData(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}
