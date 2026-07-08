package com.ss.android.ugc.aweme.pipo.hybrid.prefetch;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchApi {

    @C09CT("body")
    public final Map<String, PipoPrefetchParamInfo> body;

    @C09CT("fields")
    public final Map<String, PipoPrefetchParamInfo> fields;

    @C09CT("headers")
    public final Map<String, PipoPrefetchParamInfo> headers;

    @C09CT("method")
    public final String method;

    @C09CT("query")
    public final Map<String, PipoPrefetchParamInfo> query;

    @C09CT("url")
    public final String url;

    @C09CT("use_default_domain")
    public final Integer useDefaultDomain;

    public PipoPrefetchApi() {
        this(null, null, null, null, null, null, null);
    }

    public PipoPrefetchApi(String str, Integer num, String str2, Map<String, PipoPrefetchParamInfo> map, Map<String, PipoPrefetchParamInfo> map2, Map<String, PipoPrefetchParamInfo> map3, Map<String, PipoPrefetchParamInfo> map4) {
        this.url = str;
        this.useDefaultDomain = num;
        this.method = str2;
        this.body = map;
        this.fields = map2;
        this.headers = map3;
        this.query = map4;
    }
}
