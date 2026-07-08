package com.google.firebase.analytics;

import X.AbstractRunnableC820240WFq;
import X.C0W3J;
import X.C20126213oy;
import X.C818880WAk;
import X.C820210WFn;
import X.C820270WFt;
import X.C835460Wq0;
import X.InterfaceC19816012g2;
import X.InterfaceC812420Vtw;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes14.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics LIZJ;
    public final C820210WFn LIZ;
    public C820270WFt LIZIZ;

    public final String getFirebaseInstanceId() {
        try {
            C818880WAk c818880WAkLIZIZ = C818880WAk.LIZIZ();
            c818880WAkLIZIZ.LIZ();
            return (String) C835460Wq0.LIZIZ(((C20126213oy) c818880WAkLIZIZ.LIZLLL.LIZIZ(InterfaceC812420Vtw.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public FirebaseAnalytics(C820210WFn c820210WFn) {
        C0W3J.LJIIIIZZ(c820210WFn);
        this.LIZ = c820210WFn;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (LIZJ == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new FirebaseAnalytics(C820210WFn.LIZ(context, null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static InterfaceC19816012g2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        final C820210WFn c820210WFnLIZ = C820210WFn.LIZ(context, bundle);
        if (c820210WFnLIZ == null) {
            return null;
        }
        return new InterfaceC19816012g2() { // from class: X.0WGE
            @Override // X.InterfaceC19816012g2
            public final String LIZJ() {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGL
                    public final /* synthetic */ C0WGB LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getCurrentScreenClass(this.LLILZIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = c0wgb;
                        this.LLILZLL = c820210WFn;
                    }
                });
                return c0wgb.LLLLII(500L);
            }

            @Override // X.InterfaceC19816012g2
            public final String LJFF() {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGK
                    public final /* synthetic */ C0WGB LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getCachedAppInstanceId(this.LLILZIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = c0wgb;
                        this.LLILZLL = c820210WFn;
                    }
                });
                return c0wgb.LLLLII(50L);
            }

            @Override // X.InterfaceC19816012g2
            public final String LJI() {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGM
                    public final /* synthetic */ C0WGB LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getCurrentScreenName(this.LLILZIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = c0wgb;
                        this.LLILZLL = c820210WFn;
                    }
                });
                return c0wgb.LLLLII(500L);
            }

            @Override // X.InterfaceC19816012g2
            public final String LJIIJJI() {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGI
                    public final /* synthetic */ C0WGB LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getGmpAppId(this.LLILZIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = c0wgb;
                        this.LLILZLL = c820210WFn;
                    }
                });
                return c0wgb.LLLLII(500L);
            }

            @Override // X.InterfaceC19816012g2
            public final long zza() {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGJ
                    public final /* synthetic */ C0WGB LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.generateEventId(this.LLILZIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = c0wgb;
                        this.LLILZLL = c820210WFn;
                    }
                });
                Long l = (Long) C0WGB.LLLIIL(c0wgb.LLILLIZIL(500L), Long.class);
                if (l != null) {
                    return l.longValue();
                }
                long jNanoTime = System.nanoTime();
                c820210WFn.LIZIZ.getClass();
                long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
                int i = c820210WFn.LJ + 1;
                c820210WFn.LJ = i;
                return jNextLong + ((long) i);
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZIZ(final String str) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str) { // from class: X.0WGP
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.beginAdUnitExposure(this.LLILZIL, this.LLILLJJLI);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = c820210WFn;
                    }
                });
            }

            @Override // X.InterfaceC19816012g2
            public final int LJIIIIZZ(final String str) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str, c0wgb) { // from class: X.0WGG
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ C0WGB LLILZLL;
                    public final /* synthetic */ C820210WFn LLIZ;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLIZ.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getMaxUserProperties(this.LLILZIL, this.LLILZLL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLILZLL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = c0wgb;
                        this.LLIZ = c820210WFn;
                    }
                });
                Integer num = (Integer) C0WGB.LLLIIL(c0wgb.LLILLIZIL(10000L), Integer.class);
                if (num == null) {
                    return 25;
                }
                return num.intValue();
            }

            @Override // X.InterfaceC19816012g2
            public final void LJIIIZ(final String str) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str) { // from class: X.0WGQ
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.endAdUnitExposure(this.LLILZIL, this.LLILLJJLI);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = c820210WFn;
                    }
                });
            }

            @Override // X.InterfaceC19816012g2
            public final void LJJ(final Bundle bundle2) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, bundle2) { // from class: X.0WGN
                    public final /* synthetic */ Bundle LLILZIL;
                    public final /* synthetic */ C820210WFn LLILZLL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.setConditionalUserProperty(this.LLILZIL, this.LL);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = bundle2;
                        this.LLILZLL = c820210WFn;
                    }
                });
            }

            @Override // X.InterfaceC19816012g2
            public final List<Bundle> LJIJ(final String str, final String str2) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str, str2, c0wgb) { // from class: X.0WGH
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ String LLILZLL;
                    public final /* synthetic */ C0WGB LLIZ;
                    public final /* synthetic */ C820210WFn LLIZLLLIL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLIZLLLIL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getConditionalUserProperties(this.LLILZIL, this.LLILZLL, this.LLIZ);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLIZ.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = str2;
                        this.LLIZ = c0wgb;
                        this.LLIZLLLIL = c820210WFn;
                    }
                });
                List<Bundle> list = (List) C0WGB.LLLIIL(c0wgb.LLILLIZIL(Mp4ScreenVideoLoadTimeout.CONTROL), List.class);
                if (list == null) {
                    return Collections.emptyList();
                }
                return list;
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZ(final String str, final String str2, final Bundle bundle2) {
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str, str2, bundle2) { // from class: X.0WGO
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ String LLILZLL;
                    public final /* synthetic */ Bundle LLIZ;
                    public final /* synthetic */ C820210WFn LLIZLLLIL;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLIZLLLIL.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.clearConditionalUserProperty(this.LLILZIL, this.LLILZLL, this.LLIZ);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = str2;
                        this.LLIZ = bundle2;
                        this.LLIZLLLIL = c820210WFn;
                    }
                });
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZLLL(String str, String str2, Bundle bundle2) {
                C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                c820210WFn.LIZIZ(new C820250WFr(c820210WFn, str, str2, bundle2, true));
            }

            @Override // X.InterfaceC19816012g2
            public final Map<String, Object> LJ(final String str, final String str2, final boolean z) {
                Object obj;
                final C820210WFn c820210WFn = c820210WFnLIZ;
                c820210WFn.getClass();
                final C0WGB c0wgb = new C0WGB();
                c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str, str2, z, c0wgb) { // from class: X.0WGF
                    public final /* synthetic */ String LLILZIL;
                    public final /* synthetic */ String LLILZLL;
                    public final /* synthetic */ boolean LLIZ;
                    public final /* synthetic */ C0WGB LLIZLLLIL;
                    public final /* synthetic */ C820210WFn LLJ;

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZ() {
                        InterfaceC820490WGp interfaceC820490WGp = this.LLJ.LJI;
                        C0W3J.LJIIIIZZ(interfaceC820490WGp);
                        interfaceC820490WGp.getUserProperties(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
                    }

                    @Override // X.AbstractRunnableC820240WFq
                    public final void LIZIZ() {
                        this.LLIZLLLIL.LJJ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c820210WFn, true);
                        this.LLILZIL = str;
                        this.LLILZLL = str2;
                        this.LLIZ = z;
                        this.LLIZLLLIL = c0wgb;
                        this.LLJ = c820210WFn;
                    }
                });
                Bundle bundleLLILLIZIL = c0wgb.LLILLIZIL(Mp4ScreenVideoLoadTimeout.CONTROL);
                if (bundleLLILLIZIL != null && bundleLLILLIZIL.size() != 0) {
                    HashMap map = new HashMap(bundleLLILLIZIL.size());
                    for (String str3 : bundleLLILLIZIL.keySet()) {
                        try {
                            obj = bundleLLILLIZIL.get(str3);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj = null;
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        }
                        if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                            map.put(str3, obj);
                        }
                    }
                    return map;
                }
                return Collections.emptyMap();
            }
        };
    }

    public final void setCurrentScreen(final Activity activity, final String str, final String str2) {
        final C820210WFn c820210WFn = this.LIZ;
        c820210WFn.getClass();
        c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, activity, str, str2) { // from class: X.0WGf
            public final /* synthetic */ Activity LLILZIL;
            public final /* synthetic */ String LLILZLL;
            public final /* synthetic */ String LLIZ;
            public final /* synthetic */ C820210WFn LLIZLLLIL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLIZLLLIL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.setCurrentScreen(new C0WH6(this.LLILZIL), this.LLILZLL, this.LLIZ, this.LL);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c820210WFn, true);
                this.LLILZIL = activity;
                this.LLILZLL = str;
                this.LLIZ = str2;
                this.LLIZLLLIL = c820210WFn;
            }
        });
    }
}
