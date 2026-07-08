package com.ss.android.ugc.aweme.ecommerce.base.cart.cache;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Item {

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("image")
    public final Image image;

    @C09CT("is_selected")
    public final Boolean isSelected;

    @C09CT("low_stock_warning")
    public final String lowStockWarning;

    @C09CT("minimum_buy_quantity")
    public final Integer minimumBuyQuantity;

    @C09CT("packed_sku_sale_props")
    public final List<SkuSaleProp> packedSkuSaleProps;

    @C09CT("price")
    public final SkuPrice price;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_name")
    public final String productName;

    @C09CT("promotion_labels")
    public final List<PromotionLabel> promotionLabels;

    @C09CT("promotion_limit_quantity")
    public final Integer promotionLimitQuantity;

    @C09CT("promotion_logo")
    public final PromotionLogo promotionLogo;

    @C09CT("sale_props_str")
    public final String salePropsStr;

    @C09CT("selectable")
    public final Boolean selectable;

    @C09CT("sku_amount")
    public final Integer skuAmount;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_stock")
    public final Integer skuStock;

    public Item(Image image, String str, Boolean bool, Integer num, String str2, String str3, String str4, String str5, SkuPrice skuPrice, Integer num2, Boolean bool2, List<SkuSaleProp> list, String str6, Integer num3, PromotionLogo promotionLogo, Integer num4, List<PromotionLabel> list2) {
        this.image = image;
        this.cartItemId = str;
        this.selectable = bool;
        this.skuStock = num;
        this.productId = str2;
        this.productName = str3;
        this.skuId = str4;
        this.salePropsStr = str5;
        this.price = skuPrice;
        this.skuAmount = num2;
        this.isSelected = bool2;
        this.packedSkuSaleProps = list;
        this.lowStockWarning = str6;
        this.promotionLimitQuantity = num3;
        this.promotionLogo = promotionLogo;
        this.minimumBuyQuantity = num4;
        this.promotionLabels = list2;
    }
}
