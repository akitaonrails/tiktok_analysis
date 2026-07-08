package com.ss.android.ugc.aweme.ecommerce.search.vision.record.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class SysRecommendProduct {

    @C09CT("bcm_standard_track")
    public final BcmStandardTrackEvent bcmStandardTrackEvent;

    @C09CT("images")
    public final List<Image> images;

    @C09CT("product_id")
    public final String productId;

    @C09CT("title")
    public final String title;

    public SysRecommendProduct(String str, String str2, List<Image> list, BcmStandardTrackEvent bcmStandardTrackEvent) {
        this.productId = str;
        this.title = str2;
        this.images = list;
        this.bcmStandardTrackEvent = bcmStandardTrackEvent;
    }
}
