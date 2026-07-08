package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabApiConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("client_request_params")
    public final List<String> clientRequestParams;

    @C09CT("method")
    public final String method;

    @C09CT("path")
    public final String path;

    @C09CT("request_params")
    public final HashMap<String, String> requestParams;

    public SearchTabApiConfig() {
        this(null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTabApiConfig(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", requestParams=");
        sbLIZ.append(this.requestParams);
        sbLIZ.append(", clientRequestParams=");
        sbLIZ.append(this.clientRequestParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchTabApiConfig(String str, String str2, HashMap<String, String> map, List<String> list) {
        this.path = str;
        this.method = str2;
        this.requestParams = map;
        this.clientRequestParams = list;
    }
}
