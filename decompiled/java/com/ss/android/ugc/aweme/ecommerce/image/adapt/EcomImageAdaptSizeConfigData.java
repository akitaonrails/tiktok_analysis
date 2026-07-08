package com.ss.android.ugc.aweme.ecommerce.image.adapt;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class EcomImageAdaptSizeConfigData {

    @C09CT("config_map")
    public final Map<String, EcomImageAdaptSizeConfigModel> configMap;

    @C09CT("configs")
    public final List<EcomImageAdaptSizeConfigModel> configs;

    public EcomImageAdaptSizeConfigData() {
        this(null, null, 3, null);
    }

    public EcomImageAdaptSizeConfigData(List<EcomImageAdaptSizeConfigModel> list, Map<String, EcomImageAdaptSizeConfigModel> map) {
        this.configs = list;
        this.configMap = map;
    }

    public EcomImageAdaptSizeConfigData(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
