package com.ss.android.ugc.tiktok.commercialize.dispatcher.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class TaskConfigModel {

    @C09CT("device_perf_list")
    public final String devicePerfList;

    @C09CT("ecpm_threshold")
    public final Integer ecpmThreshold;

    @C09CT("ectr_threshold")
    public final Double ectrThreshold;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("enable_downgrade")
    public final Boolean enableDowngrade;

    @C09CT("enable_gecko_high_priority")
    public final Boolean enableHighPriorityDownload;

    @C09CT("pricing_type_list")
    public final String pricingTypeList;

    public TaskConfigModel() {
        this(Boolean.FALSE, Boolean.FALSE, 0, null, Double.valueOf(0.0d), null, Boolean.FALSE);
    }

    public TaskConfigModel(Boolean bool, Boolean bool2, Integer num, String str, Double d, String str2, Boolean bool3) {
        this.enable = bool;
        this.enableDowngrade = bool2;
        this.ecpmThreshold = num;
        this.devicePerfList = str;
        this.ectrThreshold = d;
        this.pricingTypeList = str2;
        this.enableHighPriorityDownload = bool3;
    }
}
