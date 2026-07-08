package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoEnhancedItemInfo {

    @C09CT("have_more")
    public final boolean hasMore;

    @C09CT("items")
    public final List<TakoVideoItem> videoList;

    public TakoEnhancedItemInfo() {
        this(null, false, 3, null);
    }

    public TakoEnhancedItemInfo(List<TakoVideoItem> list, boolean z) {
        this.videoList = list;
        this.hasMore = z;
    }

    public TakoEnhancedItemInfo(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
