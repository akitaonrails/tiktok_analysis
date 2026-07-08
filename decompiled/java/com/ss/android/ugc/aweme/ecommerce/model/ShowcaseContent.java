package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ShowcaseContent implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("ec_anchor_info")
    public final ECAnchorInfo ecAnchorInfo;

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

    @C09CT("product_id_list")
    public final List<String> productIdList;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("shop_showcase_schema_full_screen")
    public final String shopShowcaseSchemaFullScreen;

    @C09CT("shop_showcase_schema_full_screen_list")
    public final List<String> shopShowcaseSchemaFullScreenList;

    @C09CT("shop_showcase_schema_half_screen")
    public final String shopShowcaseSchemaHalfScreen;

    @C09CT("shop_showcase_schema_half_screen_list")
    public final List<String> shopShowcaseSchemaHalfScreenList;

    @C09CT("shop_showcase_title")
    public final String shopShowcaseTitle;

    public ShowcaseContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public ShowcaseContent(List<String> list, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ECAnchorInfo eCAnchorInfo, List<String> list2, List<String> list3, String str9) {
        this.productIdList = list;
        this.sellerId = str;
        this.groupType = num;
        this.groupId = str2;
        this.groupTitle = str3;
        this.groupSubTitle = str4;
        this.shopShowcaseSchemaHalfScreen = str5;
        this.shopShowcaseSchemaFullScreen = str6;
        this.pageId = str7;
        this.shopShowcaseTitle = str8;
        this.ecAnchorInfo = eCAnchorInfo;
        this.shopShowcaseSchemaHalfScreenList = list2;
        this.shopShowcaseSchemaFullScreenList = list3;
        this.daInfo = str9;
    }
}
