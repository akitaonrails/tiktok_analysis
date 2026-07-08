package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeUrl implements Serializable {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public AwemeUrl() {
        this(new ArrayList(), null);
    }

    public AwemeUrl(List<String> list, String str) {
        this.urlList = list;
        this.uri = str;
    }
}
