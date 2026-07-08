package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicNavBarCollectClickEventData implements Serializable {

    @C09CT("collected_icon")
    public final String collectedIcon;

    @C09CT("uncollected_icon")
    public final String unCollectedIcon;

    public PoiDynamicNavBarCollectClickEventData() {
        this(null, null);
    }

    public PoiDynamicNavBarCollectClickEventData(String str, String str2) {
        this.collectedIcon = str;
        this.unCollectedIcon = str2;
    }
}
