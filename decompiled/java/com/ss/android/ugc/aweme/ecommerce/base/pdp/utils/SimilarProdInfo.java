package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SimilarProdInfo {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("create_time")
    public final String createTime;

    @C09CT("currency")
    public final String currency;

    @C09CT("find_similar_reason_v2")
    public final Integer findSimilarReasonV2;

    @C09CT("max_price")
    public final String maxPrice;

    @C09CT("min_price")
    public final String minPrice;

    @C09CT("price")
    public final String price;

    @C09CT("product_size")
    public final String productSize;

    @C09CT("related_gid")
    public final String relatedGid;

    @C09CT("related_sku_id")
    public final String relatedSkuId;

    @C09CT("related_sku_image_id")
    public final String relatedSkuImageId;

    @C09CT("sku_sale_props")
    public final List<SaleProp> salePropList;

    @C09CT("seller_id")
    public final String sellerId;

    public SimilarProdInfo(String str, String str2, List<SaleProp> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        this.relatedGid = str;
        this.productSize = str2;
        this.salePropList = list;
        this.createTime = str3;
        this.price = str4;
        this.currency = str5;
        this.sellerId = str6;
        this.relatedSkuId = str7;
        this.relatedSkuImageId = str8;
        this.minPrice = str9;
        this.maxPrice = str10;
        this.authorId = str11;
        this.findSimilarReasonV2 = num;
    }
}
