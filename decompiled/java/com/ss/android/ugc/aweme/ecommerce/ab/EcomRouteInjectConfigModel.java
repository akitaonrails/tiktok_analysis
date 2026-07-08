package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomRouteInjectConfigModel {
    public static final List<EcomRouteConfigModel> LIZ = C1697810uHb.LJIIJJI(new EcomRouteConfigModel(null, null, null, "ec", null, null, null, null, null), new EcomRouteConfigModel(null, null, null, "lynxview", null, null, null, null, null), new EcomRouteConfigModel(null, null, null, "search", null, null, null, null, null));

    @C09CT("routes")
    public final List<EcomRouteConfigModel> routes;

    public EcomRouteInjectConfigModel() {
        this(LIZ);
    }

    public EcomRouteInjectConfigModel(List<EcomRouteConfigModel> list) {
        this.routes = list;
    }
}
