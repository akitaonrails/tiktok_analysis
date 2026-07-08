package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class MergedTemplateListResponse {

    @C09CT("next_cursor")
    public final long cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("template_list")
    public final ArrayList<UlikeMergedTemplateStruct> templateList;

    @C09CT("total")
    public final int total;

    public MergedTemplateListResponse() {
        this(new ArrayList(), -1L, -1, -1);
    }

    public MergedTemplateListResponse(ArrayList<UlikeMergedTemplateStruct> arrayList, long j, int i, int i2) {
        this.templateList = arrayList;
        this.cursor = j;
        this.hasMore = i;
        this.total = i2;
    }
}
