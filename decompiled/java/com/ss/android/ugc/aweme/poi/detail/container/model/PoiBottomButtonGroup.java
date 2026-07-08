package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBottomButtonGroup implements Serializable {

    @C09CT("button_list")
    public final List<PoiButton> buttonList;

    public PoiBottomButtonGroup() {
        this(null);
    }

    public PoiBottomButtonGroup(List<PoiButton> list) {
        this.buttonList = list;
    }
}
