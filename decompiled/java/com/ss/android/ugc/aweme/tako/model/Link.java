package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Link implements Serializable {
    public static final int $stable = 8;

    @C09CT("url_list")
    public final List<String> urlLink;

    @C09CT("url_prefix")
    public final String urlPrefix;

    public Link(List<String> list, String str) {
        this.urlLink = list;
        this.urlPrefix = str;
    }
}
