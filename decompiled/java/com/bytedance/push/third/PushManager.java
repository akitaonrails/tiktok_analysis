package com.bytedance.push.third;

import X.AbstractC809510VpF;
import X.C2188811AlT;
import X.C808660Vns;
import X.C809030VoT;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809550VpJ;
import X.InterfaceC808670Vnt;
import X.InterfaceC808910VoH;
import X.InterfaceC809530VpH;
import X.InterfaceC809680VpW;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class PushManager implements InterfaceC808910VoH {
    public static volatile PushManager sPushManager;

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                try {
                    if (sPushManager == null) {
                        sPushManager = new PushManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sPushManager;
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestNotificationPermission(int i) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                return interfaceC808910VoHLJII.requestNotificationPermission(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }

    public static void notifyPermissionRequestFailed(InterfaceC809680VpW interfaceC809680VpW, String str) {
        if (interfaceC809680VpW == null) {
            return;
        }
        try {
            interfaceC809680VpW.LIZJ(str, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean checkThirdPushConfig(String str, Context context) {
        Set setKeySet;
        boolean z;
        Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map = C809470VpB.LJIIIIZZ(context).LIZ;
        if (map == null) {
            setKeySet = null;
        } else {
            setKeySet = ((HashMap) map).keySet();
        }
        Iterator it2 = setKeySet.iterator();
        boolean zLIZ = true;
        boolean zCheckThirdPushConfig = true;
        while (true) {
            z = false;
            if (it2.hasNext()) {
                InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(((Integer) it2.next()).intValue());
                if (interfaceC808910VoHLJII != null) {
                    try {
                        zCheckThirdPushConfig &= interfaceC808910VoHLJII.checkThirdPushConfig(str, context);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        zCheckThirdPushConfig = false;
                    }
                }
            } else {
                try {
                    break;
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return z;
                }
            }
        }
        boolean zLIZ2 = C809550VpJ.LIZ(context) & zCheckThirdPushConfig;
        InterfaceC808670Vnt interfaceC808670VntLIZIZ = C808660Vns.LIZJ(context).LIZIZ();
        if (interfaceC808670VntLIZIZ != null) {
            zLIZ = interfaceC808670VntLIZIZ.LIZ();
        }
        z = zLIZ2 & zLIZ;
        return z;
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                return interfaceC808910VoHLJII.isPushAvailable(context, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(Context context, int i) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                C809030VoT.LJIIJJI().LIZIZ(i);
                interfaceC808910VoHLJII.registerPush(context, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                interfaceC808910VoHLJII.unregisterPush(context, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW) {
        Application application = C809360Vp0.LIZ;
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(application).LJII(i);
        if (interfaceC808910VoHLJII == null) {
            notifyPermissionRequestFailed(interfaceC809680VpW, "push adapter is null");
            return false;
        }
        if (!interfaceC808910VoHLJII.isPushAvailable(application, i)) {
            notifyPermissionRequestFailed(interfaceC809680VpW, "push adapter is not available on cur device");
            return false;
        }
        try {
            return interfaceC808910VoHLJII.requestSystemNotificationPermission(str, i, interfaceC809680VpW);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception:");
            sbLIZ.append(th.getMessage());
            notifyPermissionRequestFailed(interfaceC809680VpW, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    @Override // X.InterfaceC808910VoH
    public void setAlias(Context context, String str, int i) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                interfaceC808910VoHLJII.setAlias(context, str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC808910VoH
    public void trackPush(Context context, int i, Object obj) {
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(context).LJII(i);
        if (interfaceC808910VoHLJII != null) {
            try {
                interfaceC808910VoHLJII.trackPush(context, i, obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
