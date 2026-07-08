package com.ss.android.ugc.aweme.ecommerce.search.vision.record.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class SysRecommendFeedItem {

    @C09CT("extra")
    public final Extra extra;

    @C09CT("feed_item_source_type")
    public final int feedItemSourceType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("impression_info")
    public final Object impressionInfo;

    @C09CT("product")
    public final SysRecommendProduct product;

    @C09CT("type")
    public final int type;

    public SysRecommendFeedItem(String str, int i, SysRecommendProduct sysRecommendProduct, Extra extra, int i2, Object obj) {
        this.id = str;
        this.type = i;
        this.product = sysRecommendProduct;
        this.extra = extra;
        this.feedItemSourceType = i2;
        this.impressionInfo = obj;
    }
}
