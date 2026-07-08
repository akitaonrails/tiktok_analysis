package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class BaseRule {

    @C09CT("current_page_mapping")
    public final List<PageMapData> currentPageMapping;

    @C09CT("params")
    public final List<String> params;

    @C09CT("type")
    public final Integer type;

    public BaseRule() {
        this(null, null, null);
    }

    public BaseRule(Integer num, List<String> list, List<PageMapData> list2) {
        this.type = num;
        this.params = list;
        this.currentPageMapping = list2;
    }
}
