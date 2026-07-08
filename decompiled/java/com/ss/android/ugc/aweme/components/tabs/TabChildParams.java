package com.ss.android.ugc.aweme.components.tabs;

import X.C09CT;
import com.ss.android.ugc.aweme.components.model.Component;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class TabChildParams implements Serializable {
    public static final int $stable = 8;

    @C09CT("components")
    public final List<Component> components;

    @C09CT("tab_title")
    public final String tabTitle;

    public TabChildParams(String str, List<Component> list) {
        this.tabTitle = str;
        this.components = list;
    }
}
