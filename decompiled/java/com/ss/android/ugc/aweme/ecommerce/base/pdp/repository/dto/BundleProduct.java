package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BundleProduct {

    @C09CT("add_count")
    public final Integer addCount;

    @C09CT("image")
    public final Image image;

    @C09CT("energy_label_ec_rich_text")
    public final ECRichText label;

    @C09CT("placement_labels")
    public final List<PlacementLabel> placementLabels;

    @C09CT("product_id")
    public final String productId;

    @C09CT("bundle_product_price")
    public final BundlePrice productPrice;

    @C09CT("product_source")
    public final String productSource;

    @C09CT("pdp_schema")
    public final String schema;

    @C09CT("selected_sku")
    public final BundleSku selectedSku;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("title")
    public final String title;

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        BundlePrice bundlePrice = this.productPrice;
        int iHashCode3 = (iHashCode2 + (bundlePrice == null ? 0 : bundlePrice.hashCode())) * 31;
        BundleSku bundleSku = this.selectedSku;
        int iHashCode4 = (iHashCode3 + (bundleSku == null ? 0 : bundleSku.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.addCount;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.schema;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productSource;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PlacementLabel> list = this.placementLabels;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        ECRichText eCRichText = this.label;
        return iHashCode10 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public BundleProduct(String str, Image image, BundlePrice bundlePrice, BundleSku bundleSku, String str2, String str3, Integer num, String str4, String str5, List<PlacementLabel> list, ECRichText eCRichText) {
        this.productId = str;
        this.image = image;
        this.productPrice = bundlePrice;
        this.selectedSku = bundleSku;
        this.title = str2;
        this.sellerId = str3;
        this.addCount = num;
        this.schema = str4;
        this.productSource = str5;
        this.placementLabels = list;
        this.label = eCRichText;
    }
}
