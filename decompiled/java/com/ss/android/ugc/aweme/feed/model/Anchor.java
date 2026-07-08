package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Anchor implements Serializable {

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("anchor_info")
    public AnchorCommonStruct anchorInfo;

    @C09CT("shop_link")
    public AnchorShopLinkStruct shopLinkStruct;

    @C09CT("wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    @C09CT("show_type")
    public Integer showType = 0;

    @C09CT("business_type")
    public Integer businessType = 0;

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo) {
        this.wikipediaInfo = wikipediaInfo;
    }
}
