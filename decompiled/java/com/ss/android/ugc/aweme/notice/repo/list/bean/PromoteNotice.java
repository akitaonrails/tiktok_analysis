package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteNotice {

    @C09CT("content")
    public final String content;

    @C09CT("image_url")
    public final UrlModel imageUrl;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title")
    public final String title;

    public PromoteNotice() {
        this("", "", "", null);
    }

    public PromoteNotice(String str, String str2, String str3, UrlModel urlModel) {
        this.title = str;
        this.content = str2;
        this.schemaUrl = str3;
        this.imageUrl = urlModel;
    }
}
