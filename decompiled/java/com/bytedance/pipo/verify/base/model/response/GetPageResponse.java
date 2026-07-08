package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GetPageResponse {

    @C09CT("button")
    public final List<String> button;

    @C09CT("content")
    public final List<String> content;

    @C09CT("title")
    public final String title;

    public GetPageResponse() {
        this(null, null, null);
    }

    public GetPageResponse(String str, List<String> list, List<String> list2) {
        this.title = str;
        this.content = list;
        this.button = list2;
    }
}
