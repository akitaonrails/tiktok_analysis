package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveBillboard {
    public final Boolean LIZ;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("big_sale_config")
    public final BigSaleConfig bigSaleConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String billboardId;

    @C09CT("type")
    public final Integer billboardType;

    @C09CT("image_config")
    public final BigSaleConfig imageConfig;

    @C09CT("product_config")
    public final ProductConfig productConfig;

    @C09CT("promotion_config")
    public final PromotionConfig promotionConfig;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    @C09CT("ui_type")
    public final Integer uiType;

    public SeaLiveBillboard() {
        this(null, null, null, 0, 0, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaLiveBillboard)) {
            return false;
        }
        SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) obj;
        return Intrinsics.LJFF(this.billboardId, seaLiveBillboard.billboardId) && Intrinsics.LJFF(this.title, seaLiveBillboard.title) && Intrinsics.LJFF(this.authorId, seaLiveBillboard.authorId) && Intrinsics.LJFF(this.billboardType, seaLiveBillboard.billboardType) && Intrinsics.LJFF(this.uiType, seaLiveBillboard.uiType) && Intrinsics.LJFF(this.promotionConfig, seaLiveBillboard.promotionConfig) && Intrinsics.LJFF(this.bigSaleConfig, seaLiveBillboard.bigSaleConfig) && Intrinsics.LJFF(this.imageConfig, seaLiveBillboard.imageConfig) && Intrinsics.LJFF(this.productConfig, seaLiveBillboard.productConfig) && Intrinsics.LJFF(this.LIZ, seaLiveBillboard.LIZ) && Intrinsics.LJFF(this.schema, seaLiveBillboard.schema);
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
        Boolean bool = this.LIZ;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.schema;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "SeaLiveBillboard(billboardId=" + this.billboardId + ", title=" + this.title + ", authorId=" + this.authorId + ", billboardType=" + this.billboardType + ", uiType=" + this.uiType + ", promotionConfig=" + this.promotionConfig + ", bigSaleConfig=" + this.bigSaleConfig + ", imageConfig=" + this.imageConfig + ", productConfig=" + this.productConfig + ", isLiveTakeDefault=" + this.LIZ + ", schema=" + this.schema + ')';
    }

    public SeaLiveBillboard(String str, String str2, String str3, Integer num, Integer num2, PromotionConfig promotionConfig, BigSaleConfig bigSaleConfig, BigSaleConfig bigSaleConfig2, ProductConfig productConfig, Boolean bool, String str4) {
        this.billboardId = str;
        this.title = str2;
        this.authorId = str3;
        this.billboardType = num;
        this.uiType = num2;
        this.promotionConfig = promotionConfig;
        this.bigSaleConfig = bigSaleConfig;
        this.imageConfig = bigSaleConfig2;
        this.productConfig = productConfig;
        this.LIZ = bool;
        this.schema = str4;
    }
}
