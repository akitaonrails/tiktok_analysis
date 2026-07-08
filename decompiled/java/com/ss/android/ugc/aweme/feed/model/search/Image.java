package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Image implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("uri")
    public String uri = "";

    @C09CT("url_list")
    public List<String> urlList = new ArrayList();

    @C09CT("width")
    public int width;

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
