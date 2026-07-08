package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RegionRequest {

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("district_keyword")
    public final String districtWord;

    @C09CT("geoname_ids")
    public final String[] geoNameId;

    @C09CT("get_districts_type")
    public final Integer getDistrictType;

    @C09CT("order_skus")
    public final List<OrderSKUDTO> orderSKUs;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("pre_selection_geoname_ids")
    public final String[] preSelectionGeoNameId;

    @C09CT("without_next_level")
    public final Boolean withoutNextLevel;

    public RegionRequest() {
        this(null, null, null, null, null, 0, null, null);
    }

    public RegionRequest(String[] strArr, List<OrderSKUDTO> list, Integer num, String str, Boolean bool, Integer num2, String[] strArr2, String str2) {
        this.geoNameId = strArr;
        this.orderSKUs = list;
        this.getDistrictType = num;
        this.districtWord = str;
        this.withoutNextLevel = bool;
        this.addressEntranceScene = num2;
        this.preSelectionGeoNameId = strArr2;
        this.preLogId = str2;
    }
}
