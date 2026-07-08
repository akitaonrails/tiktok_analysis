package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BaseCommonRules {

    @C09CT("btm_list")
    public final List<String> btmList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("filter_event_name_list")
    public final List<String> filterEventNameList;

    @C09CT("rules")
    public final List<BaseRule> rules;

    public BaseCommonRules() {
        this(false, new ArrayList(), new ArrayList(), null);
    }

    public BaseCommonRules(boolean z, List<String> list, List<BaseRule> list2, List<String> list3) {
        this.enable = z;
        this.btmList = list;
        this.rules = list2;
        this.filterEventNameList = list3;
    }
}
