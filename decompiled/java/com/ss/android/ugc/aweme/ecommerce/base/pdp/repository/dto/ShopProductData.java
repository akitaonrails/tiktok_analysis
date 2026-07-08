package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopProductData {

    @C09CT("add_to_cart_button")
    public final AddToCartButtonInfo addToCartButton;

    @C09CT("biz_type")
    public final int bizType;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("cover")
    public final CoverData cover;

    @C09CT("product_id")
    public final String id;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("pdp_schema")
    public final String pdpSchema;

    @C09CT("placement_labels")
    public final List<PlacementLabelInfo> placementLabels;

    @C09CT("price")
    public final PriceInfo price;

    @C09CT("seller")
    public final SellerInfo seller;

    @C09CT("sku_ids")
    public final List<String> skuIds;

    @C09CT("bcm_standard_track")
    public final BCMStandardTrack standardEvent;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("tag_list")
    public final List<TagInfo> tagList;

    @C09CT("title")
    public final TitleInfo title;

    public ShopProductData(String str, TitleInfo titleInfo, Integer num, String str2, AddToCartButtonInfo addToCartButtonInfo, List<String> list, CoverData coverData, PriceInfo priceInfo, List<TagInfo> list2, List<PlacementLabelInfo> list3, BCMStandardTrack bCMStandardTrack, String str3, SellerInfo sellerInfo, String str4, int i) {
        this.id = str;
        this.title = titleInfo;
        this.status = num;
        this.pdpSchema = str2;
        this.addToCartButton = addToCartButtonInfo;
        this.skuIds = list;
        this.cover = coverData;
        this.price = priceInfo;
        this.tagList = list2;
        this.placementLabels = list3;
        this.standardEvent = bCMStandardTrack;
        this.logExtra = str3;
        this.seller = sellerInfo;
        this.chainKey = str4;
        this.bizType = i;
    }
}
