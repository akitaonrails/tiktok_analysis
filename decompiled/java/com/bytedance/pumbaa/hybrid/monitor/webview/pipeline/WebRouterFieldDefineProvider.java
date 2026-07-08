package com.bytedance.pumbaa.hybrid.monitor.webview.pipeline;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class WebRouterFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "WebRouter";
    }

    public WebRouterFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.StringArray;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("scheme", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("domain", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("domain_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("query_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("path", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("event_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_view_class", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_view_webclient", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_view_chromeclient", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_view_hierarchy", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_type", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_container_type", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_container_name", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_caller", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_callee", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_caller_component", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_router_url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_router_path", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_router_query_field", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("webrouter_session_id", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_jump_times", new C0WQG(c0wrm, EnumC823400WRu.Long, "/data/extra")), new Pair("webrouter_spark_runtime", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_spark_uiType", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_sec_link_scene", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_is_interior", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("webrouter_caller_stack", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webrouter_pre_url_info", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")));
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
