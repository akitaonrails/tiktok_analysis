package com.ss.android.ugc.aweme.search;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabInfo implements Serializable {

    @C09CT("build_by_dynamic_config")
    public final boolean buildByDynamicConfig;

    @C09CT("can_build_by_native")
    public final boolean canBuildByNative;

    @C09CT("pinned_tab_location")
    public int tabFixedPosition;

    @C09CT("tab_name")
    public String tabName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTabInfo)) {
            return false;
        }
        SearchTabInfo searchTabInfo = (SearchTabInfo) obj;
        return Intrinsics.LJFF(this.tabName, searchTabInfo.tabName) && this.tabFixedPosition == searchTabInfo.tabFixedPosition && this.buildByDynamicConfig == searchTabInfo.buildByDynamicConfig && this.canBuildByNative == searchTabInfo.canBuildByNative;
    }

    public SearchTabInfo() {
        this("", -1, false, false);
    }

    public final void setTabFixedPosition(int i) {
        this.tabFixedPosition = i;
    }

    public final void setTabName(String str) {
        this.tabName = str;
    }

    public SearchTabInfo(String str, int i, boolean z, boolean z2) {
        this.tabName = str;
        this.tabFixedPosition = i;
        this.buildByDynamicConfig = z;
        this.canBuildByNative = z2;
    }
}
