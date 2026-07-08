package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AdVideoContent {

    @C09CT("ads_req_id")
    public final String adsReqId;

    @C09CT("ads_task_id")
    public final String adsTaskId;

    @C09CT("next_ads_req_id")
    public final String nextAdsReqId;

    @C09CT("ads_entrance_id")
    public final String preAdsReqId;

    @C09CT("videos")
    public final List<CommonVideo> videos;

    public AdVideoContent() {
        this(new ArrayList(), null, null, null, null);
    }

    public AdVideoContent(List<CommonVideo> list, String str, String str2, String str3, String str4) {
        this.videos = list;
        this.adsTaskId = str;
        this.preAdsReqId = str2;
        this.adsReqId = str3;
        this.nextAdsReqId = str4;
    }
}
