package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DataListInfo {

    @C09CT("category")
    public final List<Object> category;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("data_type")
    public final int dataType;

    @C09CT("filtered_template")
    public final List<Object> filterMessage;

    @C09CT("has_next")
    public final boolean hasNext;

    @C09CT("template")
    public final List<TemplateInfo> template;

    public DataListInfo() {
        this(0, 0L, null, null, null, false);
    }

    public DataListInfo(int i, long j, List<Object> list, List<TemplateInfo> list2, List<Object> list3, boolean z) {
        this.dataType = i;
        this.cursor = j;
        this.category = list;
        this.template = list2;
        this.filterMessage = list3;
        this.hasNext = z;
    }
}
