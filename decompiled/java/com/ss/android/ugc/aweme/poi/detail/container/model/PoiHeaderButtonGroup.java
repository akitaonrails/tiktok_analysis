package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderButtonGroup implements Serializable {

    @C09CT("button_list")
    public final List<PoiButton> buttonList;

    public PoiHeaderButtonGroup() {
        this(null);
    }

    public PoiHeaderButtonGroup(List<PoiButton> list) {
        this.buttonList = list;
    }
}
