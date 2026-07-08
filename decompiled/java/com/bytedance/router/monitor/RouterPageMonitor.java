package com.bytedance.router.monitor;

import android.app.Activity;
import com.bytedance.router.monitor.page.IRouterPageEventDispatcher;
import com.bytedance.router.monitor.page.PageRouterHandlerKt;
import com.bytedance.router.monitor.page.RouterPageEventDispatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class RouterPageMonitor {
    public static final RouterPageMonitor INSTANCE = new RouterPageMonitor();
    public static Function0<RouterPageConfig> routerConfigGetter;
    public static volatile RouterPageConfig routerPageConfig;
    public static volatile IRouterPageEventDispatcher routerPageEventDispatcher;
    public static volatile boolean sInit;

    /* JADX INFO: loaded from: classes35.dex */
    public interface IEventReport {
        void onEvent(String str, JSONObject jSONObject);
    }

    public interface IRouterNodeHost {
        boolean shouldSkipRouteActivityNode(Activity activity);
    }

    private final void ensureInit() {
        if (sInit) {
            return;
        }
        synchronized (this) {
            try {
                if (!sInit) {
                    Function0<RouterPageConfig> function0 = routerConfigGetter;
                    routerPageConfig = function0 != null ? function0.invoke() : null;
                    RouterPageConfig routerPageConfig2 = routerPageConfig;
                    if (routerPageConfig2 != null && routerPageConfig2.enable) {
                        routerPageEventDispatcher = new RouterPageEventDispatcher();
                    }
                    sInit = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final IRouterPageEventDispatcher getDispatcher() {
        ensureInit();
        IRouterPageEventDispatcher iRouterPageEventDispatcher = routerPageEventDispatcher;
        return iRouterPageEventDispatcher == null ? PageRouterHandlerKt.getEmptyDispatcher() : iRouterPageEventDispatcher;
    }

    public final RouterPageConfig getRouterPageConfig$monitor_release() {
        return routerPageConfig;
    }

    public final void initConfig(Function0<RouterPageConfig> function0) {
        routerConfigGetter = function0;
    }

    public final void setRouterPageConfig$monitor_release(RouterPageConfig routerPageConfig2) {
        routerPageConfig = routerPageConfig2;
    }

    public static final class RouterPageConfig {
        public final boolean debugMode;
        public final boolean enable;
        public final IEventReport reporter;
        public final IRouterNodeHost routerNodeHost;

        public RouterPageConfig(boolean z, IEventReport iEventReport, IRouterNodeHost iRouterNodeHost, boolean z2) {
            this.enable = z;
            this.reporter = iEventReport;
            this.routerNodeHost = iRouterNodeHost;
            this.debugMode = z2;
        }
    }
}
