package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class GetFypAffiliateInfoRequest implements Serializable {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("product_id")
    public final List<String> productId;

    @C09CT("valid_scene_list")
    public final List<String> validSceneList;

    @C09CT("video_id")
    public final String videoId;

    public GetFypAffiliateInfoRequest() {
        this(null, null, null, null);
    }

    public GetFypAffiliateInfoRequest(List<String> list, String str, String str2, List<String> list2) {
        this.productId = list;
        this.videoId = str;
        this.enterFrom = str2;
        this.validSceneList = list2;
    }
}
