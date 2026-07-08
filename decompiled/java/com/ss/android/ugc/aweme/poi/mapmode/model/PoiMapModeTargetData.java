package com.ss.android.ugc.aweme.poi.mapmode.model;

import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeTargetData implements Serializable {
    public final String targetPoiId;
    public final PoiLocation targetPoiLocation;

    public PoiMapModeTargetData(String str, PoiLocation poiLocation) {
        this.targetPoiId = str;
        this.targetPoiLocation = poiLocation;
    }
}
