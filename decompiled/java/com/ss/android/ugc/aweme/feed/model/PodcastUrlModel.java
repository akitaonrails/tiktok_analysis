package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PodcastUrlModel implements Serializable {

    @C09CT("uri")
    public String uri = "";

    @C09CT("url_list")
    public List<String> urlList = C13BV.INSTANCE;

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
