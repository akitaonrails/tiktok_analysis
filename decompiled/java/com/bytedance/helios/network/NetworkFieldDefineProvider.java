package com.bytedance.helios.network;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "Network";
    }

    public NetworkFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Any;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webview_url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("webview_channel", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_channel", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_is_isolate", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_origin_url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("path", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("cal_path", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("query_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("query", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("query_str", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("query_mss", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("header_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("header", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("header_mss", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("cookie_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("body_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("resp_header_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("resp_header", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("resp_cookie_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("resp_body_fields", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("body_string", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("response_code", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("dynamic_request_id", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("call_site", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_reason", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("scheme", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("method", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sandbox_method", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("domain", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("domain_after_tnc", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("domain_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("event_source", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("event_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("is_third_party", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("exempted_id_list", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("is_in_sandbox_region", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sandbox_region_criteria", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sandbox_state", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("user_agent", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("transition_dfid", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("report_reason", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("content_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("hybrid_router_dataflow_id", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("function_sig_name", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sandbox_result", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("sandbox_channel", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("isolation_zone", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("dynamic_cdn_domain", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("ttnet_task_id", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_origin_url", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("hybrid_origin_url_domain", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("x_tt_logid", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("x_tt_traceflag", new C0WQG(c0wrm, enumC823400WRu, "/data/category")));
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
