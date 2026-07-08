package com.bytedance.hybrid.spark.roma.config;

import X.C09CT;
import X.C1550260qRc;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class FreezeConfigResponseModel {
    public static final C1550260qRc LIZ = new C1550260qRc();

    @C09CT("data")
    public final Map<String, String> configs;

    @C09CT("version")
    public final String version;

    public FreezeConfigResponseModel() {
        this(null, C2097608Jq.LJ());
    }

    public FreezeConfigResponseModel(String str, Map<String, String> map) {
        this.version = str;
        this.configs = map;
    }
}
