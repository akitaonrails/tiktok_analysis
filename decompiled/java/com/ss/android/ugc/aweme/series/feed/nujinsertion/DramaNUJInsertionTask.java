package com.ss.android.ugc.aweme.series.feed.nujinsertion;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C1514430pVp;
import X.C1577320r9G;
import X.C1577380r9M;
import X.C622680Oba;
import X.EnumC1577400r9O;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaNUJInsertionTask implements C0CCZ, InterfaceC799590VYf {
    public final C1577380r9M LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DramaNUJInsertionTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public DramaNUJInsertionTask(C1577380r9M c1577380r9M) {
        this.LL = c1577380r9M;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        final C1577380r9M c1577380r9M = this.LL;
        c1577380r9M.getClass();
        if (C1514430pVp.LIZLLL().booleanValue()) {
            C1577320r9G c1577320r9G = C1577320r9G.LIZ;
            boolean zLJJIL = C104100aN.LIZ().LJJIL();
            c1577320r9G.getClass();
            EnumC1577400r9O enumC1577400r9O = EnumC1577400r9O.FLOW_STARTED;
            C1577320r9G.LJII = zLJJIL;
            C1577320r9G.LIZIZ = System.currentTimeMillis();
            C1577320r9G.LIZIZ(c1577320r9G, enumC1577400r9O, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286);
            c1577380r9M.LIZ.LIZ(c1577380r9M.LJII);
            C622680Oba.LIZJ(c1577380r9M);
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() != 0) {
                c1577380r9M.LJFF = System.currentTimeMillis() - C1577320r9G.LIZIZ;
            } else {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0r9S
                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZIZ(String str, String str2) {
                        c1577380r9M.LIZJ();
                        C1577380r9M c1577380r9M2 = c1577380r9M;
                        C1577320r9G c1577320r9G2 = C1577320r9G.LIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c1577320r9G2.getClass();
                        c1577380r9M2.LJFF = jCurrentTimeMillis - C1577320r9G.LIZIZ;
                    }
                });
            }
            c1577380r9M.LIZJ();
        }
    }
}
