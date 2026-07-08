package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class GetShopShowcaseInfoRequest implements Serializable {

    @C09CT("group_id")
    public final String groupId;

    @C09CT("group_subtitle")
    public final String groupSubTitle;

    @C09CT("group_title")
    public final String groupTitle;

    @C09CT("group_type")
    public final Integer groupType;

    @C09CT("page_id")
    public final String pageId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("shop_showcase_extra_info")
    public final String shopShowcaseExtraInfo;

    public GetShopShowcaseInfoRequest() {
        this(null, null, null, null, null, null, null);
    }

    public GetShopShowcaseInfoRequest(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
        this.sellerId = str;
        this.groupType = num;
        this.groupId = str2;
        this.groupTitle = str3;
        this.groupSubTitle = str4;
        this.shopShowcaseExtraInfo = str5;
        this.pageId = str6;
    }
}
