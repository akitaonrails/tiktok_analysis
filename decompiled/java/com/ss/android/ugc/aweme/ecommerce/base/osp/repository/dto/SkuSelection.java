package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuSelection {

    @C09CT("product_base")
    public ProductBase baseInfo;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("default_sku_selection")
    public DefaultSelection defaultSelection;

    @C09CT("is_single_row")
    public Boolean isSingleRow;

    @C09CT("is_with_default_sku")
    public Boolean isWithDefaultSku;

    @C09CT("local_size_sale_prop")
    public StandardSaleProps localSizeSaleProp;

    @C09CT("product_id")
    public String productId;

    @C09CT("promotion_label_info")
    public PromotionLabelVO promotionLabels;

    @C09CT("sale_props")
    public List<SaleProp> saleProps;

    @C09CT("skc_info")
    public SkcInfo skcInfo;

    @C09CT("sku_panel_waist_banner")
    public SeaSkuPanelWaistBanner skuPanelWaistBanner;

    @C09CT("skus")
    public List<SkuItem> skus;

    public SkuSelection() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SkuSelection(String str, List<SaleProp> list, List<SkuItem> list2, SkcInfo skcInfo, ProductBase productBase, StandardSaleProps standardSaleProps, Integer num, Boolean bool, DefaultSelection defaultSelection, Boolean bool2, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner, PromotionLabelVO promotionLabelVO) {
        this.productId = str;
        this.saleProps = list;
        this.skus = list2;
        this.skcInfo = skcInfo;
        this.baseInfo = productBase;
        this.localSizeSaleProp = standardSaleProps;
        this.bizType = num;
        this.isWithDefaultSku = bool;
        this.defaultSelection = defaultSelection;
        this.isSingleRow = bool2;
        this.skuPanelWaistBanner = seaSkuPanelWaistBanner;
        this.promotionLabels = promotionLabelVO;
    }
}
