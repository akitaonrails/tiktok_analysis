package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes29.dex */
public final class TcmNotice {

    @C09CT("content")
    public final String content;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("source_icon")
    public final UrlModel sourceIcon;

    @C09CT("source_name")
    public final String sourceName;

    @C09CT("source_type")
    public final int sourceType;

    @C09CT("title")
    public final String title;

    public TcmNotice() {
        this("", "", "", "", 0, "", null);
    }

    public TcmNotice(String str, String str2, String str3, String str4, int i, String str5, UrlModel urlModel) {
        this.title = str;
        this.content = str2;
        this.schemaUrl = str3;
        this.logExtra = str4;
        this.sourceType = i;
        this.sourceName = str5;
        this.sourceIcon = urlModel;
    }
}
