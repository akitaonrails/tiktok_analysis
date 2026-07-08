package com.bytedance.router;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.MultiRouteIntent.Builder;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SmartRouteSet {
    public static final Companion Companion = new Companion();
    public Bundle animationBundle;
    public OpenResultCallback callback;
    public final Context context;
    public final C01GW routes$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(58));

    public static final SmartRouteSet buildRoute(Context context) {
        return Companion.buildRoute(context);
    }

    private final MultiRouteIntent buildRouteIntent() {
        MultiRouteIntent.Builder builder = new MultiRouteIntent().new Builder(getRoutes());
        builder.withBundleAnimation(this.animationBundle);
        builder.withCallback(this.callback);
        return builder.build();
    }

    private final ArrayList<RouteIntent> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    public final void open() {
        RouteManager.getInstance().openMulti(this.context, buildRouteIntent());
    }

    public final Context getContext() {
        return this.context;
    }

    public static final class Companion {
        public final SmartRouteSet buildRoute(Context context) {
            return new SmartRouteSet(context);
        }
    }

    public SmartRouteSet(Context context) {
        this.context = context;
    }

    public final SmartRouteSet addRoute(SmartRoute smartRoute) {
        RouteIntent routeIntentBuildRouteIntent = smartRoute.buildRouteIntent();
        ArrayList<RouteIntent> routes = getRoutes();
        ArrayList arrayList = new ArrayList();
        for (RouteIntent routeIntent : routes) {
            if (Intrinsics.LJFF(routeIntent.getUrl(), routeIntentBuildRouteIntent.getUrl())) {
                arrayList.add(routeIntent);
            }
        }
        if (arrayList.isEmpty()) {
            if (routeIntentBuildRouteIntent.getAnimationBundle() == null) {
                if (routeIntentBuildRouteIntent.getEnterAnim() != -1 && routeIntentBuildRouteIntent.getExitAnim() != -1) {
                    "Don't support setAnimation for single Route".toString();
                    throw new IllegalArgumentException("Don't support setAnimation for single Route");
                }
                getRoutes().add(routeIntentBuildRouteIntent);
                return this;
            }
            "Don't support setAnimationBundle for single Route, Use SmartRouteSet.withBundleAnimation instead".toString();
            throw new IllegalArgumentException("Don't support setAnimationBundle for single Route, Use SmartRouteSet.withBundleAnimation instead");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Already contains a route with same url: ");
        sbLIZ.append(routeIntentBuildRouteIntent.getUrl());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final SmartRouteSet withBundleAnimation(Bundle bundle) {
        this.animationBundle = bundle;
        return this;
    }

    public final SmartRouteSet withCallBack(OpenResultCallback openResultCallback) {
        this.callback = openResultCallback;
        return this;
    }
}
