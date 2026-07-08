package com.bytedance.router.monitor.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouteInfo;
import com.bytedance.router.monitor.RouterMonitor;

/* JADX INFO: loaded from: classes36.dex */
public final class RouterPageEventDispatcher implements IRouterPageEventDispatcher {
    public static final Companion Companion = new Companion();
    public static boolean sDebug;
    public final PageRouterHandler pageRouterHandler;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    static {
        /*
            com.bytedance.router.monitor.page.RouterPageEventDispatcher$Companion r0 = new com.bytedance.router.monitor.page.RouterPageEventDispatcher$Companion
            r0.<init>()
            com.bytedance.router.monitor.page.RouterPageEventDispatcher.Companion = r0
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.RouterPageMonitor$RouterPageConfig r0 = r0.getRouterPageConfig$monitor_release()
            if (r0 == 0) goto L17
            boolean r1 = r0.debugMode
            r0 = 1
            if (r1 != r0) goto L17
        L14:
            com.bytedance.router.monitor.page.RouterPageEventDispatcher.sDebug = r0
            return
        L17:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.monitor.page.RouterPageEventDispatcher.<clinit>():void");
    }

    public RouterPageEventDispatcher() {
        PageRouterHandler pageRouterHandler = new PageRouterHandler();
        if (sDebug) {
            pageRouterHandler.setPageRouterDumper$monitor_release(new PageRouterDumper());
        }
        this.pageRouterHandler = pageRouterHandler;
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static final class Companion {
        public final boolean getSDebug() {
            return RouterPageEventDispatcher.sDebug;
        }

        public final void setSDebug(boolean z) {
            RouterPageEventDispatcher.sDebug = z;
        }
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchActivityCreated(Object obj) {
        if (!(obj instanceof Activity)) {
            return;
        }
        this.pageRouterHandler.onActivityCreated((Activity) obj);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchActivityDestroyed(Object obj) {
        if (!(obj instanceof Activity)) {
            return;
        }
        this.pageRouterHandler.onActivityDestroyed((Activity) obj);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchFragmentOnPaused(Object obj) {
        if (!(obj instanceof Fragment)) {
            return;
        }
        this.pageRouterHandler.onFragmentOnPaused((Fragment) obj);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchFragmentOnResumed(Object obj) {
        if (!(obj instanceof Fragment)) {
            return;
        }
        this.pageRouterHandler.onFragmentOnResumed((Fragment) obj);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchSmartRouteFailed(String str) {
        if (str == null) {
            return;
        }
        this.pageRouterHandler.onSmartRouteFailed(str);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchSmartRouteSuccess(String str) {
        if (str == null) {
            return;
        }
        this.pageRouterHandler.onSmartRouteSuccess(str);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchFragmentOnHiddenChanged(Object obj, boolean z) {
        if (!(obj instanceof Fragment)) {
            return;
        }
        this.pageRouterHandler.onFragmentOnHiddenChanged((Fragment) obj, z);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchFragmentOpReached(Fragment fragment, FragmentOpType fragmentOpType) {
        if (fragment == null) {
            return;
        }
        this.pageRouterHandler.onFragmentOpReached(fragment, fragmentOpType);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchSmartRouteIntercepted(String str, String str2) {
        if (str == null) {
            return;
        }
        PageRouterHandler pageRouterHandler = this.pageRouterHandler;
        if (str2 == null) {
            str2 = "";
        }
        pageRouterHandler.onSmartRouteIntercepted(str, str2);
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchActivityOpReached(Object obj, Intent intent, String str) {
        if ((obj instanceof Activity) && intent != null) {
            this.pageRouterHandler.onActivityOpReached((Context) obj, intent, str);
        }
    }

    @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
    public void dispatchSmartRouteOpen(Context context, Intent intent, String str, String str2, String str3) {
        RouteInfo routeInfo;
        String str4 = str;
        if (context != null && intent != null && (routeInfo = RouterMonitor.INSTANCE.getRouteInfo(str4)) != null) {
            PageRouterHandler pageRouterHandler = this.pageRouterHandler;
            if (str4 == null) {
                str4 = "";
            }
            pageRouterHandler.onSmartRouteOpen(context, intent, str4, routeInfo, str2, str3);
        }
    }
}
