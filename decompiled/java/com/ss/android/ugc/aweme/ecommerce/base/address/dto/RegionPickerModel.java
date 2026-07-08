package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RegionPickerModel {

    @C09CT("addressEntranceScene")
    public final Integer addressEntranceScene;

    @C09CT("btm")
    public final String btm;

    @C09CT("geoNameIDArray")
    public final List<String> geoNameIDArray;

    @C09CT("isAddressChangeAfterPay")
    public final Integer isAddressChangeAfterPay;

    @C09CT("location")
    public final String location;

    @C09CT("pageInfo")
    public final String pageInfo;

    @C09CT("selectRegions")
    public final List<Region> selectRegions;

    @C09CT("withoutNextLevel")
    public final Boolean withoutNextLevel;

    public RegionPickerModel() {
        this(null, null, null, null, null, null, null, null);
    }

    public RegionPickerModel(List<String> list, List<Region> list2, String str, String str2, Boolean bool, Integer num, Integer num2, String str3) {
        this.geoNameIDArray = list;
        this.selectRegions = list2;
        this.pageInfo = str;
        this.location = str2;
        this.withoutNextLevel = bool;
        this.addressEntranceScene = num;
        this.isAddressChangeAfterPay = num2;
        this.btm = str3;
    }
}
