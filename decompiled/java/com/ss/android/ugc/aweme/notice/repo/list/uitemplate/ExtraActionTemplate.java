package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ExtraActionTemplate {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("text_content")
    public final String content;

    @C09CT("schema_url")
    public final String schema;

    @C09CT("view_type")
    public final int viewType;

    public ExtraActionTemplate(int i, int i2, String str, String str2) {
        this.actionType = i;
        this.viewType = i2;
        this.content = str;
        this.schema = str2;
    }
}
