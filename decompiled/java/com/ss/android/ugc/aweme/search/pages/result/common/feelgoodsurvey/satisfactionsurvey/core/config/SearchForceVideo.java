package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SearchForceVideo implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public String[] urlList;

    @C09CT("width")
    public int width;

    public SearchForceVideo() {
        this(0, 0, "", null);
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(String[] strArr) {
        this.urlList = strArr;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public SearchForceVideo(int i, int i2, String str, String[] strArr) {
        this.height = i;
        this.width = i2;
        this.uri = str;
        this.urlList = strArr;
    }
}
