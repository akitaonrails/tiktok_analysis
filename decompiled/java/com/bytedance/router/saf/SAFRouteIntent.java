package com.bytedance.router.saf;

import X.C199S;
import com.bytedance.router.RouteIntent;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Pair;

/* JADX INFO: loaded from: classes33.dex */
public final class SAFRouteIntent extends RouteIntent {
    public Pair<Integer, Integer> finishAnim = new Pair<>(-1, -1);
    public final NavigationScene navigationScene;
    public C199S pushResultCallback;

    public static final class Builder extends RouteIntent.Builder {
        public Pair<Integer, Integer> exitAnim = new Pair<>(-1, -1);
        public NavigationScene navigationScene;
        public C199S pushResultCallback;

        @Override // com.bytedance.router.RouteIntent.Builder
        public SAFRouteIntent build() {
            SAFRouteIntent sAFRouteIntent = new SAFRouteIntent(this.navigationScene);
            apply(sAFRouteIntent);
            sAFRouteIntent.setPushResultCallback(this.pushResultCallback);
            sAFRouteIntent.setFinishAnim(this.exitAnim);
            return sAFRouteIntent;
        }

        public final Builder withExitAnimation(Pair<Integer, Integer> pair) {
            this.exitAnim = pair;
            return this;
        }

        public final Builder withNavigationScene(NavigationScene navigationScene) {
            this.navigationScene = navigationScene;
            return this;
        }

        public final Builder withPushCallback(C199S c199s) {
            this.pushResultCallback = c199s;
            return this;
        }
    }

    public final Pair<Integer, Integer> getFinishAnim() {
        return this.finishAnim;
    }

    public final NavigationScene getNavigationScene() {
        return this.navigationScene;
    }

    public final C199S getPushResultCallback() {
        return this.pushResultCallback;
    }

    public SAFRouteIntent(NavigationScene navigationScene) {
        this.navigationScene = navigationScene;
    }

    public final void setFinishAnim(Pair<Integer, Integer> pair) {
        this.finishAnim = pair;
    }

    public final void setPushResultCallback(C199S c199s) {
        this.pushResultCallback = c199s;
    }
}
