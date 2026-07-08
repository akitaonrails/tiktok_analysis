package com.ss.android.ugc.aweme.search;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabList implements Serializable {

    @C09CT("specified_tab_order_list")
    public final List<SearchTabInfo> specifiedTabOrderList;

    @C09CT("tab_list")
    public List<SearchTabInfo> tabList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTabList)) {
            return false;
        }
        SearchTabList searchTabList = (SearchTabList) obj;
        return Intrinsics.LJFF(this.tabList, searchTabList.tabList) && Intrinsics.LJFF(this.specifiedTabOrderList, searchTabList.specifiedTabOrderList);
    }

    public SearchTabList() {
        this(new ArrayList(), new ArrayList());
    }

    public final void setTabList(List<SearchTabInfo> list) {
        this.tabList = list;
    }

    public SearchTabList(List<SearchTabInfo> list, List<SearchTabInfo> list2) {
        this.tabList = list;
        this.specifiedTabOrderList = list2;
    }
}
