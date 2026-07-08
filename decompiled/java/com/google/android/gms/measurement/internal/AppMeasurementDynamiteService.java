package com.google.android.gms.measurement.internal;

import X.AbstractBinderC820500WGq;
import X.C0W3J;
import X.C0WA3;
import X.C0WH0;
import X.C0WH6;
import X.C19803112dx;
import X.C19804412eA;
import X.C19804712eD;
import X.C19805012eG;
import X.C19805112eH;
import X.C19810112f5;
import X.C19811512fJ;
import X.C19811612fK;
import X.C19811912fN;
import X.C19817012gC;
import X.C19820112gh;
import X.C786410Ut5;
import X.C830490Whz;
import X.InterfaceC19804212e8;
import X.InterfaceC19812412fS;
import X.InterfaceC19813012fY;
import X.InterfaceC19813312fb;
import X.InterfaceC820590WGz;
import X.RunnableC741840T8c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes31.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC820500WGq {
    public C19804712eD LL;
    public final C830490Whz LLILLJJLI = new C830490Whz();

    public final void LLILLIZIL() {
        if (this.LL == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // X.InterfaceC820490WGp
    public void clearMeasurementEnabled(long j) {
        LLILLIZIL();
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIJJI();
        c19804412eALJIILIIL.LJIIL().LJIILL(new RunnableC741840T8c(c19804412eALJIILIIL, null));
    }

    @Override // X.InterfaceC820490WGp
    public void generateEventId(InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        long jLJL = this.LL.LJIILLIIL().LJL();
        LLILLIZIL();
        this.LL.LJIILLIIL().LJJIIJ(interfaceC19804212e8, jLJL);
    }

    @Override // X.InterfaceC820490WGp
    public void getAppInstanceId(final InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12es
            public final /* synthetic */ AppMeasurementDynamiteService LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzh@9678.run");
                try {
                    final C19804512eB c19804512eBLJIILL = this.LLILLJJLI.LL.LJIILL();
                    final InterfaceC19804212e8 interfaceC19804212e82 = interfaceC19804212e8;
                    c19804512eBLJIILL.LJ();
                    c19804512eBLJIILL.LJIIJJI();
                    final zzn zznVarLJJIIZ = c19804512eBLJIILL.LJJIIZ(false);
                    c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12eX
                        public final void LIZ() {
                            try {
                                try {
                                    if (!c19804512eBLJIILL.LIZIZ().LJIJJLI().LJIJI()) {
                                        c19804512eBLJIILL.LJIILJJIL().LJIIJ.LIZJ("Analytics storage consent denied; will not get app instance id");
                                        c19804512eBLJIILL.LJII().LJJJI(null);
                                        c19804512eBLJIILL.LIZIZ().LJII.LIZIZ(null);
                                        c19804512eBLJIILL.LIZJ().LJJIJIIJIL(null, interfaceC19804212e82);
                                        return;
                                    }
                                    C19804512eB c19804512eB = c19804512eBLJIILL;
                                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                                    if (interfaceC19802012dm == null) {
                                        c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to get app instance id");
                                        c19804512eBLJIILL.LIZJ().LJJIJIIJIL(null, interfaceC19804212e82);
                                        return;
                                    }
                                    C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                    String strN = interfaceC19802012dm.n(zznVarLJJIIZ);
                                    if (strN != null) {
                                        c19804512eBLJIILL.LJII().LJJJI(strN);
                                        c19804512eBLJIILL.LIZIZ().LJII.LIZIZ(strN);
                                    }
                                    c19804512eBLJIILL.LJJIIJZLJL();
                                    c19804512eBLJIILL.LIZJ().LJJIJIIJIL(strN, interfaceC19804212e82);
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZ(e, "Failed to get app instance id");
                                    c19804512eBLJIILL.LIZJ().LJJIJIIJIL(null, interfaceC19804212e82);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c19804512eBLJIILL.LIZJ().LJJIJIIJIL(null, interfaceC19804212e82);
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("zzll@3981.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("zzll@3981.run");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzh@9678.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void getCachedAppInstanceId(InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        LLLIIL(this.LL.LJIILIIL().LJI.get(), interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void getCurrentScreenClass(InterfaceC19804212e8 interfaceC19804212e8) {
        String str;
        LLILLIZIL();
        C19804712eD c19804712eD = this.LL.LJIILIIL().LIZ;
        C19804712eD.LIZJ(c19804712eD.LJIILJJIL);
        C19811512fJ c19811512fJ = c19804712eD.LJIILJJIL.LIZJ;
        if (c19811512fJ != null) {
            str = c19811512fJ.LIZIZ;
        } else {
            str = null;
        }
        LLLIIL(str, interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void getCurrentScreenName(InterfaceC19804212e8 interfaceC19804212e8) {
        String str;
        LLILLIZIL();
        C19804712eD c19804712eD = this.LL.LJIILIIL().LIZ;
        C19804712eD.LIZJ(c19804712eD.LJIILJJIL);
        C19811512fJ c19811512fJ = c19804712eD.LJIILJJIL.LIZJ;
        if (c19811512fJ != null) {
            str = c19811512fJ.LIZ;
        } else {
            str = null;
        }
        LLLIIL(str, interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void getGmpAppId(InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        C19804712eD c19804712eD = c19804412eALJIILIIL.LIZ;
        String strLIZIZ = c19804712eD.LIZIZ;
        if (strLIZIZ == null) {
            try {
                strLIZIZ = new C0WA3(c19804712eD.LIZ, c19804712eD.LJIJ).LIZIZ("google_app_id");
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                c19804412eALJIILIIL.LIZ.LJIILJJIL().LJFF.LIZ(e, "getGoogleAppId failed with exception");
                strLIZIZ = null;
            }
        }
        LLLIIL(strLIZIZ, interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void getSessionId(final InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12eU
            public final void LIZ() {
                Long lValueOf;
                C19809512ez c19809512ezLJIIJ = c19804412eALJIILIIL.LJIIJ();
                if (c19809512ezLJIIJ.LIZIZ().LJIJJLI().LJIJI()) {
                    C19804812eE c19804812eELIZIZ = c19809512ezLJIIJ.LIZIZ();
                    c19809512ezLJIIJ.LIZ.LJIILIIL.getClass();
                    if (!c19804812eELIZIZ.LJIIJJI(System.currentTimeMillis()) && c19809512ezLJIIJ.LIZIZ().LJIIZILJ.LIZ() != 0 && (lValueOf = Long.valueOf(c19809512ezLJIIJ.LIZIZ().LJIIZILJ.LIZ())) != null) {
                        c19804412eALJIILIIL.LIZ.LJIILLIIL().LJJIIJ(interfaceC19804212e8, lValueOf.longValue());
                        return;
                    }
                } else {
                    c19809512ezLJIIJ.LJIILJJIL().LJIIJ.LIZJ("Analytics storage consent denied; will not get session id");
                }
                try {
                    interfaceC19804212e8.LJJ(null);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c19804412eALJIILIIL.LIZ.LJIILJJIL().LJFF.LIZ(e, "getSessionId failed with exception");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzkb@3958.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzkb@3958.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void initForTests(Map map) {
        LLILLIZIL();
    }

    @Override // X.InterfaceC820490WGp
    public void isDataCollectionEnabled(final InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12e7
            public final /* synthetic */ AppMeasurementDynamiteService LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzm@967d.run");
                try {
                    C19803112dx c19803112dxLJIILLIIL = this.LLILLJJLI.LL.LJIILLIIL();
                    InterfaceC19804212e8 interfaceC19804212e82 = interfaceC19804212e8;
                    C19804712eD c19804712eD = this.LLILLJJLI.LL;
                    c19803112dxLJIILLIIL.LJJIIZI(interfaceC19804212e82, c19804712eD.LJJII != null && c19804712eD.LJJII.booleanValue());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzm@967d.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void registerOnMeasurementEventListener(InterfaceC19812412fS interfaceC19812412fS) {
        Object c19810112f5;
        LLILLIZIL();
        synchronized (this.LLILLJJLI) {
            try {
                c19810112f5 = (InterfaceC19813012fY) this.LLILLJJLI.get(Integer.valueOf(interfaceC19812412fS.zza()));
                if (c19810112f5 == null) {
                    c19810112f5 = new C19810112f5(this, interfaceC19812412fS);
                    this.LLILLJJLI.put(Integer.valueOf(interfaceC19812412fS.zza()), c19810112f5);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIJJI();
        if (!((CopyOnWriteArraySet) c19804412eALJIILIIL.LJ).add(c19810112f5)) {
            c19804412eALJIILIIL.LJIILJJIL().LJIIIIZZ.LIZJ("OnEventListener already registered");
        }
    }

    @Override // X.InterfaceC820490WGp
    public void resetAnalyticsData(final long j) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJJJI(null);
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12f1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzju@394c.run");
                try {
                    c19804412eALJIILIIL.LJIJI(j, true);
                    c19804412eALJIILIIL.LJIIIZ().LJIJI(new AtomicReference<>());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzju@394c.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setDataCollectionEnabled(final boolean z) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIJJI();
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12dX
            /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r5 = this;
                    X.12eA r0 = r1
                    X.12eD r0 = r0.LIZ
                    boolean r4 = r0.LJFF()
                    X.12eA r0 = r1
                    X.12eD r1 = r0.LIZ
                    java.lang.Boolean r0 = r1.LJJII
                    r3 = 1
                    if (r0 == 0) goto L84
                    java.lang.Boolean r0 = r1.LJJII
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L84
                    r2 = 1
                L1a:
                    X.12eA r0 = r1
                    X.12eD r1 = r0.LIZ
                    boolean r0 = r2
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.LJJII = r0
                    boolean r0 = r2
                    if (r2 != r0) goto L3f
                    X.12eA r0 = r1
                    X.12eD r0 = r0.LIZ
                    X.12eS r0 = r0.LJIILJJIL()
                    X.12fK r2 = r0.LJIILIIL
                    boolean r0 = r2
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    java.lang.String r0 = "Default data collection state already set to"
                    r2.LIZ(r1, r0)
                L3f:
                    X.12eA r0 = r1
                    X.12eD r0 = r0.LIZ
                    boolean r0 = r0.LJFF()
                    if (r0 == r4) goto L63
                    X.12eA r0 = r1
                    X.12eD r0 = r0.LIZ
                    boolean r2 = r0.LJFF()
                    X.12eA r0 = r1
                    X.12eD r1 = r0.LIZ
                    java.lang.Boolean r0 = r1.LJJII
                    if (r0 == 0) goto L82
                    java.lang.Boolean r0 = r1.LJJII
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L82
                L61:
                    if (r2 == r3) goto L7c
                L63:
                    X.12eA r0 = r1
                    X.12eD r0 = r0.LIZ
                    X.12eS r0 = r0.LJIILJJIL()
                    X.12fK r3 = r0.LJIIJ
                    boolean r0 = r2
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                    java.lang.String r0 = "Default data collection is different than actual status"
                    r3.LIZIZ(r2, r0, r1)
                L7c:
                    X.12eA r0 = r1
                    r0.LJJIZ()
                    return
                L82:
                    r3 = 0
                    goto L61
                L84:
                    r2 = 0
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC19800512dX.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjn@3945.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjn@3945.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        if (bundle == null) {
            bundle2 = null;
        } else {
            c19804412eALJIILIIL.getClass();
            bundle2 = new Bundle(bundle);
        }
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12dw
            public final void LIZ() {
                C19804412eA c19804412eA = c19804412eALJIILIIL;
                Bundle bundle3 = bundle2;
                if (bundle3 == null) {
                    c19804412eA.LIZIZ().LJJIFFI.LIZIZ(new Bundle());
                    return;
                }
                Bundle bundleLIZ = c19804412eA.LIZIZ().LJJIFFI.LIZ();
                for (String str : bundle3.keySet()) {
                    Object objLJIILLIIL = C19804412eA.LJIILLIIL(bundle3, str);
                    if (objLJIILLIIL != null && !(objLJIILLIIL instanceof String) && !(objLJIILLIIL instanceof Long) && !(objLJIILLIIL instanceof Double)) {
                        c19804412eA.LIZJ();
                        if (C19803112dx.LJJJJIZL(objLJIILLIIL)) {
                            c19804412eA.LIZJ();
                            C19803112dx.LJJIL(c19804412eA.LJIJJ, null, 27, null, null, 0);
                        }
                        c19804412eA.LJIILJJIL().LJIIJ.LIZIZ(str, "Invalid default event parameter type. Name, value", objLJIILLIIL);
                    } else if (C19803112dx.LJJLIL(str)) {
                        c19804412eA.LJIILJJIL().LJIIJ.LIZ(str, "Invalid default event parameter name. Name");
                    } else if (objLJIILLIIL == null) {
                        bundleLIZ.remove(str);
                    } else if (c19804412eA.LIZJ().LJJJIL(c19804412eA.LIZ.LJI.LJII(null, false), "param", str, objLJIILLIIL)) {
                        c19804412eA.LIZJ().LJJII(bundleLIZ, str, objLJIILLIIL);
                    }
                }
                c19804412eA.LIZJ();
                int i = c19804412eA.LIZ.LJI.LIZJ().LJJJJZ(201500000) ? 100 : 25;
                if (bundleLIZ.size() > i) {
                    int i2 = 0;
                    for (String str2 : new TreeSet(bundleLIZ.keySet())) {
                        i2++;
                        if (i2 > i) {
                            bundleLIZ.remove(str2);
                        }
                    }
                    c19804412eA.LIZJ();
                    C19803112dx.LJJIL(c19804412eA.LJIJJ, null, 26, null, null, 0);
                    c19804412eA.LJIILJJIL().LJIIJ.LIZJ("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                c19804412eA.LIZIZ().LJJIFFI.LIZIZ(bundleLIZ);
                C19804512eB c19804512eBLJIIIZ = c19804412eA.LJIIIZ();
                c19804512eBLJIIIZ.LJ();
                c19804512eBLJIIIZ.LJIIJJI();
                c19804512eBLJIIIZ.LJIIZILJ(new RunnableC19802212do(c19804512eBLJIIIZ, c19804512eBLJIIIZ.LJJIIZ(false), bundleLIZ));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjc@393a.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjc@393a.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setEventInterceptor(InterfaceC19812412fS interfaceC19812412fS) {
        boolean z;
        LLILLIZIL();
        final C19811912fN c19811912fN = new C19811912fN(this, interfaceC19812412fS);
        if (this.LL.LJIIL().LJIIZILJ()) {
            C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
            c19804412eALJIILIIL.LJ();
            c19804412eALJIILIIL.LJIIJJI();
            InterfaceC19813312fb interfaceC19813312fb = c19804412eALJIILIIL.LIZLLL;
            if (c19811912fN != interfaceC19813312fb) {
                if (interfaceC19813312fb == null) {
                    z = true;
                } else {
                    z = false;
                }
                C0W3J.LJIIJ("EventInterceptor already set.", z);
            }
            c19804412eALJIILIIL.LIZLLL = c19811912fN;
            return;
        }
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12et
            public final /* synthetic */ AppMeasurementDynamiteService LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                InterfaceC19813312fb interfaceC19813312fb2;
                C1C7U.LIZ("zzl@967c.run");
                try {
                    C19804412eA c19804412eALJIILIIL2 = this.LLILLJJLI.LL.LJIILIIL();
                    C19811912fN c19811912fN2 = c19811912fN;
                    c19804412eALJIILIIL2.LJ();
                    c19804412eALJIILIIL2.LJIIJJI();
                    if (c19811912fN2 != null && c19811912fN2 != (interfaceC19813312fb2 = c19804412eALJIILIIL2.LIZLLL)) {
                        C0W3J.LJIIJ("EventInterceptor already set.", interfaceC19813312fb2 == null);
                    }
                    c19804412eALJIILIIL2.LIZLLL = c19811912fN2;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzl@967c.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setInstanceIdProvider(C0WH0 c0wh0) {
        LLILLIZIL();
    }

    @Override // X.InterfaceC820490WGp
    public void setMinimumSessionDuration(long j) {
        LLILLIZIL();
    }

    @Override // X.InterfaceC820490WGp
    public void setSessionTimeoutDuration(final long j) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12dW
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjp@3947.run");
                try {
                    c19804412eALJIILIIL.LIZIZ().LJIIJJI.LIZIZ(j);
                    c19804412eALJIILIIL.LJIILJJIL().LJIIL.LIZ(Long.valueOf(j), "Session timeout duration set");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjp@3947.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setSgtmDebugInfo(Intent intent) {
        LLILLIZIL();
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.getClass();
        if (C19820112gh.LIZ() && c19804412eALJIILIIL.LIZ.LJI.LJIJI(null, C19817012gC.LJJZZI)) {
            Uri data = intent.getData();
            if (data == null) {
                c19804412eALJIILIIL.LJIILJJIL().LJIIJJI.LIZJ("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "sgtm_debug_enable");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.equals("1")) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "sgtm_preview_key");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    return;
                }
                c19804412eALJIILIIL.LJIILJJIL().LJIIJJI.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
                c19804412eALJIILIIL.LIZ.LJI.LIZJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                return;
            }
            c19804412eALJIILIIL.LJIILJJIL().LJIIJJI.LIZJ("Preview Mode was not enabled.");
            c19804412eALJIILIIL.LIZ.LJI.LIZJ = null;
        }
    }

    @Override // X.InterfaceC820490WGp
    public void unregisterOnMeasurementEventListener(InterfaceC19812412fS interfaceC19812412fS) {
        Object c19810112f5;
        LLILLIZIL();
        synchronized (this.LLILLJJLI) {
            try {
                c19810112f5 = (InterfaceC19813012fY) this.LLILLJJLI.remove(Integer.valueOf(interfaceC19812412fS.zza()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c19810112f5 == null) {
            c19810112f5 = new C19810112f5(this, interfaceC19812412fS);
        }
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIJJI();
        if (!((CopyOnWriteArraySet) c19804412eALJIILIIL.LJ).remove(c19810112f5)) {
            c19804412eALJIILIIL.LJIILJJIL().LJIIIIZZ.LIZJ("OnEventListener had not been registered");
        }
    }

    public final void LLLIIL(String str, InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIILLIIL().LJJIJIIJIL(str, interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void beginAdUnitExposure(String str, long j) {
        LLILLIZIL();
        this.LL.LJIIIIZZ().LJIILIIL(j, str);
    }

    @Override // X.InterfaceC820490WGp
    public void endAdUnitExposure(String str, long j) {
        LLILLIZIL();
        this.LL.LJIIIIZZ().LJIJI(j, str);
    }

    @Override // X.InterfaceC820490WGp
    public void getMaxUserProperties(String str, InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIILIIL();
        C0W3J.LJI(str);
        LLILLIZIL();
        this.LL.LJIILLIIL().LJJIII(interfaceC19804212e8, 25);
    }

    @Override // X.InterfaceC820490WGp
    public void getTestFlag(InterfaceC19804212e8 interfaceC19804212e8, int i) {
        LLILLIZIL();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C19803112dx c19803112dxLJIILLIIL = this.LL.LJIILLIIL();
                            final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
                            c19804412eALJIILIIL.getClass();
                            final AtomicReference atomicReference = new AtomicReference();
                            c19803112dxLJIILLIIL.LJJIIZI(interfaceC19804212e8, ((Boolean) c19804412eALJIILIIL.LJIIL().LJIIIIZZ(atomicReference, 15000L, "boolean test flag value", new Runnable() { // from class: X.12eg
                                public final void LIZ() {
                                    synchronized (atomicReference) {
                                        try {
                                            try {
                                                AtomicReference atomicReference2 = atomicReference;
                                                C19804412eA c19804412eA = c19804412eALJIILIIL;
                                                C19791812c8 c19791812c8 = c19804412eA.LIZ.LJI;
                                                String strLJIILLIIL = c19804412eA.LJFF().LJIILLIIL();
                                                c19791812c8.getClass();
                                                atomicReference2.set(Boolean.valueOf(c19791812c8.LJIJI(strLJIILLIIL, C19817012gC.LJJIJLIJ)));
                                                atomicReference.notify();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                atomicReference.notify();
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("zzjj@3941.run");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("zzjj@3941.run");
                                }
                            })).booleanValue());
                            return;
                        }
                        return;
                    }
                    C19803112dx c19803112dxLJIILLIIL2 = this.LL.LJIILLIIL();
                    final C19804412eA c19804412eALJIILIIL2 = this.LL.LJIILIIL();
                    c19804412eALJIILIIL2.getClass();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    c19803112dxLJIILLIIL2.LJJIII(interfaceC19804212e8, ((Integer) c19804412eALJIILIIL2.LJIIL().LJIIIIZZ(atomicReference2, 15000L, "int test flag value", new Runnable() { // from class: X.12ee
                        public final void LIZ() {
                            synchronized (atomicReference2) {
                                try {
                                    try {
                                        AtomicReference atomicReference3 = atomicReference2;
                                        C19804412eA c19804412eA = c19804412eALJIILIIL2;
                                        atomicReference3.set(Integer.valueOf(c19804412eA.LIZ.LJI.LJIIIZ(c19804412eA.LJFF().LJIILLIIL(), C19817012gC.LJJJ)));
                                        atomicReference2.notify();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        atomicReference2.notify();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzkc@3959.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzkc@3959.run");
                        }
                    })).intValue());
                    return;
                }
                C19803112dx c19803112dxLJIILLIIL3 = this.LL.LJIILLIIL();
                final C19804412eA c19804412eALJIILIIL3 = this.LL.LJIILIIL();
                c19804412eALJIILIIL3.getClass();
                final AtomicReference atomicReference3 = new AtomicReference();
                double dDoubleValue = ((Double) c19804412eALJIILIIL3.LJIIL().LJIIIIZZ(atomicReference3, 15000L, "double test flag value", new Runnable() { // from class: X.12ed
                    public final void LIZ() {
                        synchronized (atomicReference3) {
                            try {
                                try {
                                    AtomicReference atomicReference4 = atomicReference3;
                                    C19804412eA c19804412eA = c19804412eALJIILIIL3;
                                    atomicReference4.set(Double.valueOf(c19804412eA.LIZ.LJI.LJFF(c19804412eA.LJFF().LJIILLIIL(), C19817012gC.LJJJI)));
                                    atomicReference3.notify();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    atomicReference3.notify();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzkf@395c.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzkf@395c.run");
                    }
                })).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", dDoubleValue);
                try {
                    interfaceC19804212e8.LJJ(bundle);
                    return;
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c19803112dxLJIILLIIL3.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning double value to wrapper");
                    return;
                }
            }
            C19803112dx c19803112dxLJIILLIIL4 = this.LL.LJIILLIIL();
            final C19804412eA c19804412eALJIILIIL4 = this.LL.LJIILIIL();
            c19804412eALJIILIIL4.getClass();
            final AtomicReference atomicReference4 = new AtomicReference();
            c19803112dxLJIILLIIL4.LJJIIJ(interfaceC19804212e8, ((Long) c19804412eALJIILIIL4.LJIIL().LJIIIIZZ(atomicReference4, 15000L, "long test flag value", new Runnable() { // from class: X.12ef
                public final void LIZ() {
                    synchronized (atomicReference4) {
                        try {
                            try {
                                AtomicReference atomicReference5 = atomicReference4;
                                C19804412eA c19804412eA = c19804412eALJIILIIL4;
                                atomicReference5.set(Long.valueOf(c19804412eA.LIZ.LJI.LJIIJJI(c19804412eA.LJFF().LJIILLIIL(), C19817012gC.LJJIZ)));
                                atomicReference4.notify();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                atomicReference4.notify();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzkd@395a.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzkd@395a.run");
                }
            })).longValue());
            return;
        }
        C19803112dx c19803112dxLJIILLIIL5 = this.LL.LJIILLIIL();
        final C19804412eA c19804412eALJIILIIL5 = this.LL.LJIILIIL();
        c19804412eALJIILIIL5.getClass();
        final AtomicReference atomicReference5 = new AtomicReference();
        c19803112dxLJIILLIIL5.LJJIJIIJIL((String) c19804412eALJIILIIL5.LJIIL().LJIIIIZZ(atomicReference5, 15000L, "String test flag value", new Runnable() { // from class: X.12em
            public final void LIZ() {
                synchronized (atomicReference5) {
                    try {
                        try {
                            AtomicReference atomicReference6 = atomicReference5;
                            C19804412eA c19804412eA = c19804412eALJIILIIL5;
                            C19791812c8 c19791812c8 = c19804412eA.LIZ.LJI;
                            String strLJIILLIIL = c19804412eA.LJFF().LJIILLIIL();
                            c19791812c8.getClass();
                            atomicReference6.set(c19791812c8.LJIILIIL(strLJIILLIIL, C19817012gC.LJJIL));
                            atomicReference5.notify();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            atomicReference5.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjs@394a.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjs@394a.run");
            }
        }), interfaceC19804212e8);
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityDestroyed(InterfaceC820590WGz interfaceC820590WGz, long j) {
        LLILLIZIL();
        C19805112eH c19805112eH = this.LL.LJIILIIL().LIZJ;
        if (c19805112eH != null) {
            this.LL.LJIILIIL().LJJIJIL();
            c19805112eH.onActivityDestroyed((Activity) C0WH6.LLLIIL(interfaceC820590WGz));
        }
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityPaused(InterfaceC820590WGz interfaceC820590WGz, long j) {
        LLILLIZIL();
        C19805112eH c19805112eH = this.LL.LJIILIIL().LIZJ;
        if (c19805112eH != null) {
            this.LL.LJIILIIL().LJJIJIL();
            c19805112eH.onActivityPaused((Activity) C0WH6.LLLIIL(interfaceC820590WGz));
        }
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityResumed(InterfaceC820590WGz interfaceC820590WGz, long j) {
        LLILLIZIL();
        C19805112eH c19805112eH = this.LL.LJIILIIL().LIZJ;
        if (c19805112eH != null) {
            this.LL.LJIILIIL().LJJIJIL();
            c19805112eH.onActivityResumed((Activity) C0WH6.LLLIIL(interfaceC820590WGz));
        }
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityStarted(InterfaceC820590WGz interfaceC820590WGz, long j) {
        LLILLIZIL();
        if (this.LL.LJIILIIL().LIZJ != null) {
            this.LL.LJIILIIL().LJJIJIL();
            C0WH6.LLLIIL(interfaceC820590WGz);
        }
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityStopped(InterfaceC820590WGz interfaceC820590WGz, long j) {
        LLILLIZIL();
        if (this.LL.LJIILIIL().LIZJ != null) {
            this.LL.LJIILIIL().LJJIJIL();
            C0WH6.LLLIIL(interfaceC820590WGz);
        }
    }

    @Override // X.InterfaceC820490WGp
    public void setConditionalUserProperty(Bundle bundle, long j) {
        LLILLIZIL();
        if (bundle == null) {
            this.LL.LJIILJJIL().LJFF.LIZJ("Conditional user property must not be null");
        } else {
            this.LL.LJIILIIL().LJJJ(j, bundle);
        }
    }

    @Override // X.InterfaceC820490WGp
    public void setConsent(final Bundle bundle, final long j) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        c19804412eALJIILIIL.LJIIL().LJIILLIIL(new Runnable() { // from class: X.12er
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjf@393d.run");
                try {
                    C19804412eA c19804412eA = c19804412eALJIILIIL;
                    Bundle bundle2 = bundle;
                    long j2 = j;
                    if (TextUtils.isEmpty(c19804412eA.LJFF().LJIIZILJ())) {
                        c19804412eA.LJIJJ(bundle2, 0, j2);
                    } else {
                        c19804412eA.LJIILJJIL().LJIIJ.LIZJ("Using developer consent only; google app id found");
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjf@393d.run");
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setConsentThirdParty(Bundle bundle, long j) {
        LLILLIZIL();
        this.LL.LJIILIIL().LJIJJ(bundle, -20, j);
    }

    @Override // X.InterfaceC820490WGp
    public void setMeasurementEnabled(boolean z, long j) {
        LLILLIZIL();
        C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        Boolean boolValueOf = Boolean.valueOf(z);
        c19804412eALJIILIIL.LJIIJJI();
        c19804412eALJIILIIL.LJIIL().LJIILL(new RunnableC741840T8c(c19804412eALJIILIIL, boolValueOf));
    }

    @Override // X.InterfaceC820490WGp
    public void setUserId(final String str, long j) {
        LLILLIZIL();
        final C19804412eA c19804412eALJIILIIL = this.LL.LJIILIIL();
        if (str != null) {
            c19804412eALJIILIIL.getClass();
            if (TextUtils.isEmpty(str)) {
                c19804412eALJIILIIL.LIZ.LJIILJJIL().LJIIIIZZ.LIZJ("User ID must be non-empty or null");
                return;
            }
        }
        c19804412eALJIILIIL.LJIIL().LJIILL(new Runnable() { // from class: X.12f6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjg@393e.run");
                try {
                    C19804412eA c19804412eA = c19804412eALJIILIIL;
                    String str2 = str;
                    C19804912eF c19804912eFLJFF = c19804412eA.LJFF();
                    String str3 = c19804912eFLJFF.LJIILL;
                    boolean z = (str3 == null || str3.equals(str2)) ? false : true;
                    c19804912eFLJFF.LJIILL = str2;
                    if (z) {
                        c19804412eA.LJFF().LJIJI();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjg@393e.run");
            }
        });
        c19804412eALJIILIIL.LJJII(null, "_id", str, true, j);
    }

    @Override // X.InterfaceC820490WGp
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        LLILLIZIL();
        this.LL.LJIILIIL().LJJ(str, str2, bundle);
    }

    @Override // X.InterfaceC820490WGp
    public void getConditionalUserProperties(final String str, final String str2, final InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12e6
            public final /* synthetic */ AppMeasurementDynamiteService LLILZ;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzk@967b.run");
                try {
                    final C19804512eB c19804512eBLJIILL = this.LLILZ.LL.LJIILL();
                    final InterfaceC19804212e8 interfaceC19804212e82 = interfaceC19804212e8;
                    final String str3 = str;
                    final String str4 = str2;
                    c19804512eBLJIILL.LJ();
                    c19804512eBLJIILL.LJIIJJI();
                    final zzn zznVarLJJIIZ = c19804512eBLJIILL.LJJIIZ(false);
                    c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12e0
                        public final void LIZ() {
                            ArrayList<Bundle> arrayList = new ArrayList<>();
                            try {
                                try {
                                    C19804512eB c19804512eB = c19804512eBLJIILL;
                                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                                    if (interfaceC19802012dm == null) {
                                        c19804512eB.LJIILJJIL().LJFF.LIZIZ(str3, "Failed to get conditional properties; not connected to service", str4);
                                        c19804512eBLJIILL.LIZJ().LJJIIZ(interfaceC19804212e82, arrayList);
                                    } else {
                                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                        ArrayList<Bundle> arrayListLJJJZ = C19803112dx.LJJJZ(interfaceC19802012dm.LLJLILLLLZIIL(str3, str4, zznVarLJJIIZ));
                                        c19804512eBLJIILL.LJJIIJZLJL();
                                        c19804512eBLJIILL.LIZJ().LJJIIZ(interfaceC19804212e82, arrayListLJJJZ);
                                    }
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZLLL("Failed to get conditional properties; remote exception", str3, str4, e);
                                    c19804512eBLJIILL.LIZJ().LJJIIZ(interfaceC19804212e82, arrayList);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c19804512eBLJIILL.LIZJ().LJJIIZ(interfaceC19804212e82, arrayList);
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("zzlu@398a.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("zzlu@398a.run");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzk@967b.run");
            }

            {
                this.LLILZ = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void initialize(InterfaceC820590WGz interfaceC820590WGz, zzdl zzdlVar, long j) {
        C19804712eD c19804712eD = this.LL;
        if (c19804712eD == null) {
            Context context = (Context) C0WH6.LLLIIL(interfaceC820590WGz);
            C0W3J.LJIIIIZZ(context);
            this.LL = C19804712eD.LIZIZ(context, zzdlVar, Long.valueOf(j));
            return;
        }
        c19804712eD.LJIILJJIL().LJIIIIZZ.LIZJ("Attempting to initialize multiple times");
    }

    @Override // X.InterfaceC820490WGp
    public void onActivityCreated(InterfaceC820590WGz interfaceC820590WGz, Bundle bundle, long j) {
        LLILLIZIL();
        C19805112eH c19805112eH = this.LL.LJIILIIL().LIZJ;
        if (c19805112eH != null) {
            this.LL.LJIILIIL().LJJIJIL();
            c19805112eH.onActivityCreated((Activity) C0WH6.LLLIIL(interfaceC820590WGz), bundle);
        }
    }

    @Override // X.InterfaceC820490WGp
    public void onActivitySaveInstanceState(InterfaceC820590WGz interfaceC820590WGz, InterfaceC19804212e8 interfaceC19804212e8, long j) {
        LLILLIZIL();
        C19805112eH c19805112eH = this.LL.LJIILIIL().LIZJ;
        Bundle bundle = new Bundle();
        if (c19805112eH != null) {
            this.LL.LJIILIIL().LJJIJIL();
            c19805112eH.onActivitySaveInstanceState((Activity) C0WH6.LLLIIL(interfaceC820590WGz), bundle);
        }
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // X.InterfaceC820490WGp
    public void performAction(Bundle bundle, InterfaceC19804212e8 interfaceC19804212e8, long j) {
        LLILLIZIL();
        interfaceC19804212e8.LJJ(null);
    }

    @Override // X.InterfaceC820490WGp
    public void getUserProperties(final String str, final String str2, final boolean z, final InterfaceC19804212e8 interfaceC19804212e8) {
        LLILLIZIL();
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12e5
            public final /* synthetic */ AppMeasurementDynamiteService LLILZIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzi@9679.run");
                try {
                    final C19804512eB c19804512eBLJIILL = this.LLILZIL.LL.LJIILL();
                    final InterfaceC19804212e8 interfaceC19804212e82 = interfaceC19804212e8;
                    final String str3 = str;
                    final String str4 = str2;
                    final boolean z2 = z;
                    c19804512eBLJIILL.LJ();
                    c19804512eBLJIILL.LJIIJJI();
                    final zzn zznVarLJJIIZ = c19804512eBLJIILL.LJJIIZ(false);
                    c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12e1
                        public final void LIZ() {
                            Bundle bundle = new Bundle();
                            try {
                                try {
                                    C19804512eB c19804512eB = c19804512eBLJIILL;
                                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                                    if (interfaceC19802012dm == null) {
                                        c19804512eB.LJIILJJIL().LJFF.LIZIZ(str3, "Failed to get user properties; not connected to service", str4);
                                        c19804512eBLJIILL.LIZJ().LJJIIJZLJL(interfaceC19804212e82, bundle);
                                    } else {
                                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                        Bundle bundleLJIJI = C19803112dx.LJIJI(interfaceC19802012dm.LLLLLLLLLL(str3, str4, z2, zznVarLJJIIZ));
                                        c19804512eBLJIILL.LJJIIJZLJL();
                                        c19804512eBLJIILL.LIZJ().LJJIIJZLJL(interfaceC19804212e82, bundleLJIJI);
                                    }
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZIZ(str3, "Failed to get user properties; remote exception", e);
                                    c19804512eBLJIILL.LIZJ().LJJIIJZLJL(interfaceC19804212e82, bundle);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c19804512eBLJIILL.LIZJ().LJJIIJZLJL(interfaceC19804212e82, bundle);
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("zzlf@397b.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("zzlf@397b.run");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzi@9679.run");
            }

            {
                this.LLILZIL = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void setCurrentScreen(InterfaceC820590WGz interfaceC820590WGz, String str, String str2, long j) {
        String str3;
        LLILLIZIL();
        C19804712eD c19804712eD = this.LL;
        C19804712eD.LIZJ(c19804712eD.LJIILJJIL);
        C19805012eG c19805012eG = c19804712eD.LJIILJJIL;
        Activity activity = (Activity) C0WH6.LLLIIL(interfaceC820590WGz);
        if (!c19805012eG.LIZ.LJI.LJIL()) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZJ("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C19811512fJ c19811512fJ = c19805012eG.LIZJ;
        if (c19811512fJ == null) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZJ("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (((ConcurrentHashMap) c19805012eG.LJFF).get(activity) == null) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZJ("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c19805012eG.LJIILLIIL(activity.getClass());
        }
        boolean zEquals = Objects.equals(c19811512fJ.LIZIZ, str2);
        boolean zEquals2 = Objects.equals(c19811512fJ.LIZ, str);
        if (zEquals && zEquals2) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZJ("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c19805012eG.LIZ.LJI.LJII(null, false))) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZ(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c19805012eG.LIZ.LJI.LJII(null, false))) {
            c19805012eG.LJIILJJIL().LJIIJ.LIZ(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        C19811612fK c19811612fK = c19805012eG.LJIILJJIL().LJIILIIL;
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        c19811612fK.LIZIZ(str3, "Setting current screen to name, class", str2);
        C19811512fJ c19811512fJ2 = new C19811512fJ(str, str2, c19805012eG.LIZJ().LJL());
        ((ConcurrentHashMap) c19805012eG.LJFF).put(activity, c19811512fJ2);
        c19805012eG.LJIJJ(activity, c19811512fJ2, true);
    }

    @Override // X.InterfaceC820490WGp
    public void logEventAndBundle(final String str, String str2, Bundle bundle, final InterfaceC19804212e8 interfaceC19804212e8, long j) {
        Bundle bundle2;
        LLILLIZIL();
        C0W3J.LJI(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        C786410Ut5.LJJJI("_o", "app", bundle2);
        final zzbf zzbfVar = new zzbf(str2, new zzba(bundle), "app", j);
        this.LL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12e3
            public final /* synthetic */ AppMeasurementDynamiteService LLILZ;

            public final void LIZ() {
                final C19804512eB c19804512eBLJIILL = this.LLILZ.LL.LJIILL();
                final InterfaceC19804212e8 interfaceC19804212e82 = interfaceC19804212e8;
                final zzbf zzbfVar2 = zzbfVar;
                final String str3 = str;
                c19804512eBLJIILL.LJ();
                c19804512eBLJIILL.LJIIJJI();
                C19803112dx c19803112dxLIZJ = c19804512eBLJIILL.LIZJ();
                c19803112dxLIZJ.getClass();
                if (C829100Wfk.getInstance().isGooglePlayServicesAvailable(c19803112dxLIZJ.LIZ.LIZ, 12451000) == 0) {
                    c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12e2
                        public final void LIZ() {
                            try {
                                try {
                                    C19804512eB c19804512eB = c19804512eBLJIILL;
                                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                                    if (interfaceC19802012dm == null) {
                                        c19804512eB.LJIILJJIL().LJFF.LIZJ("Discarding data. Failed to send event to service to bundle");
                                        c19804512eBLJIILL.LIZJ().LJJIJ(interfaceC19804212e82, null);
                                    } else {
                                        byte[] bArrF1 = interfaceC19802012dm.f1(zzbfVar2, str3);
                                        c19804512eBLJIILL.LJJIIJZLJL();
                                        c19804512eBLJIILL.LIZJ().LJJIJ(interfaceC19804212e82, bArrF1);
                                    }
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZ(e, "Failed to send event to the service to bundle");
                                    c19804512eBLJIILL.LIZJ().LJJIJ(interfaceC19804212e82, null);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c19804512eBLJIILL.LIZJ().LJJIJ(interfaceC19804212e82, null);
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzlo@3984.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzlo@3984.run");
                        }
                    });
                } else {
                    c19804512eBLJIILL.LJIILJJIL().LJIIIIZZ.LIZJ("Not bundling data. Service unavailable or out of date");
                    c19804512eBLJIILL.LIZJ().LJJIJ(interfaceC19804212e82, new byte[0]);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzj@967a.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzj@967a.run");
            }

            {
                this.LLILZ = this;
            }
        });
    }

    @Override // X.InterfaceC820490WGp
    public void logHealthData(int i, String str, InterfaceC820590WGz interfaceC820590WGz, InterfaceC820590WGz interfaceC820590WGz2, InterfaceC820590WGz interfaceC820590WGz3) {
        Object objLLLIIL;
        Object objLLLIIL2;
        LLILLIZIL();
        Object objLLLIIL3 = null;
        if (interfaceC820590WGz == null) {
            objLLLIIL = null;
        } else {
            objLLLIIL = C0WH6.LLLIIL(interfaceC820590WGz);
        }
        if (interfaceC820590WGz2 == null) {
            objLLLIIL2 = null;
        } else {
            objLLLIIL2 = C0WH6.LLLIIL(interfaceC820590WGz2);
        }
        if (interfaceC820590WGz3 != null) {
            objLLLIIL3 = C0WH6.LLLIIL(interfaceC820590WGz3);
        }
        this.LL.LJIILJJIL().LJIIJJI(i, true, false, str, objLLLIIL, objLLLIIL2, objLLLIIL3);
    }

    @Override // X.InterfaceC820490WGp
    public void setUserProperty(String str, String str2, InterfaceC820590WGz interfaceC820590WGz, boolean z, long j) {
        LLILLIZIL();
        this.LL.LJIILIIL().LJJII(str, str2, C0WH6.LLLIIL(interfaceC820590WGz), z, j);
    }

    @Override // X.InterfaceC820490WGp
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        LLILLIZIL();
        this.LL.LJIILIIL().LJJI(str, str2, bundle, z, z2, j);
    }
}
