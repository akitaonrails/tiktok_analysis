package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class UrlInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    public UrlInfo(String str, List<String> list, String str2) {
        this.uri = str;
        this.urlList = list;
        this.urlPrefix = str2;
    }
}
