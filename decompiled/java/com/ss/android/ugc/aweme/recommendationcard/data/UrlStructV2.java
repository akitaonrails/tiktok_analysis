package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class UrlStructV2 {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public UrlStructV2(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
