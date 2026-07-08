package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectAddressInfo {

    @C09CT("address_id")
    public final String addressId;

    @C09CT("area")
    public final List<Region> districts;

    @C09CT("select_type")
    public final Integer selectType;

    public SelectAddressInfo() {
        this(null, null, null);
    }

    public SelectAddressInfo(String str, List<Region> list, Integer num) {
        this.addressId = str;
        this.districts = list;
        this.selectType = num;
    }
}
