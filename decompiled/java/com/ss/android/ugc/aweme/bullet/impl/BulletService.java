package com.ss.android.ugc.aweme.bullet.impl;

import X.AbstractC20109813mK;
import X.C0TKJ;
import X.C1253204vK;
import X.C1298790ju1;
import X.C1300770jxD;
import X.C1310410kCl;
import X.C1336210ksN;
import X.C15O7;
import X.C1697810uHb;
import X.C1943207jK;
import X.C1D4O;
import X.C20111313mZ;
import X.C20112713mn;
import X.C20113513mv;
import X.C20113813my;
import X.C2188308hl;
import X.C844470XAv;
import X.InterfaceC1310400kCk;
import X.InterfaceC1888607aW;
import X.InterfaceC1888707aX;
import X.InterfaceC20108913mB;
import X.InterfaceC20112313mj;
import X.InterfaceC20113013mq;
import X.InterfaceC20113413mu;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.app.launch.TaskServiceImpl;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class BulletService implements IBulletService {
    public static void LJII() {
        final List listLJIIJJI = C1697810uHb.LJIIJJI("gecko_hybrid_prefetch_config", "fe_tiktok_ecommerce_affiliate_prefetch", "resso-tt-lynx_full_song");
        InterfaceC1888607aW interfaceC1888607aW = new InterfaceC1888607aW(listLJIIJJI) { // from class: X.08EQ
            public final Collection<String> LIZ;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0087
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // X.InterfaceC1888607aW
            public final java.util.List<java.lang.String> LIZ() {
                /*
                    r8 = this;
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Collection<java.lang.String> r0 = r8.LIZ
                    java.util.Iterator r7 = r0.iterator()
                Lb:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto Lac
                    java.lang.Object r1 = r7.next()
                    java.lang.String r1 = (java.lang.String) r1
                    long r5 = java.lang.System.nanoTime()
                    r3 = 0
                    java.lang.String r0 = X.C1553670qX7.LIZ()     // Catch: java.lang.Throwable -> L95
                    java.lang.String r2 = X.C1552050qUV.LJ(r0, r1)     // Catch: java.lang.Throwable -> L95
                    boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L95
                    if (r0 != 0) goto L9b
                    X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L95
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L95
                    boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L95
                    if (r0 == 0) goto L9b
                    java.io.File[] r0 = r1.listFiles()     // Catch: java.lang.Throwable -> L95
                    if (r0 == 0) goto L9b
                    java.io.File[] r0 = r1.listFiles()     // Catch: java.lang.Throwable -> L95
                    int r0 = r0.length     // Catch: java.lang.Throwable -> L95
                    if (r0 != 0) goto L43
                    goto L45
                L43:
                    r0 = 0
                    goto L46
                L45:
                    r0 = 1
                L46:
                    if (r0 != 0) goto L9b
                    X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Throwable -> L95
                    java.lang.String r0 = "prefetch.json"
                    r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L95
                    boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L95
                    if (r0 == 0) goto L9b
                    X.0VSP r1 = new X.0VSP     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    r1.<init>(r0)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    if (r0 == 0) goto L6c
                    java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    goto L74
                L6c:
                    java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    r0 = 8192(0x2000, float:1.148E-41)
                    r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    r2 = r1
                L74:
                    java.lang.String r0 = X.C08KC.LIZJ(r2)     // Catch: java.lang.Throwable -> L7c
                    X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    goto L9a
                L7c:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L81
                    throw r1     // Catch: java.lang.Throwable -> L87
                L81:
                    r0 = move-exception
                    r1 = r3
                L83:
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
                    goto L89
                L87:
                    r0 = move-exception
                    goto L83
                L89:
                    X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                    throw r0     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L95
                L8d:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L95
                    X.C2344809Gs.LJI(r0)     // Catch: java.lang.Throwable -> L95
                    goto L9b
                L95:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    goto L9b
                L9a:
                    r3 = r0
                L9b:
                    java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r0 = java.lang.System.nanoTime()
                    long r0 = r0 - r5
                    r2.toMillis(r0)
                    if (r3 == 0) goto Lb
                    r4.add(r3)
                    goto Lb
                Lac:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C08EQ.LIZ():java.util.List");
            }

            {
                this.LIZ = listLJIIJJI;
            }
        };
        C20113513mv c20113513mv = new Object() { // from class: X.13mv
        };
        final List listSingletonList = Collections.singletonList(interfaceC1888607aW);
        c20113513mv.getClass();
        AbstractC20109813mK<C20111313mZ> abstractC20109813mK = new AbstractC20109813mK<C20111313mZ>() { // from class: X.13mU
            @Override // X.AbstractC20109813mK
            public final AbstractC20111213mY LIZIZ(String str, C20110313mP c20110313mP, C20110013mM c20110013mM) {
                C20111313mZ c20111313mZ = new C20111313mZ(str, c20110313mP, c20110013mM);
                if (Intrinsics.LJFF(str, "default_business")) {
                    C20111313mZ.LIZIZ = c20111313mZ;
                }
                return c20111313mZ;
            }
        };
        abstractC20109813mK.LJII = 32;
        C844470XAv.LIZ.getClass();
        abstractC20109813mK.LIZ = new C0TKJ(C844470XAv.LIZ(), "bullet_prefetch_store");
        abstractC20109813mK.LIZLLL = new InterfaceC1888707aX() { // from class: X.07aV
            @Override // X.InterfaceC1888707aX
            public final List<String> LIZ() {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(((InterfaceC1888607aW) it2.next()).LIZ());
                }
                return arrayList;
            }
        };
        abstractC20109813mK.LJFF = new InterfaceC20112313mj() { // from class: X.13mr
            @Override // X.InterfaceC20112313mj
            public final void LIZ() {
            }

            @Override // X.InterfaceC20112313mj
            public final void LIZIZ() {
            }
        };
        abstractC20109813mK.LJ = new InterfaceC20108913mB() { // from class: X.13ms
            @Override // X.InterfaceC20108913mB
            public final void LIZ() {
            }

            @Override // X.InterfaceC20108913mB
            public final void LIZIZ() {
            }
        };
        abstractC20109813mK.LIZJ = new C2188308hl();
        abstractC20109813mK.LIZIZ = C15O7.LJI;
        C20113813my.LIZIZ().LIZJ(InterfaceC20113413mu.class, new C20112713mn(abstractC20109813mK.LIZ()));
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void LIZIZ() {
        LynxEnv.inst().setCheckPropsSetter(false);
        C1298790ju1.LIZ();
        C1300770jxD.LIZ.LIZ();
        LynxEnv.inst().lazyInitIfNeeded();
        if (C1336210ksN.LIZ()) {
            try {
                LynxEnv.inst().forceDisableQuickJsCache();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LJI()) {
            return;
        }
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final boolean LJI() {
        return TaskServiceImpl.LIZLLL().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void LJ() {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void LIZJ(Context context) {
        if (!C1253204vK.LIZ()) {
            C1310410kCl.LIZ = new InterfaceC1310400kCk() { // from class: X.13mp
                @Override // X.InterfaceC1310400kCk
                public final void init() {
                    C1BX5.LIZIZ.LJIIJJI(false);
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void LIZ(Context context, String str) {
        LIZLLL(context, str, null, null);
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final boolean LJFF(Context context, String str) {
        InterfaceC20113013mq interfaceC20113013mq = (InterfaceC20113013mq) C20113813my.LIZIZ().LIZIZ(InterfaceC20113013mq.class);
        if (interfaceC20113013mq != null) {
            return interfaceC20113013mq.close();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void open(Context context, String str, Bundle bundle) {
        LIZLLL(context, str, null, bundle);
    }

    @Override // com.ss.android.ugc.aweme.spark.bullet.IBulletService
    public final void LIZLLL(Context context, String str, String str2, Bundle bundle) {
        Uri uriBuild = UriProtector.parse(str);
        if (!UriProtector.getQueryParameterNames(uriBuild).contains("use_spark") && C1D4O.LIZIZ(str)) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("use_spark", "1").build();
        }
        if (bundle != null && bundle.containsKey("dataflowId")) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C1943207jK.LIZ(uriBuild).toString());
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRouter.buildRoute(context, C1943207jK.LIZ(uriBuild).toString()).open();
    }
}
