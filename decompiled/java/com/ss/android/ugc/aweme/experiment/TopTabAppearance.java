package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopTabAppearance {

    @C09CT("item_view")
    public final TabItemViewConfig item;

    @C09CT("tab_style")
    public final TabStyleConfig style;

    public TopTabAppearance() {
        this(null, null);
    }

    public TopTabAppearance(TabItemViewConfig tabItemViewConfig, TabStyleConfig tabStyleConfig) {
        this.item = tabItemViewConfig;
        this.style = tabStyleConfig;
    }
}
