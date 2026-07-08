package com.bytedance.pumbaa.aspect.apicalling.systemapi;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class SystemApiFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "SystemApi";
    }

    public SystemApiFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.StringArray;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("query_uri", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("cookie_params", new C0WQG(c0wrm, EnumC823400WRu.String, "/data/extra")), new Pair("permission", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")));
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
