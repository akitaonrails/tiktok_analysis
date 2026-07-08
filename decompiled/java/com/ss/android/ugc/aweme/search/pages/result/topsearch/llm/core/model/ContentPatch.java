package com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentPatch {

    @C09CT("patch")
    public final List<Object> patch;

    @C09CT("struct_type")
    public final String structType;

    public ContentPatch() {
        this(null, null);
    }

    public ContentPatch(String str, List<Object> list) {
        this.structType = str;
        this.patch = list;
    }
}
