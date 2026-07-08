package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ComboSkuInfo {
    public static final int $stable = 8;

    @C09CT("product_id")
    public String productId;

    @C09CT("sale_props_str")
    public String salePropsStr;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sku_image")
    public Image skuImage;

    @C09CT("sku_name")
    public String skuName;

    public ComboSkuInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSkuInfo)) {
            return false;
        }
        ComboSkuInfo comboSkuInfo = (ComboSkuInfo) obj;
        return Intrinsics.LJFF(this.skuId, comboSkuInfo.skuId) && Intrinsics.LJFF(this.productId, comboSkuInfo.productId) && Intrinsics.LJFF(this.skuImage, comboSkuInfo.skuImage) && Intrinsics.LJFF(this.skuName, comboSkuInfo.skuName) && Intrinsics.LJFF(this.salePropsStr, comboSkuInfo.salePropsStr);
    }

    public int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.skuImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.skuName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.salePropsStr;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComboSkuInfo(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuImage=");
        sbLIZ.append(this.skuImage);
        sbLIZ.append(", skuName=");
        sbLIZ.append(this.skuName);
        sbLIZ.append(", salePropsStr=");
        sbLIZ.append(this.salePropsStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ComboSkuInfo(String str, String str2, Image image, String str3, String str4) {
        this.skuId = str;
        this.productId = str2;
        this.skuImage = image;
        this.skuName = str3;
        this.salePropsStr = str4;
    }
}
