package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class TemplateInfo {

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("bundle")
    public final String bundle;

    @C09CT("channel_name")
    public final String channel;

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("res_src")
    public final String resSrc;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public TemplateInfo(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.resSrc = str;
        this.bundle = str2;
        this.channel = str3;
        this.accessKey = str4;
        this.extra = map;
    }

    public /* synthetic */ TemplateInfo(String str, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? C2097608Jq.LJ() : map);
    }
}
