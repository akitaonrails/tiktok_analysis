package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ECSearchApiParamsConfig {

    @C09CT("filter_params")
    public final List<String> filterParams;

    public ECSearchApiParamsConfig() {
        this(C1697810uHb.LJIIJJI("gs_data", "filter_origin_search_id", "pre_keyword"));
    }

    public ECSearchApiParamsConfig(List<String> list) {
        this.filterParams = list;
    }
}
