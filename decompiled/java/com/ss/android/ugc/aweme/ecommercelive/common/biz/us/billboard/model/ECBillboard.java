package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.EnumC0289007z;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ECBillboard {
    public final Boolean LIZ;

    @C09CT("auction_config")
    public final AuctionConfig auctionConfig;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("big_sale_config")
    public final BigSaleConfig bigSaleConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String billboardId;

    @C09CT("type")
    public final Integer billboardType;

    @C09CT("c_schema")
    public final String cSchema;

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("icon")
    public final Image icon;

    @C09CT("image_config")
    public final BigSaleConfig imageConfig;

    @C09CT("product_config")
    public final ProductConfig productConfig;

    @C09CT("promotion_config")
    public final PromotionConfig promotionConfig;

    @C09CT("schema")
    public final String schema;

    @C09CT("sub_icon")
    public final Image subIcon;

    @C09CT("support_auto_set")
    public final Boolean supportAutoSet;

    @C09CT("title")
    public final String title;

    @C09CT("trigger_source")
    public final Integer triggerSource;

    @C09CT("ui_type")
    public final Integer uiType;

    public ECBillboard() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        String str = this.billboardId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.billboardType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.uiType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PromotionConfig promotionConfig = this.promotionConfig;
        int iHashCode6 = (iHashCode5 + (promotionConfig == null ? 0 : promotionConfig.hashCode())) * 31;
        BigSaleConfig bigSaleConfig = this.bigSaleConfig;
        int iHashCode7 = (iHashCode6 + (bigSaleConfig == null ? 0 : bigSaleConfig.hashCode())) * 31;
        BigSaleConfig bigSaleConfig2 = this.imageConfig;
        int iHashCode8 = (iHashCode7 + (bigSaleConfig2 == null ? 0 : bigSaleConfig2.hashCode())) * 31;
        ProductConfig productConfig = this.productConfig;
        int iHashCode9 = (iHashCode8 + (productConfig == null ? 0 : productConfig.hashCode())) * 31;
        AuctionConfig auctionConfig = this.auctionConfig;
        int iHashCode10 = (iHashCode9 + (auctionConfig == null ? 0 : auctionConfig.hashCode())) * 31;
        String str4 = this.cSchema;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.supportAutoSet;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.triggerSource;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.LIZ;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Image image = this.icon;
        int iHashCode15 = (iHashCode14 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.subIcon;
        int iHashCode16 = (iHashCode15 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str5 = this.schema;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, Object> map = this.daInfo;
        return iHashCode17 + (map != null ? map.hashCode() : 0);
    }

    public final boolean LIZ() {
        Integer num = this.billboardType;
        return num != null && num.intValue() == EnumC0289007z.HOT_SELL.getValue();
    }

    public final boolean LIZIZ() {
        Integer num = this.billboardType;
        return num != null && num.intValue() == EnumC0289007z.MARKETING.getValue();
    }

    public final String LIZJ(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                return "";
            }
            return this.cSchema;
        }
        return this.schema;
    }

    public ECBillboard(String str, String str2, String str3, Integer num, Integer num2, PromotionConfig promotionConfig, BigSaleConfig bigSaleConfig, BigSaleConfig bigSaleConfig2, ProductConfig productConfig, AuctionConfig auctionConfig, String str4, Boolean bool, Integer num3, Boolean bool2, Image image, Image image2, String str5, Map<String, ? extends Object> map) {
        this.billboardId = str;
        this.title = str2;
        this.authorId = str3;
        this.billboardType = num;
        this.uiType = num2;
        this.promotionConfig = promotionConfig;
        this.bigSaleConfig = bigSaleConfig;
        this.imageConfig = bigSaleConfig2;
        this.productConfig = productConfig;
        this.auctionConfig = auctionConfig;
        this.cSchema = str4;
        this.supportAutoSet = bool;
        this.triggerSource = num3;
        this.LIZ = bool2;
        this.icon = image;
        this.subIcon = image2;
        this.schema = str5;
        this.daInfo = map;
    }
}
