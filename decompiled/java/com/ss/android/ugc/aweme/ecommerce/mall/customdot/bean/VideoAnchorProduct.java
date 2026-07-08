package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoAnchorProduct {

    @C09CT("bcm_standard_track")
    public final BcmStandardTrackData bcmStandardTrack;

    @C09CT("product_id")
    public final String productId;

    public VideoAnchorProduct(String str, BcmStandardTrackData bcmStandardTrackData) {
        this.productId = str;
        this.bcmStandardTrack = bcmStandardTrackData;
    }
}
