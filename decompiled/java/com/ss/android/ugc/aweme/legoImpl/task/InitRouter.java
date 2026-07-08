package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1593730rZj;
import X.C20606315kD;
import X.C20608615ka;
import X.C21508019Fe;
import X.C2213981Bky;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.router.IRouterInjectInitializer;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.monitor.RouterMonitorListener;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class InitRouter implements C0CCZ {
    public static InitRouter LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitRouter";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static InitRouter LJ() {
        if (LL == null) {
            LL = new InitRouter();
        }
        return LL;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C20608615ka c20608615ka = new C20608615ka();
        C2213981Bky c2213981Bky = c20608615ka.LIZIZ;
        if (c2213981Bky == null) {
            synchronized (c20608615ka) {
                c2213981Bky = c20608615ka.LIZIZ;
                if (c2213981Bky == null) {
                    c2213981Bky = C20606315kD.LIZ;
                    c20608615ka.LIZIZ = c2213981Bky;
                }
            }
        }
        SmartRouter.init(c2213981Bky.getApplicationContext());
        Logger.setDebug(((C2213981Bky) c20608615ka.LIZ()).isDebug());
        SmartRouter.configRouter(c20608615ka.LIZIZ().LIZLLL()).withOtherSchemes(c20608615ka.LIZIZ().LIZIZ());
        IRouterInjectInitializer iRouterInjectInitializerLIZJ = c20608615ka.LIZIZ().LIZJ();
        if (iRouterInjectInitializerLIZJ != null) {
            SmartRouter.injectInitializer(iRouterInjectInitializerLIZJ);
        }
        RouterMonitorListener routerMonitorListenerLIZ = c20608615ka.LIZIZ().LIZ();
        if (routerMonitorListenerLIZ != null) {
            RouterMonitor.INSTANCE.setRouterMonitorListener(routerMonitorListenerLIZ);
        }
        c20608615ka.LIZIZ().LJ();
        C21508019Fe.LIZ.getClass();
        if (C21508019Fe.LIZIZ != null) {
            C1593730rZj.LIZIZ.LJI(context);
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.putOpt(next, jSONObject.opt(next));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
