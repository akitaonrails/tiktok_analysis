package com.ss.android.ugc.aweme.discover.viewmodel;

import X.C1761680vwc;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendsTabState implements ICommonListState<DiscoverSectionItem> {
    public final boolean cacheThenFetch;
    public final boolean canScrollVertically;
    public final String categoryIdBeingViewed;
    public final boolean isTabHidden;
    public final ListState<DiscoverSectionItem, C1761680vwc> substate;

    public TrendsTabState() {
        this(false, new ListState(new C1761680vwc(2), null, null, null, null, 30, null), false, "", false);
    }

    public final TrendsTabState copy(boolean z, ListState<DiscoverSectionItem, C1761680vwc> listState, boolean z2, String str, boolean z3) {
        return new TrendsTabState(z, listState, z2, str, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendsTabState)) {
            return false;
        }
        TrendsTabState trendsTabState = (TrendsTabState) obj;
        return this.cacheThenFetch == trendsTabState.cacheThenFetch && Intrinsics.LJFF(this.substate, trendsTabState.substate) && this.isTabHidden == trendsTabState.isTabHidden && Intrinsics.LJFF(this.categoryIdBeingViewed, trendsTabState.categoryIdBeingViewed) && this.canScrollVertically == trendsTabState.canScrollVertically;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.cacheThenFetch) * 31) + this.substate.hashCode()) * 31) + C786410Ut5.Z2(this.isTabHidden)) * 31) + this.categoryIdBeingViewed.hashCode()) * 31) + C786410Ut5.Z2(this.canScrollVertically);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendsTabState(cacheThenFetch=");
        sbLIZ.append(this.cacheThenFetch);
        sbLIZ.append(", substate=");
        sbLIZ.append(this.substate);
        sbLIZ.append(", isTabHidden=");
        sbLIZ.append(this.isTabHidden);
        sbLIZ.append(", categoryIdBeingViewed=");
        sbLIZ.append(this.categoryIdBeingViewed);
        sbLIZ.append(", canScrollVertically=");
        sbLIZ.append(this.canScrollVertically);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getCacheThenFetch() {
        return this.cacheThenFetch;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final String getCategoryIdBeingViewed() {
        return this.categoryIdBeingViewed;
    }

    public final boolean isTabHidden() {
        return this.isTabHidden;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState<DiscoverSectionItem, C1761680vwc> getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public NestedState<ListState<DiscoverSectionItem, C1761680vwc>> newSubstate(ListState<DiscoverSectionItem, C1761680vwc> listState) {
        return copy(this.cacheThenFetch, listState, this.isTabHidden, this.categoryIdBeingViewed, this.canScrollVertically);
    }

    public TrendsTabState(boolean z, ListState<DiscoverSectionItem, C1761680vwc> listState, boolean z2, String str, boolean z3) {
        this.cacheThenFetch = z;
        this.substate = listState;
        this.isTabHidden = z2;
        this.categoryIdBeingViewed = str;
        this.canScrollVertically = z3;
    }
}
