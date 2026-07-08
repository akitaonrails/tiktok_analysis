package com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service;

import X.C098200Yq;
import X.C0C5P;
import X.C0CUU;
import X.C0CUZ;
import X.C0PEM;
import X.C10R5;
import X.C10RS;
import X.C1514430pVp;
import X.C1552540qVI;
import X.C1768000w6o;
import X.C189200o6;
import X.C1AF0;
import X.C2296808zG;
import X.C23250099c;
import X.C2341109Fh;
import X.C307020C1s;
import X.C314380CUa;
import X.C314410CUd;
import X.C314440CUg;
import X.C340370DVz;
import X.C5182020e;
import X.EnumC314460CUi;
import X.InterfaceC2210981Bg8;
import X.InterfaceC304970BxP;
import X.InterfaceC308020C5o;
import Y.ARunnableS104S0100000_4;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class EcUgNewInstallService implements IEcUgNewInstallService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final Pair<String, String> LIZ() {
        C1552540qVI.LIZ.getClass();
        return C1552540qVI.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final void LIZIZ() {
        C314380CUa.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final boolean LIZJ() {
        C314440CUg.LIZ.getClass();
        return ((Number) C314440CUg.LIZIZ.getValue()).intValue() == 1 || C314440CUg.LIZJ == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final void LIZLLL() {
        Object objLIZLLL;
        C314380CUa.LIZ.getClass();
        if (C307020C1s.LIZ()) {
            return;
        }
        C340370DVz.LIZ.getClass();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Map mapLIZ = C340370DVz.LIZ();
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_force_show_shop_tab_start", mapLIZ);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(5158);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(aFwS190S0000000_4);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C314380CUa.LIZLLL = jElapsedRealtime;
        if (C307020C1s.LIZ()) {
            return;
        }
        try {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            if (C10RS.LIZ().LIZ) {
                C340370DVz.LIZJ(C0CUZ.CHECK_DID, EnumC314460CUi.FAIL, SystemClock.elapsedRealtime() - jElapsedRealtime);
                return;
            }
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || a0.LJJJIL(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                C340370DVz.LIZJ(C0CUZ.CHECK_DID, EnumC314460CUi.WAITING, SystemClock.elapsedRealtime() - jElapsedRealtime);
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0CUV
                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZIZ(String str, String str2) {
                        if (str != null && !a0.LJJJIL(str)) {
                            C314380CUa c314380CUa = C314380CUa.LIZ;
                            long j = jElapsedRealtime;
                            c314380CUa.getClass();
                            C314380CUa.LIZLLL(j, str);
                        }
                    }
                });
                objLIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CUU(jElapsedRealtime, null), 3);
            } else {
                C340370DVz.LIZJ(C0CUZ.CHECK_DID, EnumC314460CUi.PASS, SystemClock.elapsedRealtime() - jElapsedRealtime);
                C314380CUa.LIZ(jElapsedRealtime);
                objLIZLLL = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objLIZLLL);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0CUd] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final void LJ() {
        C314380CUa.LIZ.getClass();
        try {
            if (C1514430pVp.LIZLLL().booleanValue()) {
                C10R5 c10r5 = C10R5.LJIIIIZZ;
                if (C10RS.LIZ().LIZ || C314380CUa.LJIIJJI != null || C307020C1s.LIZ()) {
                    return;
                }
                C314380CUa.LJIIJJI = new InterfaceC308020C5o() { // from class: X.0CUd
                    @Override // X.InterfaceC308020C5o
                    public final void LIZ(C307980C5k c307980C5k) {
                        try {
                            n nVar = c307980C5k.LIZ;
                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                            AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(5255);
                            c2341109Fh.getClass();
                            C2341109Fh.LJFF(aFwS190S0000000_4);
                            if (nVar != null && C1514430pVp.LIZLLL().booleanValue()) {
                                C10R5 c10r52 = C10R5.LJIIIIZZ;
                                if (!C10RS.LIZ().LIZ && !C307020C1s.LIZ()) {
                                    try {
                                        C823050WQl.LIZJ().execute(new ARunnableS104S0100000_4(nVar, 144));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                            C5182020e c5182020e = new C5182020e(th2, 559);
                            c2341109Fh2.getClass();
                            C2341109Fh.LIZLLL(c5182020e);
                        }
                    }
                };
                C314410CUd c314410CUd = C314380CUa.LJIIJJI;
                if (c314410CUd != null) {
                    C0C5P c0c5pLIZJ = C0C5P.LIZJ();
                    synchronized (c0c5pLIZJ.LJI) {
                        try {
                            ((HashSet) c0c5pLIZJ.LJI).add(c314410CUd);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(5257);
                c2341109Fh.getClass();
                C2341109Fh.LJFF(aFwS190S0000000_4);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            C5182020e c5182020e = new C5182020e(th2, 560);
            c2341109Fh2.getClass();
            C2341109Fh.LIZLLL(c5182020e);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final void LJFF(final String str) {
        C1552540qVI.LIZ.getClass();
        if (!C1552540qVI.LIZIZ) {
            C1552540qVI.LIZIZ = true;
            try {
                C1552540qVI.LIZLLL(true);
                C0C5P.LIZJ().LJIIJJI("tt_is_ug_shoptab_new", new InterfaceC304970BxP() { // from class: X.0CUh
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
                    @Override // X.InterfaceC304970BxP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            r6 = this;
                            X.0CUg r0 = X.C314440CUg.LIZ
                            r0.getClass()
                            X.0C64 r2 = X.C0C64.LJIILLIIL()
                            r1 = 31744(0x7c00, float:4.4483E-41)
                            r0 = 0
                            java.lang.String r4 = "tt_is_ug_shoptab_new"
                            int r0 = r2.LJIJ(r1, r0, r4, r0)
                            X.C314440CUg.LIZJ = r0
                            X.01GW r0 = X.C314440CUg.LIZIZ
                            java.lang.Object r0 = r0.getValue()
                            java.lang.Number r0 = (java.lang.Number) r0
                            int r0 = r0.intValue()
                            r5 = 1
                            if (r0 == r5) goto L29
                            int r0 = X.C314440CUg.LIZJ
                            if (r0 == r5) goto L29
                            return
                        L29:
                            r3 = 0
                            X.C1552540qVI.LIZJ = r3
                            X.0mCc r0 = X.C1906580ziK.LJ()
                            if (r0 == 0) goto L99
                            android.app.Activity r0 = r0.LIZIZ()
                            if (r0 == 0) goto L99
                            android.app.Activity r2 = X.C1388190mED.LIZ(r0)
                        L3c:
                            boolean r0 = r2 instanceof X.C19EG
                            if (r0 == 0) goto L94
                            X.19EG r2 = (X.C19EG) r2
                            X.0Q7z r1 = X.C1558360qeg.LJI(r2, r3)
                            java.lang.Class<com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility> r0 = com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility.class
                            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
                            com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility r0 = (com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility) r0
                            if (r0 == 0) goto L94
                            boolean r0 = r0.RY0()
                            if (r0 != r5) goto L94
                            X.0qVI r1 = X.C1552540qVI.LIZ
                            java.lang.String r0 = r1
                            r1.getClass()
                            X.C1552540qVI.LIZ(r2, r0)
                        L60:
                            X.0C5P r0 = X.C0C5P.LIZJ()
                            r0.LJIJ(r4, r6)
                            X.0DVz r0 = X.C340370DVz.LIZ
                            r0.getClass()
                            X.0w6o r3 = X.C1768000w6o.LIZ
                            java.util.HashMap r2 = new java.util.HashMap
                            r2.<init>()
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService> r0 = com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService.class
                            java.lang.Object r0 = r1.getService(r0)
                            com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService r0 = (com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService) r0
                            java.lang.String r1 = r0.LJJIFFI()
                            java.lang.String r0 = "enter_from"
                            r2.put(r0, r1)
                            r3.getClass()
                            X.C1768000w6o.LIZ(r2)
                            java.lang.String r0 = "rd_tiktokec_ug_allowlist_success"
                            X.C1768000w6o.LIZIZ(r0, r2)
                            return
                        L94:
                            java.lang.String r0 = r1
                            X.C1552540qVI.LIZJ = r0
                            goto L60
                        L99:
                            r2 = r3
                            goto L3c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C314450CUh.LIZ():void");
                    }
                });
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && !a0.LJJJIL(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                    C1552540qVI.LJ();
                } else {
                    DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0CUf
                        public final AtomicBoolean LL = new AtomicBoolean(false);

                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZ(boolean z) {
                        }

                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZJ(boolean z) {
                        }

                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZIZ(String str2, String str3) {
                            if (str2 != null && !a0.LJJJIL(str2) && this.LL.compareAndSet(false, true)) {
                                C1552540qVI.LIZ.getClass();
                                C1552540qVI.LJ();
                            }
                        }
                    });
                }
                C1552540qVI.LIZJ(str);
                CommonFeedLaunchServiceImpl.LJ().LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
