package com.ss.android.ugc.aweme.pipo.hybrid.prefetch;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchParamInfo {

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final String value;

    @C09CT("values")
    public final Map<String, PipoPrefetchParamInfo> values;

    public PipoPrefetchParamInfo() {
        this(null, null, null);
    }

    public PipoPrefetchParamInfo(String str, String str2, Map<String, PipoPrefetchParamInfo> map) {
        this.type = str;
        this.value = str2;
        this.values = map;
    }
}
