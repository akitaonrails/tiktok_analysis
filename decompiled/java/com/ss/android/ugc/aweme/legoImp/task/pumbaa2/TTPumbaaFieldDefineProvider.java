package com.ss.android.ugc.aweme.legoImp.task.pumbaa2;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.AppFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPumbaaFieldDefineProvider implements AppFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "HostApp";
    }

    public TTPumbaaFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.Global;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Bool;
        EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Long;
        C0WRM c0wrm2 = C0WRM.Engine;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("release_build", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("is_regression_test", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("store_region", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("store_region_vgeo", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("region_source", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("priority_region", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("is_guest_mode", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_login", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_not_consent", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_kids_mode", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("age", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("guest_mode", new C0WQG(c0wrm, enumC823400WRu3, "/data/category")), new Pair("is_teen_mode", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_personalized_ads_enabled", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_personal_account", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("is_first_frame_show", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("app_uptime", new C0WQG(c0wrm, enumC823400WRu3, "/data/metric")), new Pair("strategy_branch", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("runtime_is_hybrid", new C0WQG(c0wrm2, enumC823400WRu2, "/data/extra")), new Pair("client_detect_data_type", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")));
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
