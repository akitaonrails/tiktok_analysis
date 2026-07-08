package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class RedirectDetails {

    @C09CT("body")
    public final Map<String, String> body;

    @C09CT("commute_type")
    public final CommuteType commuteType;

    @C09CT("header")
    public final Map<String, String> header;

    @C09CT("method")
    public final String method;

    @C09CT("url")
    public final String url;

    public RedirectDetails(CommuteType commuteType, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this.commuteType = commuteType;
        this.url = str;
        this.method = str2;
        this.header = map;
        this.body = map2;
    }
}
