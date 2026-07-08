package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SelectedSkuInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInfoMeta implements Serializable {
    public static final int $stable = 8;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("currency")
    public String currency;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("image")
    public Image image;

    @C09CT("product_id")
    public String pId;

    @C09CT("price")
    public String price;

    @C09CT("product_name")
    public String productName;

    @C09CT("selected_sku_info")
    public SelectedSkuInfo selectedSkuInfo;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sku_name")
    public String skuName;

    @C09CT("warehouse_id")
    public String warehouseId;

    public ProductInfoMeta() {
    }

    public ProductInfoMeta(String str, String str2, String str3, String str4, Image image, Integer num, String str5, String str6, String str7, String str8, SelectedSkuInfo selectedSkuInfo, String str9) {
        this.pId = str;
        this.skuId = str2;
        this.productName = str3;
        this.skuName = str4;
        this.image = image;
        this.bizType = num;
        this.sellerId = str5;
        this.id = str6;
        this.price = str7;
        this.currency = str8;
        this.selectedSkuInfo = selectedSkuInfo;
        this.warehouseId = str9;
    }
}
