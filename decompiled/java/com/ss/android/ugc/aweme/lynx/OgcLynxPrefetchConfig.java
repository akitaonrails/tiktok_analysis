package com.ss.android.ugc.aweme.lynx;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OgcLynxPrefetchConfig {

    @C09CT("method")
    public final String method;

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgcLynxPrefetchConfig)) {
            return false;
        }
        OgcLynxPrefetchConfig ogcLynxPrefetchConfig = (OgcLynxPrefetchConfig) obj;
        return Intrinsics.LJFF(this.url, ogcLynxPrefetchConfig.url) && Intrinsics.LJFF(this.params, ogcLynxPrefetchConfig.params) && Intrinsics.LJFF(this.method, ogcLynxPrefetchConfig.method);
    }

    public final int hashCode() {
        return (((this.url.hashCode() * 31) + this.params.hashCode()) * 31) + this.method.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OgcLynxPrefetchConfig(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OgcLynxPrefetchConfig() {
        this("", C2097608Jq.LJ(), "GET");
    }

    public OgcLynxPrefetchConfig(String str, Map<String, String> map, String str2) {
        this.url = str;
        this.params = map;
        this.method = str2;
    }
}
