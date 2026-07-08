package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class TabOrder implements Serializable {

    @C09CT("prefer_index")
    public final int preferIndex;

    @C09CT("should_specified_in_dynamic_tab")
    public final int shouldSpecifiedInDynamicTab;

    @C09CT("tab_name")
    public final String tabName;

    public TabOrder() {
        this("", -1, 0);
    }

    public TabOrder(String str, int i, int i2) {
        this.tabName = str;
        this.preferIndex = i;
        this.shouldSpecifiedInDynamicTab = i2;
    }
}
