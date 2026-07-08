package com.ss.android.ugc.aweme.ecommerce.trace;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomNativeTraceRoute {

    @C09CT("exit_event")
    public final EcomTraceExitEvent exitEvent;

    @C09CT("route")
    public final EcomRouteConfigModel route;

    public EcomNativeTraceRoute() {
        this(new EcomRouteConfigModel(null, null, null, null, null, null, null, null, null), null);
    }

    public EcomNativeTraceRoute(EcomRouteConfigModel ecomRouteConfigModel, EcomTraceExitEvent ecomTraceExitEvent) {
        this.route = ecomRouteConfigModel;
        this.exitEvent = ecomTraceExitEvent;
    }
}
