package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsGalleryMobData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("enter_position")
    public final String enterPosition;

    @C09CT("from_group_id")
    public final String fromGroupId;

    @C09CT("log_id")
    public final String logId;

    public PoiReviewsGalleryMobData() {
        this(null, null, null, null, null, null);
    }

    public PoiReviewsGalleryMobData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.collectInfo = str3;
        this.logId = str4;
        this.fromGroupId = str5;
        this.enterPosition = str6;
    }
}
