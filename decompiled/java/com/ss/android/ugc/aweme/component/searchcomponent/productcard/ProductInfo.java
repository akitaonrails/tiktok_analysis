package com.ss.android.ugc.aweme.component.searchcomponent.productcard;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ProductInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("image")
    public final String imageUrl;

    @C09CT("jump_data")
    public final JumpData jump_data;

    @C09CT("only_desc_style")
    public final boolean onlyDescStyle;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("sale_price")
    public final String salePrice;

    @C09CT("selling_point_text")
    public final String sellingPointText;

    @C09CT("selling_point_text_style")
    public final Integer sellingPointTextColorStyle;

    @C09CT("spu_id")
    public final String spuId;

    @C09CT("title")
    public final String title;

    public int hashCode() {
        String str = this.originalPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.salePrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.spuId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        JumpData jumpData = this.jump_data;
        int iHashCode5 = (iHashCode4 + (jumpData == null ? 0 : jumpData.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.onlyDescStyle)) * 31;
        String str6 = this.sellingPointText;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.sellingPointTextColorStyle;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    public ProductInfo(String str, String str2, String str3, String str4, JumpData jumpData, String str5, boolean z, String str6, Integer num) {
        this.originalPrice = str;
        this.salePrice = str2;
        this.imageUrl = str3;
        this.spuId = str4;
        this.jump_data = jumpData;
        this.title = str5;
        this.onlyDescStyle = z;
        this.sellingPointText = str6;
        this.sellingPointTextColorStyle = num;
    }
}
