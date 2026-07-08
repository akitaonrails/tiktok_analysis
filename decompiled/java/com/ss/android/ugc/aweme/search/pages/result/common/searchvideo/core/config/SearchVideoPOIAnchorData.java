package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchVideoPOIAnchorData implements Serializable {
    public static final int $stable = 8;

    @C09CT("show_search_poi_anchor")
    public boolean showSearchPoiAnchor;

    public SearchVideoPOIAnchorData() {
        this(false);
    }

    public SearchVideoPOIAnchorData(boolean z) {
        this.showSearchPoiAnchor = z;
    }

    public final void setShowSearchPoiAnchor(boolean z) {
        this.showSearchPoiAnchor = z;
    }
}
