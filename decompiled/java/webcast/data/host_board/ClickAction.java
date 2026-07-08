package webcast.data.host_board;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ClickAction {

    @C09CT("navigate_to_app_route")
    public NavigateToAppRoute navigateToAppRoute;

    public static final class NavigateToAppRoute {

        @C09CT("route")
        public String route = "";

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(NavigateToAppRoute.class, cls)) {
                return false;
            }
            return Intrinsics.LJFF(this.route, ((NavigateToAppRoute) obj).route);
        }
    }

    public final int hashCode() {
        NavigateToAppRoute navigateToAppRoute = this.navigateToAppRoute;
        if (navigateToAppRoute != null) {
            return navigateToAppRoute.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(ClickAction.class, cls)) {
            return false;
        }
        return Intrinsics.LJFF(this.navigateToAppRoute, ((ClickAction) obj).navigateToAppRoute);
    }
}
