package com.ss.android.ugc.aweme.poi.videopublish;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishModel {
    public final String enterFrom;
    public final String enterMethod;
    public final String logId;
    public final PoiData poiItem;
    public final PoiMobParam poiMobParams;
    public final String searchId;
    public final int useSessionCache;

    public PoiPublishModel() {
        this(null, null, null, null, 0, null, null);
    }

    public PoiPublishModel(PoiData poiData, String str, String str2, String str3, int i, String str4, PoiMobParam poiMobParam) {
        this.poiItem = poiData;
        this.enterMethod = str;
        this.logId = str2;
        this.searchId = str3;
        this.useSessionCache = i;
        this.enterFrom = str4;
        this.poiMobParams = poiMobParam;
    }
}
