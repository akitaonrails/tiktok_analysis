package com.bytedance.router;

import X.C01GW;
import X.C452501pT;
import android.os.Bundle;
import com.bytedance.router.route.BaseRoute;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class MultiRouteIntent extends RouteIntent {
    public final C01GW routeIntents$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(56));
    public final C01GW routes$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(57));

    public final ArrayList<RouteIntent> getRouteIntents() {
        return (ArrayList) this.routeIntents$delegate.getValue();
    }

    public final ArrayList<BaseRoute> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    public final class Builder {
        public final MultiRouteIntent build() {
            return MultiRouteIntent.this;
        }

        public final Builder withBundleAnimation(Bundle bundle) {
            MultiRouteIntent.this.setAnimationBundle(bundle);
            return this;
        }

        public final Builder withCallback(OpenResultCallback openResultCallback) {
            MultiRouteIntent.this.setCallback(openResultCallback);
            return this;
        }

        public Builder(List<? extends RouteIntent> list) {
            MultiRouteIntent.this.getRouteIntents().addAll(list);
        }
    }
}
