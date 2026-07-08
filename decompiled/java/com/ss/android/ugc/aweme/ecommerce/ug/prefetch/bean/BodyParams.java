package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean;

import X.C09CT;
import com.google.gson.k;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BodyParams {

    @C09CT("build_values")
    public final List<BodyParams> buildRule;

    @C09CT("build_template")
    public final k buildTemplate;

    @C09CT("collect_func")
    public final String collectFunc;

    @C09CT("type")
    public final String dataType;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default_value")
    public final Object f62default;

    @C09CT("name")
    public final String key;

    @C09CT("query_src")
    public final String queryKey;

    @C09CT("split_symbol")
    public final String splitSymbol;

    public BodyParams() {
        this("", null, null, null, null, null, null, null);
    }

    public BodyParams(String str, String str2, Object obj, String str3, String str4, k kVar, List<BodyParams> list, String str5) {
        this.key = str;
        this.queryKey = str2;
        this.f62default = obj;
        this.dataType = str3;
        this.collectFunc = str4;
        this.buildTemplate = kVar;
        this.buildRule = list;
        this.splitSymbol = str5;
    }
}
