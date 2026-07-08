package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductTile {

    @C09CT("add_to_cart_button")
    public final AddToCartButtonInfo addToCartButton;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("cart_button")
    public final PdpProductCardButton cartButton;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("cover")
    public final Image cover;

    @C09CT("cover_label")
    public final CoverLabel coverLabel;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("ui_config")
    public final RecommendFeedUiConfig feedUiConfig;

    @C09CT("product_id")
    public final String id;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("pdp_schema")
    public final String pdpSchema;

    @C09CT("placement_labels")
    public final List<PlacementLabelInfo> placementLabels;

    @C09CT("price")
    public final SinglePriceItem price;

    @C09CT("rich_title")
    public final ECRichText richTextTitle;

    @C09CT("seller")
    public final SellerInfo seller;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("sku_ids")
    public final List<String> skuIds;

    @C09CT("bcm_standard_track")
    public final BCMStandardTrack standardEvent;

    @C09CT("tag_list")
    public final List<TagInfo> tagList;

    @C09CT("title")
    public final String title;

    public ProductTile(String str, String str2, Image image, String str3, SinglePriceItem singlePriceItem, AddToCartButtonInfo addToCartButtonInfo, List<String> list, List<TagInfo> list2, List<PlacementLabelInfo> list3, BCMStandardTrack bCMStandardTrack, String str4, SellerInfo sellerInfo, String str5, String str6, Integer num, String str7, ECRichText eCRichText, String str8, PdpProductCardButton pdpProductCardButton, RecommendFeedUiConfig recommendFeedUiConfig, CoverLabel coverLabel) {
        this.id = str;
        this.pdpSchema = str2;
        this.cover = image;
        this.title = str3;
        this.price = singlePriceItem;
        this.addToCartButton = addToCartButtonInfo;
        this.skuIds = list;
        this.tagList = list2;
        this.placementLabels = list3;
        this.standardEvent = bCMStandardTrack;
        this.logExtra = str4;
        this.seller = sellerInfo;
        this.sellerId = str5;
        this.chainKey = str6;
        this.bizType = num;
        this.daInfo = str7;
        this.richTextTitle = eCRichText;
        this.btmCode = str8;
        this.cartButton = pdpProductCardButton;
        this.feedUiConfig = recommendFeedUiConfig;
        this.coverLabel = coverLabel;
    }
}
