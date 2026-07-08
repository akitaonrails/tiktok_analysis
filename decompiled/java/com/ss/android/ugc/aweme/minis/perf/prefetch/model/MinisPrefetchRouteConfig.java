package com.ss.android.ugc.aweme.minis.perf.prefetch.model;

import X.C09CT;
import X.C13BV;
import X.C1504390pFd;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchRouteConfig implements Serializable {

    @C09CT("body")
    public final List<MinisPrefetchBody> bodyList;

    @C09CT("headers")
    public final Map<String, String> headers;

    @C09CT("method")
    public final String method;

    @C09CT("name")
    public final String name;

    @C09CT("params")
    public final List<MinisPrefetchParam> paramsList;

    @C09CT("query")
    public final List<MinisPrefetchQuery> queryList;

    @C09CT("url")
    public final String url;
    public static final C1504390pFd Companion = new Object() { // from class: X.0pFd
    };
    public static final int $stable = 8;

    public MinisPrefetchRouteConfig(String str, String str2, String str3, Map<String, String> map, List<MinisPrefetchParam> list, List<MinisPrefetchQuery> list2, List<MinisPrefetchBody> list3) {
        this.name = str;
        this.url = str2;
        this.method = str3;
        this.headers = map;
        this.paramsList = list;
        this.queryList = list2;
        this.bodyList = list3;
    }

    public MinisPrefetchRouteConfig(String str, String str2, String str3, Map map, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "GET" : str3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? C13BV.INSTANCE : list2, (i & 64) != 0 ? C13BV.INSTANCE : list3);
    }
}
