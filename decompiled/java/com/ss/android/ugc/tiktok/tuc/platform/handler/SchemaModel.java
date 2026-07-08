package com.ss.android.ugc.tiktok.tuc.platform.handler;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class SchemaModel implements Serializable {

    @C09CT("param")
    public final Map<String, String> param;

    @C09CT("url")
    public final String url;

    public SchemaModel() {
        this(null, null);
    }

    public SchemaModel(String str, Map<String, String> map) {
        this.url = str;
        this.param = map;
    }
}
