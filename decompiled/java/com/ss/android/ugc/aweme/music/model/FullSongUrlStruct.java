package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class FullSongUrlStruct implements Serializable {

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("uri")
    public String uri = "";

    @C09CT("url_prefix")
    public String urlPrefix = "";

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final String getUrlPrefix() {
        return this.urlPrefix;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setUrlPrefix(String str) {
        this.urlPrefix = str;
    }
}
