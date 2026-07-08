package com.ss.android.ugc.aweme.ecommerce.ug.popup.service;

import X.AbstractC1547260qMm;
import X.C1524200pla;
import X.C1697810uHb;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgSparkInterceptorsProvider implements IEComHybridSparkInterceptorService {
    public final List<AbstractC1547260qMm> LIZ = C1697810uHb.LJIIJJI(new AbstractC1547260qMm() { // from class: X.0vNw
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            if (str != null && !a0.LJJJIL(str)) {
                try {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(UriProtector.parse(str), "delay_load_mall_tab"));
                    if (numLJIIJJI != null) {
                        if (numLJIIJJI.intValue() != 0) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String url;
            if (routeIntent != null) {
                url = routeIntent.getUrl();
            } else {
                url = null;
            }
            return matchInterceptRules(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x0001, B:5:0x0026, B:7:0x002c, B:9:0x0032, B:11:0x003a, B:15:0x004f, B:17:0x005d, B:12:0x0043), top: B:32:0x0001 }] */
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleSparkContext(final com.bytedance.hybrid.spark.SparkContext r5, java.lang.String r6) {
            /*
                r4 = this;
                r2 = 0
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r3 = X.C1740090vNn.LIZ     // Catch: java.lang.Throwable -> L66
                java.lang.String r1 = r5.containerId     // Catch: java.lang.Throwable -> L66
                X.0vNo r0 = X.EnumC1740100vNo.UNCOMPLETED     // Catch: java.lang.Throwable -> L66
                int r0 = r0.getValue()     // Catch: java.lang.Throwable -> L66
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L66
                r3.put(r1, r0)     // Catch: java.lang.Throwable -> L66
                java.lang.String r0 = r5.LJIJI()     // Catch: java.lang.Throwable -> L66
                android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L66
                java.lang.String r0 = "delay_load_mall_tab"
                java.lang.String r0 = X.AnonymousClass0185.LJ(r1, r0)     // Catch: java.lang.Throwable -> L66
                java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L43
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L43
            L2c:
                java.lang.String r1 = r1.getAuthority()     // Catch: java.lang.Throwable -> L66
                if (r1 == 0) goto L4f
                java.lang.String r0 = "_popup"
                boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r2)     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L4f
                X.0vNv r0 = new X.0vNv     // Catch: java.lang.Throwable -> L66
                r0.<init>()     // Catch: java.lang.Throwable -> L66
                r5.LJJLIIIJJIZ(r0)     // Catch: java.lang.Throwable -> L66
                goto L6a
            L43:
                X.0vO4 r0 = X.C1740260vO4.LIZ     // Catch: java.lang.Throwable -> L66
                r0.getClass()     // Catch: java.lang.Throwable -> L66
                boolean r0 = X.C1740260vO4.LIZJ(r1)     // Catch: java.lang.Throwable -> L66
                if (r0 != 0) goto L2c
                goto L6a
            L4f:
                X.0vNx r0 = new X.0vNx     // Catch: java.lang.Throwable -> L66
                r0.<init>()     // Catch: java.lang.Throwable -> L66
                r5.LJJLIIIJJI(r0)     // Catch: java.lang.Throwable -> L66
                boolean r0 = X.C2190461Ao8.LIZIZ()     // Catch: java.lang.Throwable -> L66
                if (r0 != 0) goto L6a
                X.0vNy r0 = new X.0vNy     // Catch: java.lang.Throwable -> L66
                r0.<init>()     // Catch: java.lang.Throwable -> L66
                r5.LJJLIIIJL(r0)     // Catch: java.lang.Throwable -> L66
                goto L6a
            L66:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L6a:
                X.0vNz r0 = new X.0vNz
                r0.<init>()
                r5.absSendEventListener = r0
                java.lang.String r0 = r5.LJIJI()     // Catch: java.lang.Throwable -> L94
                android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L94
                java.lang.String r0 = "after_landing_draw"
                java.lang.String r0 = X.AnonymousClass0185.LJ(r1, r0)     // Catch: java.lang.Throwable -> L94
                java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)     // Catch: java.lang.Throwable -> L94
                if (r0 == 0) goto L98
                int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L94
                if (r1 <= 0) goto L98
                X.0vNs r0 = new X.0vNs
                r0.<init>()
                r5.LJJJJZ(r0)
                return
            L94:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L98:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1740180vNw.handleSparkContext(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
        }
    }, new C1524200pla());

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZIZ() {
        return Collections.singletonList(new AbstractC1547260qMm() { // from class: X.0vMn
            @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final boolean matchInterceptRules(String str) {
                Object c098200Yq;
                if (str != null) {
                    try {
                        c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "enable_ug_native_prefetch");
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    return Intrinsics.LJFF(c098200Yq, "1");
                }
                return false;
            }

            @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final boolean matchInterceptRules(RouteIntent routeIntent) {
                String url;
                if (routeIntent != null) {
                    url = routeIntent.getUrl();
                } else {
                    url = null;
                }
                return matchInterceptRules(url);
            }

            @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final void handleSparkContext(SparkContext sparkContext, String str) {
                String strLIZ;
                super.handleSparkContext(sparkContext, str);
                if (!C1739770vNH.LIZIZ(str)) {
                    return;
                }
                if (C1739770vNH.LIZLLL(str)) {
                    strLIZ = C1739770vNH.LIZ(str);
                } else {
                    strLIZ = str;
                }
                String strLJFF = C1739770vNH.LJFF(strLIZ);
                if (!Intrinsics.LJFF(strLJFF, str)) {
                    sparkContext.LJJLIIJ(strLJFF);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZ() {
        return this.LIZ;
    }
}
