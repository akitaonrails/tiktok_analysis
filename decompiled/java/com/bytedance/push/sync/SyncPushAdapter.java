package com.bytedance.push.sync;

import X.C809030VoT;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809830Vpl;
import X.C809900Vps;
import X.InterfaceC596980NbE;
import X.InterfaceC808910VoH;
import X.InterfaceC809680VpW;
import android.content.Context;
import android.util.Log;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.sync.SyncPushAdapter;
import com.bytedance.sync.SyncSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class SyncPushAdapter implements InterfaceC808910VoH {
    public static int SYNC_PUSH = -1;

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

    public static int getSyncPush() {
        if (SYNC_PUSH == -1) {
            SYNC_PUSH = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZIZ(SyncPushAdapter.class.getName());
        }
        return SYNC_PUSH;
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        C809830Vpl.LIZIZ(context).getClass();
        try {
            Class.forName("com.bytedance.sync.SyncSDK");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(Context context, int i) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZJ("registerPush_SyncPush");
        c809030VoT.LIZ("registerPush_SyncPush");
        final C809830Vpl c809830VplLIZIZ = C809830Vpl.LIZIZ(context);
        c809830VplLIZIZ.getClass();
        try {
            C809900Vps c809900Vps = new C809900Vps(21L);
            ((ArrayList) c809900Vps.LIZIZ).add(new InterfaceC596980NbE() { // from class: X.0Vpk
                @Override // X.InterfaceC596980NbE
                public final void LJ(C1525630pnt c1525630pnt) {
                    boolean zLJI = MethodIDManager.LJI(137712);
                    C809830Vpl.LIZIZ(c809830VplLIZIZ.LIZIZ).getClass();
                    boolean zLJI2 = MethodIDManager.LJI(137712);
                    try {
                        InterfaceC808560Vni interfaceC808560VniLJIILJJIL = C809030VoT.LJIILJJIL();
                        C808680Vnu c808680Vnu = (C808680Vnu) interfaceC808560VniLJIILJJIL;
                        c808680Vnu.LJ(SyncPushAdapter.getSyncPush(), new String(c1525630pnt.LIZ), null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
            });
            c809830VplLIZIZ.LIZ = SyncSDK.registerBusiness(c809900Vps.LIZ());
            C809030VoT.LJIIJJI().LJ(getSyncPush());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809030VoT.LJIIJJI().LJIIIIZZ(getSyncPush(), -1, "-1", Log.getStackTraceString(th));
        }
        C809030VoT c809030VoT2 = C809030VoT.LJIIJ;
        c809030VoT2.LJ("registerPush_SyncPush");
        c809030VoT2.LIZLLL("registerPush_SyncPush");
        c809030VoT2.LIZIZ("sdk_register_push");
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        C809830Vpl c809830VplLIZIZ = C809830Vpl.LIZIZ(context);
        c809830VplLIZIZ.getClass();
        try {
            c809830VplLIZIZ.LIZ.remove();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW) {
        if (interfaceC809680VpW != null) {
            try {
                interfaceC809680VpW.LIZJ("sync is not supported", false);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }
}
