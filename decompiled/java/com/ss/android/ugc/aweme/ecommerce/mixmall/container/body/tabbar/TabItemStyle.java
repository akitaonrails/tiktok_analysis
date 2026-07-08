package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class TabItemStyle {

    @C09CT("inset")
    public List<Float> inset;

    @C09CT("select")
    public TabItemSelect select;

    @C09CT("unselect")
    public TabItemSelect unselect;

    public TabItemStyle() {
        this(null, null, null);
    }

    public TabItemStyle(List<Float> list, TabItemSelect tabItemSelect, TabItemSelect tabItemSelect2) {
        this.inset = list;
        this.select = tabItemSelect;
        this.unselect = tabItemSelect2;
    }
}
