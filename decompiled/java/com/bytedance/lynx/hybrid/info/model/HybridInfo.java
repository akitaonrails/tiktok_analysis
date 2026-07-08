package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridInfo {

    @C09CT("domain_infos")
    public final Map<String, DomainInfo> domain_infos;

    @C09CT("engine_type")
    public final String engine_type;

    @C09CT("oid")
    public final String oid;

    @C09CT("resource_infos")
    public final Map<String, ResourceInfo> resource_infos;

    @C09CT("template_info")
    public final TemplateInfo templateInfo;

    @C09CT("url")
    public final String url;

    @C09CT("validity_period")
    public final int validity_period;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0d, 255, 0 == true ? 1 : 0);
    }

    public HybridInfo(String str, String str2, String str3, int i, Map<String, ResourceInfo> map, Map<String, DomainInfo> map2, TemplateInfo templateInfo, double d) {
        this.oid = str;
        this.url = str2;
        this.engine_type = str3;
        this.validity_period = i;
        this.resource_infos = map;
        this.domain_infos = map2;
        this.templateInfo = templateInfo;
    }

    public /* synthetic */ HybridInfo(String str, String str2, String str3, int i, Map map, Map map2, TemplateInfo templateInfo, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? 604800 : i, (i2 & 16) != 0 ? C2097608Jq.LJ() : map, (i2 & 32) != 0 ? C2097608Jq.LJ() : map2, (i2 & 64) != 0 ? null : templateInfo, (i2 & 128) != 0 ? 0.0d : d);
    }
}
