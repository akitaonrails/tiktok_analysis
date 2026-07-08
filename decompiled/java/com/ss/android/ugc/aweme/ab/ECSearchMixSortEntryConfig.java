package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class ECSearchMixSortEntryConfig {

    @C09CT("ec_search_mix_enable")
    public final boolean enable;

    @C09CT("ec_mix_search_load_more_chunk_enable")
    public final boolean enableLoadMoreChunk;

    @C09CT("ec_search_mix_entry")
    public final List<Integer> entryList;

    @C09CT("ec_search_mix_full")
    public final boolean isFull;

    public ECSearchMixSortEntryConfig() {
        this(false, false, null, false, 15, null);
    }

    public ECSearchMixSortEntryConfig(boolean z, boolean z2, List<Integer> list, boolean z3) {
        this.enable = z;
        this.isFull = z2;
        this.entryList = list;
        this.enableLoadMoreChunk = z3;
    }

    public ECSearchMixSortEntryConfig(boolean z, boolean z2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? false : z3);
    }
}
