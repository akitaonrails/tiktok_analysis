package com.ss.android.ugc.aweme.ecommerce.ug.perf;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class MallLandingSceneConfig {

    @C09CT("intercept_type")
    public final Integer interceptType;

    @C09CT("page_name")
    public final String pageName;

    @C09CT("rules")
    public final Map<String, String> rules;

    public MallLandingSceneConfig(String str, Map<String, String> map, Integer num) {
        this.pageName = str;
        this.rules = map;
        this.interceptType = num;
    }
}
