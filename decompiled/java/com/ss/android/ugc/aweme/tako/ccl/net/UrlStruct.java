package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UrlStruct {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    public UrlStruct() {
        this(null, null, null, 7, null);
    }

    public UrlStruct(String str, List<String> list, String str2) {
        this.uri = str;
        this.urlList = list;
        this.urlPrefix = str2;
    }

    public UrlStruct(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str2);
    }
}
