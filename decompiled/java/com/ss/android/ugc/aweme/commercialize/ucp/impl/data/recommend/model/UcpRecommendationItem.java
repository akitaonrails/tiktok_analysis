package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpRecommendationItem implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String _id;

    @C09CT("external_product_id")
    public final String _productId;

    @C09CT("protocol_type")
    public final Integer _protocolType;

    @C09CT("shop_id")
    public final String _tiktokShopId;

    @C09CT("spu_id")
    public final String _tiktokSpuId;

    @C09CT("title")
    public final String _title;

    @C09CT("channel_name")
    public final String channelName;

    @C09CT("current_price")
    public final Double currentPrice;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("original_price")
    public final Double originalPrice;

    @C09CT("pdp_supplement_data")
    public final PdpSupplementData pdpSupplementData;

    @C09CT("promotion_label")
    public final String promotionLabel;

    @C09CT("rating")
    public final Double rating;

    @C09CT("review_count")
    public final Integer reviewCount;

    @C09CT("shop_domain")
    public final String shopDomain;

    @C09CT("source")
    public final String source;

    @C09CT("tag")
    public final String tag;

    @C09CT("shop_name")
    public final String tiktokShopName;

    @C09CT("spu_image_url")
    public final String tiktokSpuImage;

    @C09CT("spu_name")
    public final String tiktokSpuName;

    @C09CT("url")
    public final String url;

    public final UcpRecommendationItem copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d, Double d2, Double d3, Integer num2, String str13, String str14, String str15, PdpSupplementData pdpSupplementData) {
        return new UcpRecommendationItem(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, d, d2, d3, num2, str13, str14, str15, pdpSupplementData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpRecommendationItem)) {
            return false;
        }
        UcpRecommendationItem ucpRecommendationItem = (UcpRecommendationItem) obj;
        return Intrinsics.LJFF(this._protocolType, ucpRecommendationItem._protocolType) && Intrinsics.LJFF(this._id, ucpRecommendationItem._id) && Intrinsics.LJFF(this._productId, ucpRecommendationItem._productId) && Intrinsics.LJFF(this._tiktokSpuId, ucpRecommendationItem._tiktokSpuId) && Intrinsics.LJFF(this.tiktokSpuName, ucpRecommendationItem.tiktokSpuName) && Intrinsics.LJFF(this.tiktokSpuImage, ucpRecommendationItem.tiktokSpuImage) && Intrinsics.LJFF(this._tiktokShopId, ucpRecommendationItem._tiktokShopId) && Intrinsics.LJFF(this.tiktokShopName, ucpRecommendationItem.tiktokShopName) && Intrinsics.LJFF(this.shopDomain, ucpRecommendationItem.shopDomain) && Intrinsics.LJFF(this.url, ucpRecommendationItem.url) && Intrinsics.LJFF(this.channelName, ucpRecommendationItem.channelName) && Intrinsics.LJFF(this._title, ucpRecommendationItem._title) && Intrinsics.LJFF(this.imageUrl, ucpRecommendationItem.imageUrl) && Intrinsics.LJFF(this.currentPrice, ucpRecommendationItem.currentPrice) && Intrinsics.LJFF(this.originalPrice, ucpRecommendationItem.originalPrice) && Intrinsics.LJFF(this.rating, ucpRecommendationItem.rating) && Intrinsics.LJFF(this.reviewCount, ucpRecommendationItem.reviewCount) && Intrinsics.LJFF(this.tag, ucpRecommendationItem.tag) && Intrinsics.LJFF(this.promotionLabel, ucpRecommendationItem.promotionLabel) && Intrinsics.LJFF(this.source, ucpRecommendationItem.source) && Intrinsics.LJFF(this.pdpSupplementData, ucpRecommendationItem.pdpSupplementData);
    }

    public int hashCode() {
        Integer num = this._protocolType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this._id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._productId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._tiktokSpuId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tiktokSpuName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tiktokSpuImage;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._tiktokShopId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tiktokShopName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shopDomain;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.channelName;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this._title;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.imageUrl;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Double d = this.currentPrice;
        int iHashCode14 = (iHashCode13 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.originalPrice;
        int iHashCode15 = (iHashCode14 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.rating;
        int iHashCode16 = (iHashCode15 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.reviewCount;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.tag;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.promotionLabel;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.source;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        PdpSupplementData pdpSupplementData = this.pdpSupplementData;
        return iHashCode20 + (pdpSupplementData != null ? pdpSupplementData.hashCode() : 0);
    }

    public String toString() {
        return "UcpRecommendationItem(_protocolType=" + this._protocolType + ", _id=" + this._id + ", _productId=" + this._productId + ", _tiktokSpuId=" + this._tiktokSpuId + ", tiktokSpuName=" + this.tiktokSpuName + ", tiktokSpuImage=" + this.tiktokSpuImage + ", _tiktokShopId=" + this._tiktokShopId + ", tiktokShopName=" + this.tiktokShopName + ", shopDomain=" + this.shopDomain + ", url=" + this.url + ", channelName=" + this.channelName + ", _title=" + this._title + ", imageUrl=" + this.imageUrl + ", currentPrice=" + this.currentPrice + ", originalPrice=" + this.originalPrice + ", rating=" + this.rating + ", reviewCount=" + this.reviewCount + ", tag=" + this.tag + ", promotionLabel=" + this.promotionLabel + ", source=" + this.source + ", pdpSupplementData=" + this.pdpSupplementData + ')';
    }

    public final String getId() {
        String str = this._id;
        return str == null ? "" : str;
    }

    public final String getProductId() {
        String str = this._productId;
        return str == null ? "" : str;
    }

    public final int getProtocolType() {
        Integer num = this._protocolType;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getTiktokShopId() {
        String str = this._tiktokShopId;
        return str == null ? "" : str;
    }

    public final String getTiktokSpuId() {
        String str = this._tiktokSpuId;
        return str == null ? "" : str;
    }

    public final String getTitle() {
        String str = this._title;
        return str == null ? "" : str;
    }

    public final String getUniqueId() {
        if (getProtocolType() == 1) {
            String tiktokSpuId = getTiktokSpuId();
            return a0.LJJJIL(tiktokSpuId) ? getProductId() : tiktokSpuId;
        }
        String productId = getProductId();
        return a0.LJJJIL(productId) ? getTiktokSpuId() : productId;
    }

    public UcpRecommendationItem(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d, Double d2, Double d3, Integer num2, String str13, String str14, String str15, PdpSupplementData pdpSupplementData) {
        this._protocolType = num;
        this._id = str;
        this._productId = str2;
        this._tiktokSpuId = str3;
        this.tiktokSpuName = str4;
        this.tiktokSpuImage = str5;
        this._tiktokShopId = str6;
        this.tiktokShopName = str7;
        this.shopDomain = str8;
        this.url = str9;
        this.channelName = str10;
        this._title = str11;
        this.imageUrl = str12;
        this.currentPrice = d;
        this.originalPrice = d2;
        this.rating = d3;
        this.reviewCount = num2;
        this.tag = str13;
        this.promotionLabel = str14;
        this.source = str15;
        this.pdpSupplementData = pdpSupplementData;
    }
}
