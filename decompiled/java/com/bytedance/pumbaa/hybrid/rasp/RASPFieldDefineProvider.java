package com.bytedance.pumbaa.hybrid.rasp;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class RASPFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "RASP";
    }

    public RASPFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("source", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("querys", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("query_str", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("scheme", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("url", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("host", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sl_domain", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("path", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("origin", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("referer", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("ua", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("jsb_name", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("jsb_namespace", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("parameters", new C0WQG(c0wrm, EnumC823400WRu.Any, "/data/category")), new Pair("seclink_installed", new C0WQG(c0wrm, EnumC823400WRu.Bool, "/data/category")));
    }

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final boolean contains(String str) {
        return this.LIZ.containsKey(str);
    }

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final C0WQG query(String str) {
        return this.LIZ.get(str);
    }
}
