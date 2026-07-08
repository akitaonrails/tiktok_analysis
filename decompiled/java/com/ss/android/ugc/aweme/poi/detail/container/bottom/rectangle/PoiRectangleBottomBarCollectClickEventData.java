package com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRectangleBottomBarCollectClickEventData implements Serializable {

    @C09CT("collected_icon")
    public final String collectedIcon;

    @C09CT("collected_text")
    public final String collectedText;

    @C09CT("uncollected_icon")
    public final String unCollectedIcon;

    @C09CT("uncollected_text")
    public final String unCollectedText;

    public PoiRectangleBottomBarCollectClickEventData() {
        this(null, null, null, null);
    }

    public PoiRectangleBottomBarCollectClickEventData(String str, String str2, String str3, String str4) {
        this.collectedIcon = str;
        this.unCollectedIcon = str2;
        this.collectedText = str3;
        this.unCollectedText = str4;
    }
}
