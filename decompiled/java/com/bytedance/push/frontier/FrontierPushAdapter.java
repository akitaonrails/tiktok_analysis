package com.bytedance.push.frontier;

import X.C0WFE;
import X.C809030VoT;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809810Vpj;
import X.C810150VqH;
import X.InterfaceC808910VoH;
import X.InterfaceC809680VpW;
import X.InterfaceC809850Vpn;
import android.content.Context;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class FrontierPushAdapter implements InterfaceC808910VoH {
    public static int FRONTIER_PUSH = -1;

    @Override // X.InterfaceC808910VoH
    public boolean checkThirdPushConfig(String str, Context context) {
        return true;
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // X.InterfaceC808910VoH
    public void setAlias(Context context, String str, int i) {
    }

    @Override // X.InterfaceC808910VoH
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getFrontierPush() {
        if (FRONTIER_PUSH == -1) {
            FRONTIER_PUSH = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZIZ(FrontierPushAdapter.class.getName());
        }
        return FRONTIER_PUSH;
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        if (i != getFrontierPush()) {
            return false;
        }
        C809810Vpj c809810VpjLIZIZ = C809810Vpj.LIZIZ(context);
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) C0WFE.LIZ(c809810VpjLIZIZ.LIZIZ, PushOnlineSettings.class);
        if (pushOnlineSettings != null) {
            c809810VpjLIZIZ.LIZJ = pushOnlineSettings.LJIILL();
        }
        int i2 = c809810VpjLIZIZ.LIZJ;
        if (i2 == 0) {
            return false;
        }
        if ((i2 != 1 || c809810VpjLIZIZ.LIZ.get() == null) && c809810VpjLIZIZ.LIZJ != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(Context context, int i) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZJ("registerPush_frontier");
        c809030VoT.LIZ("registerPush_frontier");
        C809810Vpj c809810VpjLIZIZ = C809810Vpj.LIZIZ(context);
        if (c809810VpjLIZIZ.LIZJ == 2) {
            AtomicReference<InterfaceC809850Vpn> atomicReference = c809810VpjLIZIZ.LIZ;
            Context context2 = c809810VpjLIZIZ.LIZIZ;
            String str = c809810VpjLIZIZ.LIZLLL;
            if (C810150VqH.LJ == null) {
                synchronized (C810150VqH.class) {
                    try {
                        if (C810150VqH.LJ == null) {
                            C810150VqH.LJ = new C810150VqH(context2, str);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            atomicReference.set(C810150VqH.LJ);
        }
        InterfaceC809850Vpn interfaceC809850Vpn = c809810VpjLIZIZ.LIZ.get();
        if (interfaceC809850Vpn != null) {
            c809810VpjLIZIZ.LJ = true;
            interfaceC809850Vpn.LIZ(c809810VpjLIZIZ);
        }
        C809030VoT.LJIIJJI().LJ(getFrontierPush());
        c809030VoT.LJ("registerPush_frontier");
        c809030VoT.LIZLLL("registerPush_frontier");
        c809030VoT.LIZIZ("sdk_register_push");
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        C809810Vpj c809810VpjLIZIZ = C809810Vpj.LIZIZ(context);
        c809810VpjLIZIZ.LJ = false;
        if (c809810VpjLIZIZ.LIZ.get() != null) {
            c809810VpjLIZIZ.LIZ.get().LIZIZ();
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW) {
        if (interfaceC809680VpW != null) {
            try {
                interfaceC809680VpW.LIZJ("frontier is not supported", false);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }
}
