package com.bytedance.pipo.stellar.base.page;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarPageRequest implements Serializable {

    @C09CT("app_id")
    public final String appId;

    @C09CT("country_or_region")
    public final String country;

    @C09CT("current_time")
    public final Long currentTime;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("entrance")
    public final String entrance;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("language")
    public final String language;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("pre_set_params")
    public final Map<String, Object> preSetParams;

    @C09CT("refresh_section_ids")
    public final List<String> refreshSectionIds;

    @C09CT("refresh_type")
    public final String refreshType;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("section_ids")
    public final List<String> sectionIds;

    @C09CT("target_page")
    public final String targetPage;

    @C09CT("target_section_id")
    public final List<String> targetSectionIds;

    @C09CT("verify_id")
    public final String verifyId;

    public StellarPageRequest(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, String str7, String str8, String str9, String str10, Map<String, ? extends Object> map, Map<String, String> map2, String str11, List<String> list3, Long l) {
        this.appId = str;
        this.devicePlatform = str2;
        this.merchantId = str3;
        this.country = str4;
        this.language = str5;
        this.targetPage = str6;
        this.sectionIds = list;
        this.refreshSectionIds = list2;
        this.entrance = str7;
        this.enterFrom = str8;
        this.riskInfo = str9;
        this.verifyId = str10;
        this.preSetParams = map;
        this.extra = map2;
        this.refreshType = str11;
        this.targetSectionIds = list3;
        this.currentTime = l;
    }
}
