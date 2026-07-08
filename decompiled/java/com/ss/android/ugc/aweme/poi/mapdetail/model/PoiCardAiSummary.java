package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCardAiSummary implements Serializable {

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("recommendation_text")
    public final String recommendationText;

    public PoiCardAiSummary() {
        this(null, null);
    }

    public PoiCardAiSummary(String str, DynamicIcon dynamicIcon) {
        this.recommendationText = str;
        this.icon = dynamicIcon;
    }
}
