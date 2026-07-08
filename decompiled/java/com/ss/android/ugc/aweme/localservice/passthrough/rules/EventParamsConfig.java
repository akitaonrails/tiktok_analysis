package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EventParamsConfig {

    @C09CT("base_event_common_params_rules")
    public final BaseCommonRules baseCommonRules;

    @C09CT("business_event_common_params_rules")
    public final BusinessCommonRules businessCommonRules;

    @C09CT("config_version")
    public final Integer configVersion;

    @C09CT("event_report_rules")
    public final EventReportRules eventReportRules;

    @C09CT("pass_params_channel")
    public final PassParamsChannel passParamsChannel;

    public EventParamsConfig() {
        this(null, null, null, null, null);
    }

    public EventParamsConfig(Integer num, EventReportRules eventReportRules, BusinessCommonRules businessCommonRules, BaseCommonRules baseCommonRules, PassParamsChannel passParamsChannel) {
        this.configVersion = num;
        this.eventReportRules = eventReportRules;
        this.businessCommonRules = businessCommonRules;
        this.baseCommonRules = baseCommonRules;
        this.passParamsChannel = passParamsChannel;
    }
}
