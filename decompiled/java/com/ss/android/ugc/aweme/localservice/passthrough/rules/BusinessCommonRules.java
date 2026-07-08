package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BusinessCommonRules {

    @C09CT("rules")
    public final List<BusinessRule> businessRules;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("filter_event_name_list")
    public final List<String> filterEventNameList;

    public BusinessCommonRules() {
        this(false, null, null);
    }

    public BusinessCommonRules(boolean z, List<BusinessRule> list, List<String> list2) {
        this.enable = z;
        this.businessRules = list;
        this.filterEventNameList = list2;
    }
}
