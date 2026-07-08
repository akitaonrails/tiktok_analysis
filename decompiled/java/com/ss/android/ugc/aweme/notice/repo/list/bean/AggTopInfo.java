package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AggTopInfo {

    @C09CT("agg_top_item")
    public final List<AggTopItem> aggTopItem;

    @C09CT("top_type")
    public final Integer topShowType;

    public AggTopInfo() {
        this(null, null);
    }

    public AggTopInfo(Integer num, List<AggTopItem> list) {
        this.topShowType = num;
        this.aggTopItem = list;
    }
}
