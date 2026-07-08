package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomApiInterceptConfigModel {

    @C09CT("access_key_debug")
    public final String accessKeyDebug;

    @C09CT("channel")
    public final String channel;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("init_script")
    public final String initScript;

    @C09CT("intercept_script")
    public final String interceptScript;

    @C09CT("api_list")
    public final List<String> rules;

    public EcomApiInterceptConfigModel() {
        this(null, null, Boolean.FALSE, null, null, null);
    }

    public EcomApiInterceptConfigModel(String str, String str2, Boolean bool, String str3, String str4, List<String> list) {
        this.accessKeyDebug = str;
        this.channel = str2;
        this.enable = bool;
        this.initScript = str3;
        this.interceptScript = str4;
        this.rules = list;
    }
}
