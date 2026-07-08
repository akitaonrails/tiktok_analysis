package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomImageXConfigData {

    @C09CT("config")
    public final List<EcomImageXConfigModel> config;

    @C09CT("config_map")
    public final Map<String, EcomImageXConfigModel> configMap;

    @C09CT("service_id")
    public final List<String> serviceID;

    @C09CT("template_params")
    public final Map<String, TemplateParamBean> templateParams;

    public EcomImageXConfigData() {
        this(null, null, null, null, 15, null);
    }

    public EcomImageXConfigData(List<String> list, List<EcomImageXConfigModel> list2, Map<String, EcomImageXConfigModel> map, Map<String, TemplateParamBean> map2) {
        this.serviceID = list;
        this.config = list2;
        this.configMap = map;
        this.templateParams = map2;
    }

    public EcomImageXConfigData(List list, List list2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? C2097608Jq.LJ() : map2);
    }
}
