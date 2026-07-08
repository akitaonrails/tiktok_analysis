package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class NativePrefetchRuleModel {

    @C09CT("path")
    public final String apiPath;

    @C09CT("body")
    public List<BodyParams> body;

    @C09CT("header")
    public List<BodyParams> header;

    @C09CT("method")
    public final String method;

    @C09CT("query")
    public List<BodyParams> query;

    @C09CT("track_params")
    public List<BodyParams> trackParams;

    public NativePrefetchRuleModel() {
        this("", "", null, null, null, null);
    }

    public NativePrefetchRuleModel(String str, String str2, List<BodyParams> list, List<BodyParams> list2, List<BodyParams> list3, List<BodyParams> list4) {
        this.apiPath = str;
        this.method = str2;
        this.header = list;
        this.query = list2;
        this.body = list3;
        this.trackParams = list4;
    }
}
