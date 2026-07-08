package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSKUSaleProp;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BundleSku {

    @C09CT("sku_sale_props")
    public final List<PackedSKUSaleProp> saleProps;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("warehouse_id")
    public final String wareHouseId;

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackedSKUSaleProp> list = this.saleProps;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.wareHouseId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public BundleSku(String str, List<PackedSKUSaleProp> list, String str2) {
        this.skuId = str;
        this.saleProps = list;
        this.wareHouseId = str2;
    }
}
