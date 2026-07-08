package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class ActionBarItemList {

    @C09CT("action_bar_list")
    public final List<NewActionBarItem> actionBarList;

    public ActionBarItemList() {
        this(null, 1, null);
    }

    public ActionBarItemList(List<NewActionBarItem> list) {
        this.actionBarList = list;
    }

    public ActionBarItemList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
