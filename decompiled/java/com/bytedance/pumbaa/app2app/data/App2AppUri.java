package com.bytedance.pumbaa.app2app.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class App2AppUri {

    @C09CT("host")
    public final String host;

    @C09CT("path")
    public final String path;

    @C09CT("query")
    public final List<KV> query;

    @C09CT("scheme")
    public final String scheme;

    public static App2AppUri LIZ(App2AppUri app2AppUri) {
        return new App2AppUri(app2AppUri.scheme, app2AppUri.host, app2AppUri.path, null);
    }

    public App2AppUri(String str, String str2, String str3, List<KV> list) {
        this.scheme = str;
        this.host = str2;
        this.path = str3;
        this.query = list;
    }
}
