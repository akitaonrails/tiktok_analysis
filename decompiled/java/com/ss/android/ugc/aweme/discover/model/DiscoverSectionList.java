package com.ss.android.ugc.aweme.discover.model;

import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class DiscoverSectionList implements Serializable {
    public final int cursor;
    public final boolean hasMore;
    public boolean isCache;
    public final List<DiscoverSectionItem> sections;

    public DiscoverSectionList() {
        this(null, 0, false, false, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverSectionList)) {
            return false;
        }
        DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj;
        return Intrinsics.LJFF(this.sections, discoverSectionList.sections) && this.cursor == discoverSectionList.cursor && this.hasMore == discoverSectionList.hasMore && this.isCache == discoverSectionList.isCache;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverSectionList(List<? extends DiscoverSectionItem> list, int i, boolean z, boolean z2) {
        this.sections = list;
        this.cursor = i;
        this.hasMore = z;
        this.isCache = z2;
    }

    public DiscoverSectionList(List list, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }
}
