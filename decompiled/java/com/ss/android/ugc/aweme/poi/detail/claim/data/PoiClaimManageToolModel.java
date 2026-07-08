package com.ss.android.ugc.aweme.poi.detail.claim.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimManageToolModel implements Serializable {

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("click_track")
    public final PoiClaimTrackModel clickTrackModel;

    @C09CT("icon")
    public final String iconUrl;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_track")
    public final PoiClaimTrackModel showTrackModel;

    @C09CT("text")
    public final String text;

    public PoiClaimManageToolModel() {
        this(null, null, null, null, null, null);
    }

    public PoiClaimManageToolModel(String str, String str2, String str3, String str4, PoiClaimTrackModel poiClaimTrackModel, PoiClaimTrackModel poiClaimTrackModel2) {
        this.bizType = str;
        this.iconUrl = str2;
        this.text = str3;
        this.schema = str4;
        this.showTrackModel = poiClaimTrackModel;
        this.clickTrackModel = poiClaimTrackModel2;
    }
}
