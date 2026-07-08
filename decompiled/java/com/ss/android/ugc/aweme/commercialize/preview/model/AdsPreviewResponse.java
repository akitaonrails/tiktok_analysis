package com.ss.android.ugc.aweme.commercialize.preview.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AdsPreviewResponse implements Serializable {

    @C09CT("ad_ids")
    public final List<String> adIds;

    @C09CT("creative_ids")
    public final List<String> creativeIds;

    @C09CT("status_code")
    public final int statusCode;

    public AdsPreviewResponse(int i, List<String> list, List<String> list2) {
        this.statusCode = i;
        this.adIds = list;
        this.creativeIds = list2;
    }
}
