package com.ss.android.ugc.aweme.commercialize.ams.adapter.di;

import X.C04TD;
import X.C0N26;
import X.C0N28;
import X.C0N29;
import X.C1954807lC;
import X.C2263951DjN;
import X.C2263971DjP;
import X.C585280MxS;
import X.C589110N8r;
import X.InterfaceC2258861DbA;
import X.InterfaceC581670Mrd;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContextImpl;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementExperimentModules;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MeasurementContextModulesImpl implements MeasurementContextModules {
    @Override // com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules
    public final BPEAHandler LIZ() {
        return new BPEAHandler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MxS] */
    @Override // com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules
    public final C585280MxS LIZJ() {
        return new InterfaceC581670Mrd() { // from class: X.0MxS
            /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
            @Override // X.InterfaceC581670Mrd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r5, X.C0N23 r6, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit> r7) {
                /*
                    r4 = this;
                    X.01GW r0 = X.C276420AsS.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto Lf
                    return
                Lf:
                    r3 = 0
                    if (r6 == 0) goto L64
                    boolean r0 = r6 instanceof X.C585300MxU
                    if (r0 == 0) goto L4f
                    java.util.Map<X.0N23, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = X.C585270MxR.LIZ
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r0 = r0.get(r6)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                    if (r0 == 0) goto L64
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = X.C587350N1x.LIZIZ(r0)
                L26:
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    r7.invoke(r0)
                    java.lang.String r2 = "draw_ad"
                    if (r1 == 0) goto L46
                    X.0ciu r2 = X.C2184171Adz.LIZLLL(r2, r5, r1)
                L36:
                    java.lang.String r1 = "1"
                    java.lang.String r0 = "ams_also_reported"
                    r2.LIZIZ(r1, r0)
                    java.lang.String r0 = "track_from_ams"
                    r2.LIZIZ(r1, r0)
                    r2.LJIIIIZZ()
                    return
                L46:
                    java.lang.String r1 = "1790"
                    java.lang.String r0 = "0"
                    X.0ciu r2 = X.C2184171Adz.LJ(r2, r5, r1, r3, r0)
                    goto L36
                L4f:
                    boolean r0 = r6 instanceof X.C585310MxV
                    if (r0 == 0) goto L64
                    java.util.Map<X.0N23, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = X.C585290MxT.LIZ
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r0 = r0.get(r6)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                    if (r0 == 0) goto L64
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = X.C587350N1x.LIZIZ(r0)
                    goto L26
                L64:
                    r1 = r3
                    goto L26
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C585280MxS.LIZ(java.lang.String, X.0N23, kotlin.jvm.functions.Function1):void");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules
    public final MeasurementContext LIZLLL() {
        MeasurementExperimentModules.LIZ.getClass();
        if (!C589110N8r.LIZIZ.getValue().LIZJ()) {
            ServiceManager.get().bind(MeasurementContext.class, new ServiceProvider() { // from class: X.0N9M
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return new MeasurementContext() { // from class: X.0N9O
                        @Override // X.C0N27
                        public final void LIZ(C0N26 c0n26, C0N23 c0n23) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LIZIZ(InterfaceC2258681Das interfaceC2258681Das) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LIZJ(String str) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LIZLLL(InterfaceC2258651Dap interfaceC2258651Dap) {
                        }

                        @Override // X.C0N27
                        public final void LJ(C0N29 c0n29, C0N23 c0n23) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LJFF(String str) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LJI(String str) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LJIIIIZZ(String str) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LJIIIZ(InterfaceC2258651Dap interfaceC2258651Dap) {
                        }

                        @Override // X.InterfaceC588960N8c
                        public final void LJIIJJI(InterfaceC2258681Das interfaceC2258681Das) {
                        }

                        @Override // X.InterfaceC583230Mu9
                        public final InterfaceC583240MuA LJII() {
                            return new InterfaceC583240MuA() { // from class: X.0N9P
                                @Override // X.InterfaceC583240MuA
                                public final long LIZ(C0N23 c0n23) {
                                    return 0L;
                                }

                                @Override // X.InterfaceC583240MuA
                                public final int LIZIZ(C0N23 c0n23) {
                                    return 1;
                                }
                            };
                        }

                        @Override // X.InterfaceC583230Mu9
                        public final InterfaceC581670Mrd LJIIJ() {
                            return new InterfaceC581670Mrd() { // from class: X.0N9N
                                @Override // X.InterfaceC581670Mrd
                                public final void LIZ(String str, C0N23 c0n23, Function1<? super Map<String, Object>, Unit> function1) {
                                }
                            };
                        }

                        @Override // X.C0N9Q
                        public final void LJIIL(C0N2B<MeasurementContext> c0n2b) {
                            C589080N8o.LIZLLL(this, null, AFwS195S0000000_9.get$arr$(647));
                        }
                    };
                }
            });
        }
        Object objLIZ = C04TD.LIZ(MeasurementContext.class, false);
        if (objLIZ != null) {
            return (MeasurementContext) objLIZ;
        }
        if (C04TD.LLJJJJJIL == null) {
            synchronized (MeasurementContext.class) {
                if (C04TD.LLJJJJJIL == null) {
                    C04TD.LLJJJJJIL = new MeasurementContextImpl();
                }
            }
        }
        return C04TD.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules
    public final InterfaceC2258861DbA LIZIZ(C0N28 c0n28) {
        if (c0n28 instanceof C0N26) {
            return new C2263951DjN();
        }
        if (c0n28 instanceof C0N29) {
            if (Intrinsics.LJFF(((C0N29) c0n28).LIZ, "general_search_outflow")) {
                return new C2263971DjP();
            }
            return new C2263951DjN();
        }
        throw new C1954807lC();
    }
}
