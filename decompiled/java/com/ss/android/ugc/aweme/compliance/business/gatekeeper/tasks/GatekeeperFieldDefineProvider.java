package com.ss.android.ugc.aweme.compliance.business.gatekeeper.tasks;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class GatekeeperFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "GateKeeper";
    }

    public GatekeeperFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Bool;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("current_page_name", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("has_consent", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("should_force_login", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("current_web_page_url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("is_nuj_status", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")));
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
